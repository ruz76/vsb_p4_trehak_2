<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

	<title>Quick Start - Leaflet</title>

	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />

	<link rel="stylesheet" href="https://unpkg.com/leaflet@1.0.1/dist/leaflet.css" />
	<script src="https://unpkg.com/leaflet@1.0.1/dist/leaflet.js"></script>

</head>
<body>
<h1>PBF import to PostGIS</h1>
<p>This is just a sample of code that gets extent from map and downalods data.</p>
<p>Now the code downloads whole country Malta in PBF</p>
<p>There are still questions like "how to run another thread correctly?"</p>
<p>This is jus a sample</p>
<p><button onClick="showExtent()">Get extent</button></p>
<p>
<form action="/getValue" method="POST" ><br>
    Extent of map: <input id="key" type="text" name="key" size="100"><br>
    <input type="submit" value="Download data" >
</form>
</P>
<div id="mapid" style="width: 600px; height: 400px;"></div>
<script>

    function showExtent() {
        var key = document.getElementById("key");
        key.value = mymap.getBounds().getWest() + "," + mymap.getBounds().getSouth() + "," + mymap.getBounds().getEast() + "," + mymap.getBounds().getNorth();
    }

	var mymap = L.map('mapid').setView([35.7, 14.2], 8);

	L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpandmbXliNDBjZWd2M2x6bDk3c2ZtOTkifQ._QA7i5Mpkd_m30IGElHziw', {
		maxZoom: 18,
		attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, ' +
			'<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
			'Imagery © <a href="http://mapbox.com">Mapbox</a>',
		id: 'mapbox.streets'
	}).addTo(mymap);

</script>



</body>
</html>

