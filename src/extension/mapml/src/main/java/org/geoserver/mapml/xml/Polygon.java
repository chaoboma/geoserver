//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{}threeOrMoreCoordinatePairs" maxOccurs="unbounded"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"threeOrMoreCoordinatePairs"})
public class Polygon {

    @XmlElementRef(
            name = "coordinates",
            type = JAXBElement.class,
            namespace = "http://www.w3.org/1999/xhtml/")
    protected List<JAXBElement<List<String>>> threeOrMoreCoordinatePairs;

    /**
     * Gets the value of the threeOrMoreCoordinatePairs property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the threeOrMoreCoordinatePairs property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getThreeOrMoreCoordinatePairs().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    public List<JAXBElement<List<String>>> getThreeOrMoreCoordinatePairs() {
        if (threeOrMoreCoordinatePairs == null) {
            threeOrMoreCoordinatePairs = new ArrayList<>();
        }
        return this.threeOrMoreCoordinatePairs;
    }
}
