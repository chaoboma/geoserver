//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for GeometryContent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeometryContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}GeometryContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "GeometryContent",
        propOrder = {"geometryContent"})
public class GeometryContent {

    @XmlElementRef(
            name = "GeometryContent",
            type = JAXBElement.class,
            namespace = "http://www.w3.org/1999/xhtml/")
    protected JAXBElement<?> geometryContent;

    /**
     * Gets the value of the geometryContent property.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link MultiPolygon }{@code >} {@link
     *     JAXBElement }{@code <}{@link LineString }{@code >} {@link JAXBElement }{@code <}{@link
     *     GeometryCollection }{@code >} {@link JAXBElement }{@code <}{@link MultiPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >} {@link JAXBElement }{@code <}{@link
     *     Point }{@code >} {@link JAXBElement }{@code <}{@link MultiLineString }{@code >} {@link
     *     JAXBElement }{@code <}{@link Polygon }{@code >}
     */
    public JAXBElement<?> getGeometryContent() {
        return geometryContent;
    }

    /**
     * Sets the value of the geometryContent property.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link MultiPolygon }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineString }{@code >} {@link JAXBElement }{@code
     *     <}{@link GeometryCollection }{@code >} {@link JAXBElement }{@code <}{@link MultiPoint
     *     }{@code >} {@link JAXBElement }{@code <}{@link Object }{@code >} {@link JAXBElement
     *     }{@code <}{@link Point }{@code >} {@link JAXBElement }{@code <}{@link MultiLineString
     *     }{@code >} {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     */
    public void setGeometryContent(JAXBElement<?> value) {
        this.geometryContent = value;
    }
}
