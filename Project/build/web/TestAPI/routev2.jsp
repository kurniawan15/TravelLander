<%-- 
    Document   : routev2
    Created on : Nov 20, 2017, 7:42:57 PM
    Author     : Hari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Phuuuu</title>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script>
     // layer dari rute nya 
      function Rute (from, to) {
        // initialized kampus tercinta (POLBAN)
        var myOptions = {
          zoom: 5,
          center: new google.maps.LatLng(-6.870458,107.571883),
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        // Gambar objec map
        var mapObject = new google.maps.Map(document.getElementById("map"), myOptions);

        var directionsService = new google.maps.DirectionsService();
        var directionsRequest = {
          origin: from,
          destination: to,
          travelMode: google.maps.DirectionsTravelMode.DRIVING,
          unitSystem: google.maps.UnitSystem.METRIC
        };
        directionsService.route(
          directionsRequest,
          function(response, status)
          {
            if (status == google.maps.DirectionsStatus.OK)
            {
              new google.maps.DirectionsRenderer({
                map: mapObject,
                directions: response
              });
            }
            else
              $("#error").append("Unable to retrieve your route<br />");
          }
        );
      }
      //bagian google API
      $(document).ready(function() {
        // If the browser supports the Geolocation API
        if (typeof navigator.geolocation == "undefined") {
          $("#error").text("Your browser doesn't support the Geolocation API");
          return;
        }

        $("#from-link, #to-link").click(function(event) {
          event.preventDefault();
          var addressId = this.id.substring(0, this.id.indexOf("-"));
          //penanggilan posisi sekarang
          navigator.geolocation.getCurrentPosition(function(position) {
            var geocoder = new google.maps.Geocoder();
            geocoder.geocode({
              "location": new google.maps.LatLng(position.coords.latitude, position.coords.longitude)
            },
            function(results, status) {
              if (status == google.maps.GeocoderStatus.OK)
                $("#" + addressId).val(results[0].formatted_address);
              else
                $("#error").append("Unable to retrieve your address<br />");
            });
          },
          function(positionError){
            $("#error").append("Error: " + positionError.message + "<br />");
          },
          {
            enableHighAccuracy: true,
            timeout: 10 * 1000 // 10 seconds
          });
        });

        $("#calculate-route").submit(function(event) {
          event.preventDefault();
          Rute($("#from").val(), $("#to").val());
        });
      });
    </script>
    <style type="text/css">
      #map {
        width: 500px;
        height: 400px;
        margin-top: 10px;
      }
    </style>
  </head>
  <body>
      <h1> Percobaan aja ini mah </h1>
    <h1>Cari rute nya di sini yahhh</h1>
    <form id="calculate-route" name="calculate-route" action="#" method="get">
      <label for="from">From:</label>
      <input type="text" id="from" name="from" required="required" placeholder="lokasi awal" size="30" />
      <a id="from-link" href="#">Posisi sekarang</a>
      <br />

      <label for="to">To:</label>
      <input type="text" id="to" name="to" required="required" placeholder="lokasi akhir" size="30" />
      <br />

      <input type="submit" value="cari lokasi" />
    </form>
    <div id="map"></div>
    <p id="error"></p>
  </body>
</html>
