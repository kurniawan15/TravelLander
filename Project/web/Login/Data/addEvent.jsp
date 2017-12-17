<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<%@page import="Json.AccessJSON"%>
<!DOCTYPE html>
<html  xmlns="http://www.w3.org/1999/xhtml">
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>

   

  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
  body{
    background-image: url(img/backweb.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
<body>

<div class="flex-container">
<div class="headbar">
<header>
  <center><img class="logoweb" src="img/L210.png"></center>
</header>
</div>

<nav class="nav">
<ul>
   <br><br><br>
    <a href="myEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dasboard</li></a>
    <a href="calendar.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">date_range</i>Calendar</li></a>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white">add</i>Create Schedule</li>
    <a href="listData.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="PageEventList.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="content">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Create Schedule</h1>
  <div class="widget">
  <div class="title"><b>Detail</b></div>
<form action="../../Event?data=event&proses=input-event" method="post" >  
    
    <input type="hidden" id="kd_traveller" name="kd_traveller"  value="T001">
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="namaevent">
      <h1 class="hnamaevent">Event Name :</h1>
      <input type="text" id="fname" name="nama_event" placeholder="Input Event Name">
    </div>
    
    <!--____________________________Form Inputan Waktu Event____________________________-->
    <div class="waktu">
      <h1 class="hwaktu">Event Time :</h1>
      <!--____________________________Form input waktu awal____________________________-->
      <table border="0" cellpadding="0" cellspacing="3">
        <tr>
            <td colspan="2">
                Source:
                <input type="text" id="txtSource" value="" style="width: 200px" />
                  <a id="from-link" href="#">Posisi sekarang</a>
                &nbsp; Destination:
                <input type="text" id="txtDestination" value="" style="width: 200px" />
                <br />
                <input type="button" value="Get Route" onclick="GetRoute()" />
                <hr />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <div id="dvDistance">
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div id="dvMap" style="width: 500px; height: 500px">
                </div>
            </td>
            <td>
                <div id="dvPanel" style="width: 500px; height: 500px">
                </div>
            </td>
        </tr>
    </table>   
    
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="keteranganevent">
      <h1 class="hketevent">Event Description :</h1>
      <input type="text" id="fname" name="keterangan" placeholder="Input Event Description">
    </div>

    <!--____________________________Form Inputan Transportasi____________________________-->   
  
      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
      <!--<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false&libraries=places"></script>-->
      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&libraries=places"></script>
    <script type="text/javascript">
        
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
                alert($(addressId).val(results[0].formatted_address()));
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
          getLatLongAwal($("#from").val());
          getLatLongAkhir($("#to").val());
        });
      });
    
    
    var source, destination;
        var directionsDisplay;
        var directionsService = new google.maps.DirectionsService();
        google.maps.event.addDomListener(window, 'load', function () {
            new google.maps.places.SearchBox(document.getElementById('txtSource'));
            new google.maps.places.SearchBox(document.getElementById('txtDestination'));
            directionsDisplay = new google.maps.DirectionsRenderer({ 'draggable': true });
        });

        function GetRoute() {
            var mumbai = new google.maps.LatLng(18.9750, 72.8258);
            var mapOptions = {
                zoom: 7,
                center: mumbai
            };
            map = new google.maps.Map(document.getElementById('dvMap'), mapOptions);
            directionsDisplay.setMap(map);
            directionsDisplay.setPanel(document.getElementById('dvPanel'));

            //*********DIRECTIONS AND ROUTE**********************//
            source = document.getElementById("txtSource").value;
            destination = document.getElementById("txtDestination").value;

            var request = {
                origin: source,
                destination: destination,
                travelMode: google.maps.TravelMode.WALKING
            };
            directionsService.route(request, function (response, status) {
                if (status == google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });

            //*********DISTANCE AND DURATION**********************//
            var service = new google.maps.DistanceMatrixService();
            service.getDistanceMatrix({
                origins: [source],
                destinations: [destination],
                travelMode: google.maps.TravelMode.DRIVING,
                unitSystem: google.maps.UnitSystem.METRIC,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance");
                    dvDistance.innerHTML = "";
                    dvDistance.innerHTML += "Distance: " + distance + "<br />";
                    dvDistance.innerHTML += "Duration:" + duration;

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
        }
    </script>

      
      

 
        <!--____________________________isi option di kendaraan pribadi____________________________--> 
        <table class="table" id="TabelFilter">
            <tr>
                <th>Choose</th>
                <th>Transport Name</th>
                <th>Distance (KM) </th>
                <th>Estimated Time (Minutes)</th>
                <th>Departure Time</th>
            </tr>
            <tr>
                <td title="NO"><input type="radio" name="transport" value="WALKING;1" onClick="RuteKendaraan('WALKING')"><br></td>
                <td title="Event Name">Walk</td>
                <td title="Location">-</td>
                <td title="Ibu Kota">-</td>
                <td title="Ibu Kota">-</td>
            </tr>
            <tr>
                <td title="NO"><input type="radio" name="transport" value="DRIVING;1" onClick="RuteKendaraan('DRIVING')"><br></td>
                <td title="Event Name">Motorcycle</td>
                <td title="Location">-</td>
                <td title="Ibu Kota">-</td>
                <td title="Ibu Kota">-</td>
            </tr>
            <tr>
                <td title="NO"><input type="radio" name="transport" value="DRIVING;0" onClick="RuteKendaraan('DRIVING')"><br></td>
                <td title="Event Name">Car</td>
                <td title="Location">-</td>
                <td title="Ibu Kota">-</td>
                <td title="Ibu Kota">-</td>
            </tr>
            <tr>
                <td title="NO"><input type="radio" name="transport" value="TRANSIT;0" onClick="RuteKendaraan('TRANSIT')"><br></td>
                <td title="Event Name">Bus</td>
                <td title="Location">-</td>
                <td title="Ibu Kota">-</td>
                <td title="Ibu Kota">-</td>
            </tr>
            <tr>
                <td title="NO"><input type="radio" name="transport" value="TRANSIT;1" onClick="RuteKendaraan('TRANSIT')"><br></td>
                <td title="Event Name">Train</td>
                <td title="Location">-</td>
                <td title="Ibu Kota">-</td>
                <td title="Ibu Kota">-</td>
            </tr>
            
        </table>

        <!--____________________________Tombol Submit or cancel____________________________--> 
      <div class="col-12 enter">
        <br>
        <input type="button" value="Cancel" style="background-color: red;">
        <input type="submit" value="Create Schedule">
      </div><br> 
 </form>

      </div>

    </div>
      
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
