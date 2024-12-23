//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@SuppressWarnings("unchecked")

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * org.geoserver.mapml.xml package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _MultiPoint_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-multipoint");
    private static final QName _GeometryContent_QNAME =
            new QName("http://www.w3.org/1999/xhtml", "map-geometrycontent");
    private static final QName _MultiLineString_QNAME =
            new QName("http://www.w3.org/1999/xhtml", "map-multilinestring");
    private static final QName _Bbox_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-bbox");
    private static final QName _Point_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-point");
    private static final QName _Title_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-title");
    private static final QName _Body_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-body");
    private static final QName _Head_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-head");
    private static final QName _GeometryCollection_QNAME =
            new QName("http://www.w3.org/1999/xhtml", "map-geometrycollection");
    private static final QName _LineString_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-linestring");
    private static final QName _MultiPolygon_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-multipolygon");
    private static final QName _Geometry_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-geometry");
    private static final QName _Polygon_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-polygon");
    private static final QName _Properties_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-properties");
    private static final QName _MultiPointCoordinates_QNAME =
            new QName("http://www.w3.org/1999/xhtml", "map-coordinates");
    private static final QName _A_QNAME = new QName("http://www.w3.org/1999/xhtml", "map-a");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * org.geoserver.mapml.xml
     */
    public ObjectFactory() {}

    /** Create an instance of {@link Extent } */
    public Extent createExtent() {
        return new Extent();
    }

    /** Create an instance of {@link Input } */
    public Input createInput() {
        return new Input();
    }

    /** Create an instance of {@link Datalist } */
    public Datalist createDatalist() {
        return new Datalist();
    }

    /** Create an instance of {@link Option } */
    public Option createOption() {
        return new Option();
    }

    /** Create an instance of {@link Link } */
    public Link createLink() {
        return new Link();
    }

    /** Create an instance of {@link Select } */
    public Select createSelect() {
        return new Select();
    }

    /** Create an instance of {@link Label } */
    public Label createLabel() {
        return new Label();
    }

    /** Create an instance of {@link MultiPoint } */
    public MultiPoint createMultiPoint() {
        return new MultiPoint();
    }

    /** Create an instance of {@link MultiLineString } */
    public MultiLineString createMultiLineString() {
        return new MultiLineString();
    }

    /** Create an instance of {@link BodyContent } */
    public BodyContent createBodyContent() {
        return new BodyContent();
    }

    /** Create an instance of {@link HeadContent } */
    public HeadContent createHeadContent() {
        return new HeadContent();
    }

    /** Create an instance of {@link GeometryCollection } */
    public GeometryCollection createGeometryCollection() {
        return new GeometryCollection();
    }

    /** Create an instance of {@link Feature } */
    public Feature createFeature() {
        return new Feature();
    }

    /** Create an instance of {@link Image } */
    public Image createImage() {
        return new Image();
    }

    /** Create an instance of {@link GeometryContent } */
    public GeometryContent createGeometryContent() {
        return new GeometryContent();
    }

    /** Create an instance of {@link PropertyContent } */
    public PropertyContent createPropertyContent() {
        return new PropertyContent();
    }

    /** Create an instance of {@link Mapml } */
    public Mapml createMapml() {
        return new Mapml();
    }

    /** Create an instance of {@link Tile } */
    public Tile createTile() {
        return new Tile();
    }

    /** Create an instance of {@link Polygon } */
    public Polygon createPolygon() {
        return new Polygon();
    }

    /** Create an instance of {@link Point } */
    public Point createPoint() {
        return new Point();
    }

    /** Create an instance of {@link LineString } */
    public LineString createLineString() {
        return new LineString();
    }

    /** Create an instance of {@link MultiPolygon } */
    public MultiPolygon createMultiPolygon() {
        return new MultiPolygon();
    }

    /** Create an instance of {@link Meta } */
    public Meta createMeta() {
        return new Meta();
    }

    /** Create an instance of {@link Base } */
    public Base createBase() {
        return new Base();
    }

    /** Create an instance of {@link AnyContent } */
    public AnyContent createAnyContent() {
        return new AnyContent();
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MultiPoint }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-multipoint",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<MultiPoint> createMultiPoint(MultiPoint value) {
        return new JAXBElement<>(_MultiPoint_QNAME, MultiPoint.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "GeometryContent")
    public JAXBElement<Object> createGeometryContent(Object value) {
        return new JAXBElement<>(_GeometryContent_QNAME, Object.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MultiLineString }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-multilinestring",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<MultiLineString> createMultiLineString(MultiLineString value) {
        return new JAXBElement<>(_MultiLineString_QNAME, MultiLineString.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-bbox")
    public JAXBElement<List<String>> createBbox(List<String> value) {
        return new JAXBElement<>(_Bbox_QNAME, ((Class) List.class), null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link Point }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-point",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<Point> createPoint(Point value) {
        return new JAXBElement<>(_Point_QNAME, Point.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<>(_Title_QNAME, String.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link BodyContent }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-body")
    public JAXBElement<BodyContent> createBody(BodyContent value) {
        return new JAXBElement<>(_Body_QNAME, BodyContent.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link HeadContent }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-head")
    public JAXBElement<HeadContent> createHead(HeadContent value) {
        return new JAXBElement<>(_Head_QNAME, HeadContent.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GeometryCollection }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-geometrycollection",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<GeometryCollection> createGeometryCollection(GeometryCollection value) {
        return new JAXBElement<>(_GeometryCollection_QNAME, GeometryCollection.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link LineString }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-linestring",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<LineString> createLineString(LineString value) {
        return new JAXBElement<>(_LineString_QNAME, LineString.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link MultiPolygon }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-multipolygon",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<MultiPolygon> createMultiPolygon(MultiPolygon value) {
        return new JAXBElement<>(_MultiPolygon_QNAME, MultiPolygon.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link GeometryContent }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-geometry")
    public JAXBElement<GeometryContent> createGeometry(GeometryContent value) {
        return new JAXBElement<>(_Geometry_QNAME, GeometryContent.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link Polygon }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-polygon",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<>(_Polygon_QNAME, Polygon.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link A }{@code >}} */
    @XmlElementDecl(
            namespace = "http://www.w3.org/1999/xhtml",
            name = "map-a",
            substitutionHeadNamespace = "http://www.w3.org/1999/xhtml",
            substitutionHeadName = "GeometryContent")
    public JAXBElement<A> createA(A value) {
        return new JAXBElement<>(_A_QNAME, A.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link PropertyContent }{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-properties")
    public JAXBElement<PropertyContent> createProperties(PropertyContent value) {
        return new JAXBElement<>(_Properties_QNAME, PropertyContent.class, null, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-coordinates", scope = MultiPoint.class)
    public JAXBElement<List<String>> createMultiPointCoordinates(List<String> value) {
        return new JAXBElement<>(_MultiPointCoordinates_QNAME, ((Class) List.class), MultiPoint.class, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-coordinates", scope = Polygon.class)
    public JAXBElement<List> createPolygonCoordinates(List value) {
        return new JAXBElement<>(_MultiPointCoordinates_QNAME, ((Class) List.class), Polygon.class, value);
    }

    /** Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}} */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xhtml", name = "map-coordinates", scope = MultiLineString.class)
    public JAXBElement<List> createMultiLineStringCoordinates(List value) {
        return new JAXBElement<>(
                _MultiPointCoordinates_QNAME, ((Class) List.class), MultiLineString.class, ((List<Coordinates>) value));
    }
}
