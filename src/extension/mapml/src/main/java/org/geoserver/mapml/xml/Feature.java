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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}bbox"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}image"/&gt;
 *           &lt;element ref="{}geometry"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}properties"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name = "map-feature", namespace = "http://www.w3.org/1999/xhtml")
public class Feature {

    //    @XmlElementRefs({
    //        @XmlElementRef(name = "featurecaption", type = String.class, required = false),
    //        @XmlElementRef(name = "geometry", type = JAXBElement.class, required = false),
    //        @XmlElementRef(name = "bbox", type = JAXBElement.class, required = false),
    //        @XmlElementRef(name = "image", type = Image.class, required = false),
    //        @XmlElementRef(name = "properties", type = JAXBElement.class, required = false)
    //    })
    //    protected List<Object> bboxOrImageOrGeometry;
    //
    @XmlElement(name = "map-featurecaption", required = false, namespace = "http://www.w3.org/1999/xhtml")
    protected String featurecaption;

    @XmlElement(name = "map-geometry", required = false, namespace = "http://www.w3.org/1999/xhtml")
    protected GeometryContent geometry;

    @XmlElement(name = "map-bbox", required = false, namespace = "http://www.w3.org/1999/xhtml")
    protected JAXBElement bbox;

    @XmlElement(name = "map-image", required = false, namespace = "http://www.w3.org/1999/xhtml")
    protected Image image;

    @XmlElement(name = "map-properties", required = false, namespace = "http://www.w3.org/1999/xhtml")
    protected PropertyContent properties;

    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String style;

    //
    //    /**
    //     * Gets the value of the bboxOrImageOrGeometry property.
    //     *
    //     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore
    // any
    //     * modification you make to the returned list will be present inside the JAXB object. This
    // is
    //     * why there is not a <CODE>set</CODE> method for the bboxOrImageOrGeometry property.
    //     *
    //     * <p>For example, to add a new item, do as follows:
    //     *
    //     * <pre>
    //     *    getBboxOrImageOrGeometry().add(newItem);
    //     * </pre>
    //     *
    //     * <p>Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code
    //     * <}{@link GeometryContent }{@code >} {@link Image } {@link JAXBElement }{@code <}{@link
    // List
    //     * }{@code <}{@link String }{@code >}{@code >} {@link JAXBElement }{@code <}{@link
    //     * PropertyContent }{@code >}
    //     */
    //    public List<Object> getBboxOrImageOrGeometry() {
    //        if (bboxOrImageOrGeometry == null) {
    //            bboxOrImageOrGeometry = new ArrayList<Object>();
    //        }
    //        return this.bboxOrImageOrGeometry;
    //    }

    public GeometryContent getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryContent geometry) {
        // fixes NPE, allows MapML feature to have no <geometry> element if
        // there is no geometry associated to the feature, a situation that
        // comes up when querying an image for RGB values for example
        if (geometry.getGeometryContent() != null) {
            this.geometry = geometry;
        }
    }

    public JAXBElement getBbox() {
        return bbox;
    }

    public void setBbox(JAXBElement bbox) {
        this.bbox = bbox;
    }

    public String getFeatureCaption() {
        return featurecaption;
    }

    public void setFeatureCaption(String featurecaption) {
        this.featurecaption = featurecaption;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public PropertyContent getProperties() {
        return properties;
    }

    public void setProperties(PropertyContent properties) {
        this.properties = properties;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the style property.
     *
     * @return possible object is {@link String }
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param style allowed object is {@link String }
     */
    public void setStyle(String style) {
        this.style = style;
    }
}
