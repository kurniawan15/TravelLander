<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : hari pc
--%>
<%@page import="model.NewEvent"%>
<%@page import="model.NewLokasi"%>
<%@page import="model.NewModaPerjalanan"%>
<%@page import="model.NewModaTransit"%>
<%@page import="model.NewTransportasiTerjadwal"%>
<%@page import="model.NewTransportasiTidakTerjadwal"%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="DAO.DAONewModaTransit"%>
<%@page import="DAO.DAONewTransportasiTerjadwal"%>
<%@page import="DAO.DAONewTransportasiTidakTerjadwal"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/grid.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&libraries=places"></script>
        
</head>
<body>
    <form>
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 header">
		<div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri">
		</div>
		<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri">
			<center><img class="img-responsive" src="img/logo1.png">
		</div>
		<div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kiri">
		</div>
		<div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan">
			<span class="glyphicon glyphicon-bell"></span>
		</div>
		<div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2">
			Fajar&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span>
		</div>
	</div>
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage">
		<div class="col-lg-6 col-md-5 col-sm-12 col-xs-12 leftpage">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar">
				<ul>
					<li class="none">Dashboard</li>
					<li class="none">My Calendar</li>
					<a href="addEvent.jsp"><li class="none">Add Event</li></a> 
					<a href="mylist.jsp"><li class="none">My Event</li></a>
					<li class="none">History</li>
				</ul>
			</div>

			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent">
			<article class="article">                               
  			<br><br>
  			<h1 class="judul">Create Event</h1>
 			 
  	
    <!--____________________________Form Inputan Nama Event____________________________-->
			    <div class="namaevent">
			      <h1 class="hnamaevent">Event Name :</h1>
			      <input type="text" id="fname" name="nama_event" placeholder="Input Event Name">
			    </div>
			    
			    <div class="keteranganevent">
			      <h1 class="hketevent">Event Description :</h1>
			      <input type="text" id="fname" name="keterangan" placeholder="Input Event Description">
			    </div>
			    <!--____________________________Form Inputan Waktu Event____________________________-->
			    <div class="waktu">
			      <h1 class="hwaktu">Event Time :</h1>
			      <!--____________________________Form input waktu awal____________________________-->
			      <input type="datetime-local" name="waktu_mulai" placeholder="start time"> <i style="color: black;">&nbsp;until&nbsp;</i>
			      <!--____________________________Form input waktu akhir--> 
			      <input type="datetime-local" name="waktu_selesai" placeholder="End time">   
			    </div>
    
    <!--____________________________Form Inputan Lokasi Awal____________________________-->
			    <div class="LokasiAwal">
			      <div id="calculate-route" name="calculate-route" action="#" method="get">
			            <h1 class="hlokasiawal">Start Location :</h1>
<<<<<<< HEAD
			            <input type="text" id="txtSource" placeholder="Input First Location" size="30" style="width: 85%;" />
                                   
			            <input type="submit" id="from-link" value="Now" style="width: 14%;" />
			            <div class="LokasiAkhir">
			                <h1 class="hlokasiakhir">End Location :</h1>
			                <input type="text" id="txtDestination" placeholder="Input Last Location" size="30" style="width: 85%;" />
                                        
                                        <input type="button" value="Get Route" style="width: 14%;" onclick="GetRoute()"/>
=======
			            <input type="text" id="from" name="from" required="required" placeholder="Input First Location" size="30" style="width: 85%;" />
                                    <input type="button" id="from-link" value="Now" style="width: 14%;">
			            <div class="LokasiAkhir">
			                <h1 class="hlokasiakhir">End Location :</h1>
			                <input type="text" id="to" name="to" required="required" placeholder="Input Last Location" size="30" style="width: 85%;" />
			            <input type="button" value="Search" style="width: 14%;"  onclick="getMap()">
>>>>>>> aea576c4a795959eb98f414a939619efa7b94620
			            </div>
			            <input type="hidden" id="latAwal" name="latitude_awal">
                                    <input type="hidden" id="longAwal" name="longitude_awal">
                                    <br>
                                    <input type="hidden" id="latAkhir" name="latitude_akhir">
                                    <input type="hidden" id="longAkhir" name="longitude_akhir">
			      </div>
			    </div>

			    <script type="text/javascript">
				function openCity(evt, cityName) {
<<<<<<< HEAD
				  var i, tabcontent, tablinks; //deklarasi variabel
				  
				  document.getElementById("tipe_moda").value = cityName;
				  //mengambil element yang ada di class tabcontent dan menyembunyikan class 
				  tabcontent = document.getElementsByClassName("tabcontent");
				  for (i = 0; i < tabcontent.length; i++) {
				      tabcontent[i].style.display = "none";
				  }
				  
				  //mengambil element yang ada di class tablinks dan menghapus yg aktif di display
				  tablinks = document.getElementsByClassName("tablinks");
				  for (i = 0; i < tablinks.length; i++) {
				      tablinks[i].className = tablinks[i].className.replace(" active", "");
				  }
				  
				  //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb
				  document.getElementById(cityName).style.display = "block";
				  evt.currentTarget.className += " active";
				  }
				  
                                  //--------------------------------------------------Bagian Google API----------------------------------------------------------------
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
                travelMode: google.maps.TravelMode.DRIVING
            };
            directionsService.route(request, function (response, status) {
                if (status == google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });

            //*********DISTANCE AND DURATION WALKING**********************//
            var service = new google.maps.DistanceMatrixService();
            service.getDistanceMatrix({
                origins: [source],
                destinations: [destination],
                travelMode: google.maps.TravelMode.WALKING,
                unitSystem: google.maps.UnitSystem.METRIC,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance");
                    var dvDuration = document.getElementById("dvDuration");
                    dvDistance.innerHTML = "";
                    dvDistance.innerHTML += distance;
                    dvDuration.innerHTML += duration;

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
            
            //*********DISTANCE AND DURATION DRIVING**********************//
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
                    var dvDistance = document.getElementById("dvDistance1");
                    var dvDuration = document.getElementById("dvDuration1");
                    dvDistance1.innerHTML = "";
                    dvDistance1.innerHTML += distance;
                    dvDuration1.innerHTML += duration;

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
            
            //*********DISTANCE AND DURATION BUS**********************//
            service.getDistanceMatrix({
                origins: [source],
                destinations: [destination],
                travelMode: google.maps.TravelMode.TRANSIT,
                    transitOptions: {
                    modes: ['BUS']
                  },
                unitSystem: google.maps.UnitSystem.METRIC,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance2");
                    var dvDuration = document.getElementById("dvDuration2");
                    dvDistance2.innerHTML = "";
                    dvDistance2.innerHTML += distance;
                    dvDuration2.innerHTML += duration;

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
            
            //*********DISTANCE AND DURATION RAIL**********************//
            service.getDistanceMatrix({
                origins: [source],
                destinations: [destination],
                travelMode: google.maps.TravelMode.TRANSIT,
                    transitOptions: {
                    modes: ['RAIL']
                  },
                unitSystem: google.maps.UnitSystem.METRIC,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance3");
                    var dvDuration = document.getElementById("dvDuration3");
                    dvDistance3.innerHTML = "";
                    dvDistance3.innerHTML += distance;
                    dvDuration3.innerHTML += duration;

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
=======
          var i, tabcontent, tablinks; //deklarasi variabel
          
          document.getElementById("tipe_moda").value = cityName;
          //mengambil element yang ada di class tabcontent dan menyembunyikan class 
          tabcontent = document.getElementsByClassName("tabcontent");
          for (i = 0; i < tabcontent.length; i++) {
              tabcontent[i].style.display = "none";
          }
          
          //mengambil element yang ada di class tablinks dan menghapus yg aktif di display
          tablinks = document.getElementsByClassName("tablinks");
          for (i = 0; i < tablinks.length; i++) {
              tablinks[i].className = tablinks[i].className.replace(" active", "");
          }
          
          //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb
          document.getElementById(cityName).style.display = "block";
          evt.currentTarget.className += " active";
          }
          
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
      
      function getLatLongAwal(emb){
          var address = emb;
          var geocoder = new google.maps.Geocoder();
          geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            
               document.getElementById("latAwal").value = results[0].geometry.location.lat();
               document.getElementById("longAwal").value = results[0].geometry.location.lng();
            
            } else {
            alert('Geocode was not successful for the following reason: ' + status);
          }
        });   
      }
      
      function getLatLongAkhir(des){
          var address = des;
          var geocoder = new google.maps.Geocoder();
          geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            
               document.getElementById("latAkhir").value = results[0].geometry.location.lat();
               document.getElementById("longAkhir").value = results[0].geometry.location.lng();
            
            } else {
            alert('Geocode was not successful for the following reason: ' + status);
          }
        });   
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
          getLatLongAwal($("#from").val());
          getLatLongAkhir($("#to").val());
        });
      });
      
      function getMap(){
          var from = document.getElementById("from").value;
          var to = document.getElementById("to").value;
          
          Rute(from,to);
          getLatLongAwal(from);
          getLatLongAkhir(to);
          
          geocoder.geocode({'address': address}, function(results, status) {
          if (status === 'OK') {
            
               document.getElementById("latAkhir").value = results[0].geometry.location.lat();
               document.getElementById("longAkhir").value = results[0].geometry.location.lng();
            
           
            } else {
            alert('Geocode was not successful for the following reason: ' + status);
          }
        });   
      }
      
      function RuteKendaraan(moda) {
        // initialized kampus tercinta (POLBAN)
        
        var myOptions = {
          zoom: 5,
          center: new google.maps.LatLng(-6.870458,107.571883),
          mapTypeId: google.maps.MapTypeId.ROADMAP
        };
        
        var from = document.getElementById("from").value;
        var to = document.getElementById("to").value;
          
        // Gambar objec map
        var mapObject = new google.maps.Map(document.getElementById("map"), myOptions);
        var directionsService = new google.maps.DirectionsService();
        var directionsRequest = {
          origin: from,
          destination: to,
          travelMode: moda,
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
      
      function cekOk(){
          document.getElementById("from").value = "Cek yooo";
>>>>>>> aea576c4a795959eb98f414a939619efa7b94620
        }
		</script>	
        <!--____________________________Tombol Submit or cancel____________________________--> 
		      <div class="col-12 enter">
		        <br>
		        <input type="submit" value="OK" style="background-color: green; width: 15%; float: right; margin-bottom: 20px;">
		        <input type="button" value="?" style="background-color: red; width: 15%; margin-bottom: 20px; float: right;">
		        <br>
		      </div>
			    
			</div>
			</div>
		<div class="col-lg-6 col-md-7 col-sm-12 col-xs-12 rightpage">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil">
                            <div id="dvMap" style="width: 500px; height: 280px; margin-top:10px;" ></div>
                            
	     	</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 tablepilih">
	        <table class="table" id="TabelFilter">
	            <tr>
	                <th>Choose</th>
	                <th>Transport</th>
	                <th>Distance (KM) </th>
	                <th>Estimated Time (Minutes)</th>
	                <th>Departure Time</th>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_walk</i> Walk</td>
                        <td title="Location"><div id="dvDistance"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration"></div></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_bike</i> Motorcycle</td>
	                <td title="Location"></td>
	                <td title="Ibu Kota"></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_car</i> Car</td>
	                <td title="Location"><div id="dvDistance1"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration1"></div></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_bus</i> Bus</td>
	                <td title="Location"><div id="dvDistance2"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration2"></div></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_subway</i> Train</td>
	                <td title="Location"><div id="dvDistance3"></div></td>
	                <td title="Ibu Kota"><div id="dvDuration3"></div></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="#" value="#"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">flight</i> Aeroplane</td>
	                <td title="Location">-</td>
	                <td title="Ibu Kota">-</td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	        </table>
			</div>
		</div>
	</div>
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With ? by FrontEnd in Kosan Uda</div>

</form>

  </form>
</body>
</html>
