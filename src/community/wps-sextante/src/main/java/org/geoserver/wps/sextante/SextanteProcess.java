/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wps.sextante;

import static org.geoserver.wps.sextante.SextanteProcessFactory.*;

import es.unex.sextante.core.AnalysisExtent;
import es.unex.sextante.core.GeoAlgorithm;
import es.unex.sextante.core.ITaskMonitor;
import es.unex.sextante.core.OutputObjectsSet;
import es.unex.sextante.core.ParametersSet;
import es.unex.sextante.dataObjects.IDataObject;
import es.unex.sextante.exceptions.GeoAlgorithmExecutionException;
import es.unex.sextante.outputs.Output;
import es.unex.sextante.outputs.OutputRasterLayer;
import es.unex.sextante.parameters.Parameter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.geotools.util.logging.Logging;
import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.data.DataUtilities;
import org.geotools.api.data.FeatureSource;
import org.geotools.feature.FeatureCollection;
import org.geotools.process.Process;
import org.locationtech.jts.geom.Envelope;
import org.geotools.api.util.ProgressListener;

public class SextanteProcess implements Process {
    static final Logger LOGGER = Logging.getLogger(SextanteProcess.class);
    private GeoAlgorithm m_Algorithm;

    /**
     * Constructs a new process based on a SEXTANTE geoalgorithm
     *
     * @param algorithm the SEXTANTE geoalgorithm
     */
    public SextanteProcess(GeoAlgorithm algorithm) {

        m_Algorithm = algorithm;
    }

    public Map<String, Object> execute(Map<String, Object> input, ProgressListener monitor) {

        ITaskMonitor taskMonitor = new ProgressListenerTaskMonitor(monitor);

        try {
            setAlgorithmInputs(input);

            /*
             * Execute the algorithm
             * The output factory tells the algorithm how to create
             * new data objects (layers and tables)
             * Since we are working with GeoTools , we use the
             * GTOutputFactory, which creates objects based on geotools
             * data objects (DataStore and GridCoverage)
             */

            if (m_Algorithm.execute(taskMonitor, new GTOutputFactory())) {
                return createReturnMapFromOutputObjects();
            } else {
                // if the execution was canceled, we return null
                return null;
            }

        } catch (GeoAlgorithmExecutionException e) {
            LOGGER.log(Level.WARNING, "", e);
            return null;
        }
    }

    /**
     * Creates a suitable return map for this process from the outputs generated by the SEXTANTE
     * algorithm
     *
     * @return a map with algorithm results
     */
    private Map<String, Object> createReturnMapFromOutputObjects() {
        try {
            Map<String, Object> results = new HashMap<String, Object>();

            OutputObjectsSet outputs = m_Algorithm.getOutputObjects();
            for (int i = 0; i < outputs.getOutputObjectsCount(); i++) {
                Output output = outputs.getOutput(i);
                Object outputObject = output.getOutputObject();
                // if the output object is a layer or a table, we return
                // the inner GeoTools object
                if (outputObject instanceof IDataObject) {
                    IDataObject dataObject = (IDataObject) outputObject;
                    Object wrapped = dataObject.getBaseDataObject();
                    if (wrapped instanceof FeatureSource) {
                        results.put(output.getName(), ((FeatureSource) wrapped).getFeatures());
                    } else if (wrapped instanceof GridCoverage2D) {
                        results.put(output.getName(), wrapped);
                    } else {
                        results.put(output.getName(), wrapped);
                    }

                } else {
                    results.put(output.getName(), outputObject);
                }
            }
            return results;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /**
     * Sets the input of the SEXTANTE algorithm from the input map of this process
     *
     * @param input the input map of this process
     */
    private void setAlgorithmInputs(Map<String, Object> input)
            throws GeoAlgorithmExecutionException {

        // set the normal parameters
        ParametersSet paramSet = (ParametersSet) m_Algorithm.getParameters();
        boolean gridExtendRequired = false;
        for (String sKey : input.keySet()) {
            if (SEXTANTE_GRID_CELL_SIZE.equals(sKey) || SEXTANTE_GRID_ENVELOPE.equals(sKey)) {
                // these two parameters we made up to expose the GridExtent, we'll deal with them
                // later
                continue;
            }
            Object paramValue = input.get(sKey);
            Parameter param = paramSet.getParameter(sKey);
            if (paramValue instanceof FeatureCollection) {
                GTVectorLayer layer = new GTVectorLayer();
                layer.create(DataUtilities.source((FeatureCollection) paramValue));
                param.setParameterValue(layer);
            } else if (paramValue instanceof GridCoverage2D) {
                GTRasterLayer layer = new GTRasterLayer();
                gridExtendRequired = true;
                layer.create(paramValue);
                param.setParameterValue(layer);
            } else {
                param.setParameterValue(paramValue);
            }
        }

        // check the outputs as well for raster data
        OutputObjectsSet outputs = m_Algorithm.getOutputObjects();
        for (int i = 0; i < outputs.getOutputObjectsCount(); i++) {
            Output output = outputs.getOutput(i);
            if (output instanceof OutputRasterLayer) {
                gridExtendRequired = true;
            }
        }

        // handle the grid extent if necessary
        if (gridExtendRequired) {
            // get the cell size
            double cellSize = Double.NaN;
            if (input.get(SEXTANTE_GRID_CELL_SIZE) != null) {
                cellSize = (Double) input.get(SEXTANTE_GRID_CELL_SIZE);
            } else {
                for (String sKey : input.keySet()) {
                    Object value = paramSet.getParameter(sKey).getParameterValueAsObject();
                    if (value instanceof GTRasterLayer) {
                        cellSize = ((GTRasterLayer) value).getLayerCellSize();
                        return;
                    }
                }
            }
            if (Double.isNaN(cellSize)) {
                throw new GeoAlgorithmExecutionException(
                        SEXTANTE_GRID_CELL_SIZE
                                + " parameter could not be derived from inputs, and is not available among ");
            }

            // get the extents
            Envelope envelope = null;
            if (input.get(SEXTANTE_GRID_ENVELOPE) != null) {
                envelope = (Envelope) input.get(SEXTANTE_GRID_ENVELOPE);
            } else {
                for (String sKey : input.keySet()) {
                    Object value = paramSet.getParameter(sKey).getParameterValueAsObject();
                    if (value instanceof GTRasterLayer) {
                        AnalysisExtent ge = ((GTRasterLayer) value).getLayerGridExtent();
                        Envelope genv =
                                new Envelope(
                                        ge.getXMin(), ge.getXMax(), ge.getYMin(), ge.getYMax());
                        if (envelope == null) {
                            envelope = genv;
                        } else {
                            envelope.expandToInclude(genv);
                        }
                        return;
                    }
                }
            }
            if (envelope == null) {
                if (Double.isNaN(cellSize)) {
                    throw new GeoAlgorithmExecutionException(
                            SEXTANTE_GRID_ENVELOPE
                                    + " parameter could not be derived from inputs, and is not available among ");
                }
            }

            // build and set the grid extends
            AnalysisExtent extent = new AnalysisExtent();
            extent.setXRange(envelope.getMinX(), envelope.getMaxX(), false);
            extent.setYRange(envelope.getMinY(), envelope.getMaxY(), false);
            extent.setCellSize(cellSize);
            m_Algorithm.setAnalysisExtent(extent);
        }
    }
}
