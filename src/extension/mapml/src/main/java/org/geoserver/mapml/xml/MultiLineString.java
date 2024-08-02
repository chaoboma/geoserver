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
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;group ref="{}twoOrMoreCoordinatePairs" maxOccurs="unbounded"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"twoOrMoreCoordinatePairs"})
public class MultiLineString {

    @XmlMixed
    @XmlElementRef(
            name = "map-coordinates",
            type = Coordinates.class,
            namespace = "http://www.w3.org/1999/xhtml")
    protected List<Coordinates> twoOrMoreCoordinatePairs;

    /**
     * Gets the value of the twoOrMoreCoordinatePairs property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the twoOrMoreCoordinatePairs property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getTwoOrMoreCoordinatePairs().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
     * <}{@link List }{@code <}{@link String }{@code >}{@code >}
     *
     * @return two or more coordinate pairs
     */
    public List<Coordinates> getTwoOrMoreCoordinatePairs() {
        if (twoOrMoreCoordinatePairs == null) {
            twoOrMoreCoordinatePairs = new ArrayList<>();
        }
        return this.twoOrMoreCoordinatePairs;
    }
}
