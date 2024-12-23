/* (c) 2017 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.0-hudson-3037-ea3
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.07.27 at 11:06:51 PM CDT
//
package org.geoserver.wps.ppio.gpx;

import java.util.Calendar;

/**
 * Information about the copyright holder and any license governing use of this file. By linking to an appropriate
 * license, you may place your data into the public domain or grant additional usage rights.
 *
 * <p>Java class for copyrightType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="copyrightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="license" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="author" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
public class CopyrightType {
    protected Calendar year;

    protected String license;

    protected String author;

    /**
     * Gets the value of the year property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public Calendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setYear(Calendar value) {
        this.year = value;
    }

    /**
     * Gets the value of the license property.
     *
     * @return possible object is {@link String }
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Gets the value of the author property.
     *
     * @return possible object is {@link String }
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAuthor(String value) {
        this.author = value;
    }
}
