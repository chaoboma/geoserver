-- PostGIS setup script for wfs 1.1 sf0 cite dataset
-- Usage:
--     psql -U <database owner> <database> < dataset-sf0.sql
SET client_encoding = 'UTF8';

\c cite_wfs20

SET ROLE cite;

drop table if exists "PrimitiveGeoFeature";
CREATE TABLE "PrimitiveGeoFeature" (
    description character varying,
    name character varying,
    "surfaceProperty" geometry(Polygon,4326),
    "pointProperty" geometry(Point,4326),
    "curveProperty" geometry(LineString,4326),
    "intProperty" integer NOT NULL,
    "uriProperty" character varying,
    measurand double precision NOT NULL,
    "dateTimeProperty" timestamp with time zone,
    "dateProperty" timestamp with time zone,
    "decimalProperty" double precision NOT NULL,
    id character varying primary key,
    identifier character varying
);

INSERT INTO public."PrimitiveGeoFeature" VALUES ('description-f001', 'name-f001', NULL, '0101000020E6100000F437A1100107004044FAEDEBC0DD4340', NULL, 155, 'http://www.opengeospatial.org/', 12765, NULL, '2006-10-25 02:00:00+02', 5.03000000000000025, 'f001', 'PrimitiveGeoFeature.f001');
INSERT INTO public."PrimitiveGeoFeature" VALUES ('description-f002', 'name-f002', NULL, '0101000020E6100000AED3484BE5EDCC3F698CD651D5B44D40', NULL, 154, 'http://www.opengeospatial.org/', 12769, NULL, '2006-10-23 02:00:00+02', 4.01999999999999957, 'f002', 'PrimitiveGeoFeature.f002');
INSERT INTO public."PrimitiveGeoFeature" VALUES ('description-f003', 'name-f003', NULL, NULL, '0102000020E6100000030000000C022B8716992340B6F3FDD4780947403BDF4F8D97EE2440FA7E6ABC74534740986E1283C00A26403BDF4F8D978E4740', 180, NULL, 672.100000000000023, NULL, '2006-09-01 02:00:00+02', 12.9199999999999999, 'f003', 'PrimitiveGeoFeature.f003');
INSERT INTO public."PrimitiveGeoFeature" VALUES ('description-f008', 'name-f008', '0103000020E61000000100000004000000A01A2FDD24E63E4083C0CAA1459646409EEFA7C64B773E40FA7E6ABC74D346409EEFA7C64B773E40355EBA490CF24640A01A2FDD24E63E4083C0CAA145964640', NULL, NULL, 300, NULL, 783.5, '2006-06-28 07:08:00+02', '2006-12-12 01:00:00+01', 18.9200000000000017, 'f008', 'PrimitiveGeoFeature.f008');
INSERT INTO public."PrimitiveGeoFeature" VALUES (NULL, 'name-f015', NULL, '0101000020E61000000AD7A3703D0A25C0B81E85EB51784140', NULL, -900, NULL, 2.39999999999999991, NULL, NULL, 7.90000000000000036, 'f015', 'PrimitiveGeoFeature.f015');

drop table if exists "AggregateGeoFeature";
CREATE TABLE "AggregateGeoFeature" (
    description character varying,
    name character varying,
    "multiPointProperty" geometry(MultiPoint,4326),
    "multiCurveProperty" geometry(MultiLineString,4326),
    "multiSurfaceProperty" geometry(MultiPolygon,4326),
    "doubleProperty" double precision NOT NULL,
    "intRangeProperty" character varying,
    "strProperty" character varying NOT NULL,
    "featureCode" character varying NOT NULL,
    id character varying  primary key,
    identifier character varying
);


INSERT INTO public."AggregateGeoFeature" VALUES ('description-f005', 'name-f005', '0104000020E61000000300000001010000005C8FC2F528DC3D4085EB51B81EB55140010100000014AE47E17A143F4048E17A14AE3751400101000000B81E85EB511840403D0AD7A370FD5140', NULL, NULL, 2012.77999999999997, NULL, 'Ma quande lingues coalesce, li grammatica del resultant lingue es plu simplic e regulari quam ti del coalescent lingues. Li nov lingua franca va esser plu simplic e regulari quam li existent Europan lingues.', 'BK030', 'f005', 'AggregateGeoFeature.f005');
INSERT INTO public."AggregateGeoFeature" VALUES ('description-f009', 'name-f009', NULL, '0105000020E6100000020000000102000000060000007F6ABC74939817C083C0CAA145964B4077BE9F1A2FDD15C0FA7E6ABC74D34B407F6ABC74939817C0355EBA490CF24B407F6ABC74939817C083C0CAA145164D4077BE9F1A2FDD15C0FA7E6ABC74534D407F6ABC74939817C0355EBA490C724D400102000000050000008D976E1283C014C052B81E85EBA14A409A999999991913C05A643BDF4F2D4B40F4FDD478E92611C060E5D022DB594A4021B07268916D10C091ED7C3F35CE4A400AD7A3703D0A10C0D34D621058E94B40', NULL, 20.0100000000000016, NULL, 'Ma quande lingues coalesce, li grammatica del resultant.', 'GB007', 'f009', 'AggregateGeoFeature.f009');
INSERT INTO public."AggregateGeoFeature" VALUES ('description-f010', 'name-f010', NULL, NULL, '0106000020E610000002000000010300000002000000090000000000000000003440000000000000494000000000000033400000000000004B4000000000000034400000000000804B400000000000003E400000000000004E400000000000003C400000000000004A400000000000003B4000000000008049400000000000003D4000000000008048400000000000003B400000000000804740000000000000344000000000000049400400000000000000000039400000000000804B4033333333333339400000000000004C409A999999991939400000000000004C4000000000000039400000000000804B400103000000020000000600000000000000000034400000000000C04140000000000000384000000000008041400000000000003C4000000000008041400000000000803B4000000000008043400000000000003640000000000080424000000000000034400000000000C04140040000000000000000003A400000000000004240000000000000394000000000008042400000000000003B4066666666666642400000000000003A400000000000004240', 24510, NULL, ' Ma quande lingues coalesce, li grammatica del resultant lingue es plu simplic e regulari quam ti del coalescent lingues. Li nov lingua franca va esser plu simplic e regulari quam li existent Europan lingues.', 'AK020', 'f010', 'AggregateGeoFeature.f010');
INSERT INTO public."AggregateGeoFeature" VALUES (NULL, 'name-f016', NULL, NULL, '0106000020E6100000010000000103000000020000000700000000000000000018400000000000C04C4000000000000020400000000000C04C4000000000000020400000000000004E4000000000000022400000000000404F4000000000000014400000000000404F4000000000000018400000000000004E4000000000000018400000000000C04C40040000000000000000001A400000000000004D400000000000001A400000000000804D400000000000001C400000000000804D400000000000001A400000000000004D40', -182.900000000000006, NULL, 'In rhoncus nisl sit amet sem.', 'EE010', 'f016', 'AggregateGeoFeature.f016');


drop table if exists "EntitéGénérique";
CREATE TABLE "EntitéGénérique" (
    description character varying,
    name character varying,
    "attribut.Géométrie" geometry(Geometry,4326),
    "boolProperty" boolean NOT NULL,
    "str4Property" character varying NOT NULL,
    "featureRef" character varying,
    id character varying  primary key,
    identifier character varying
);

INSERT INTO public."EntitéGénérique" VALUES ('description-f004', 'name-f004', '0103000020E6100000020000000500000000000000000000000000000000404E40000000000000000000000000000050400000000000001940000000000000504000000000000019400000000000404E4000000000000000000000000000404E400400000000000000000000400000000000C04E4000000000000000400000000000404F4000000000000010400000000000004F4000000000000000400000000000C04E40', true, 'abc3', 'name-f003', 'f004', 'EntitéGénérique.f004');
INSERT INTO public."EntitéGénérique" VALUES ('description-f007', 'name-f007', '0103000020E610000002000000060000000000000000002E400000000000804140000000000000304000000000000044400000000000003440000000000080434000000000008036400000000000804240000000000000324000000000000042400000000000002E400000000000804140070000000000000000803140CDCCCCCCCC8C42409A999999999931409A999999999942403333333333B331406666666666A64240CDCCCCCCCCCC31403333333333B342406666666666E631400000000000C042406666666666E6314000000000008042400000000000803140CDCCCCCCCC8C4240', false, 'def4', NULL, 'f007', 'EntitéGénérique.f007');
INSERT INTO public."EntitéGénérique" VALUES ('description-f017', 'name-f017', '0102000020E6100000050000007F6ABC749398134083C0CAA14516494077BE9F1A2FDD1540FA7E6ABC74534A407F6ABC7493981B40355EBA490CF24A401F85EB51B81E1F4037894160E5304B40355EBA490CC2214004560E2DB27D4B40', false, 'qrst', 'name-f015', 'f017', 'EntitéGénérique.f017');
