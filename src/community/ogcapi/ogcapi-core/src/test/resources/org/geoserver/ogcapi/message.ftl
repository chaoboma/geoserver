<html>
<head>
    <script src="${resourceLink('webresources/ogcapi/hello.js')}"></script>
</head>
<body>
  <p>The message: ${model.message}</p>
  <p><a class="wmsCapabilities" href="${genericServiceLink('wms', 'service', 'WMS', 'request', 'GetCapabilities')}">Capabilities URL</a></p>
</body>
</html>