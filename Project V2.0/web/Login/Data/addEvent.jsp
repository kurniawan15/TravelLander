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
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <title></title>
        <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2017.3.1026/styles/kendo.common-material.min.css" />
        <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2017.3.1026/styles/kendo.material.min.css" />
        <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2017.3.1026/styles/kendo.material.mobile.min.css" />
        <script src="https://kendo.cdn.telerik.com/2017.3.1026/js/jquery.min.js"></script>
        <script src="https://kendo.cdn.telerik.com/2017.3.1026/js/kendo.all.min.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&libraries=places"></script>      
</head>
<body>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header">
        <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri">
            <ul>
                <a href="home.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">home</i>&nbsp;&nbsp;&nbsp;Home</li></a>
                <li class="pilih"><i style="font-size: 14px;" class="material-icons">add</i>&nbsp;&nbsp;&nbsp;Add Event</li>
                <a href="mylist.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">toc</i>&nbsp;&nbsp;&nbsp;My Event</li></a>
            </ul>
        </div>
        <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri">
            <center><img class="img-responsive logo" src="img/logo1.png">
        </div>../../index.jsp
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan">
        </div>
        <div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown">
            <center><button onclick="myFunction()" class="dropbtn"><%out.println("Hi, ");%><%=session.getAttribute("USERNAME")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">arrow_drop_down</i></button></center>
              <div id="myDropdown" class="dropdown-content">
                <center><a href="../../index.jsp"
                           >Logout &nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">launch</i></a></center>
              </div>
        </div>
	</div>
    <form action="../../Event?data=event&proses=input-event" method="post">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage">
		<div class="col-lg-6 col-md-5 col-sm-12 col-xs-12 leftpage">
			

			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent">
			<article class="article">                               
  			<br>
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
                <script>
                    $(document).ready(function () {
                        // create DateTimePicker from input HTML element
                        $("#waktu_mulai").kendoDateTimePicker({
                            value: new Date(),
                            dateInput: true
                        });
                    });
                </script>
                <input id="waktu_mulai" name="waktu_mulai" title="datetimepicker" style="width: 49%;" />
			      <!--____________________________Form input waktu akhir--> 
                <script>
                    $(document).ready(function () {
                        // create DateTimePicker from input HTML element
                        $("#waktu_selesai").kendoDateTimePicker({
                            value: new Date(),
                            dateInput: true
                        });
                    });
                </script>
			    <input id="waktu_selesai" name="waktu_selesai" title="datetimepickerlast" style="width: 49%;" />   
			    </div>
    
    <!--____________________________Form Inputan Lokasi Awal____________________________-->
			    <div class="LokasiAwal">
			      <div id="calculate-route" name="calculate-route" action="#" method="get">
			            <h1 class="hlokasiawal">Start Location :</h1>
			            <input type="text" name="from"  id="txtSource" placeholder="Input First Location" size="30" style="width: 85%; height: 40px;" />
                                   
                        <button class="button1" type="button" id="from-link"onClick="getCurrentPosition()"/>Now</button>
			            <div class="LokasiAkhir">
			                <h1 class="hlokasiakhir">End Location :</h1>
			                <input type="text" name="to" id="txtDestination" placeholder="Input End Location" size="30" style="width: 85%; height: 40px;" />
                                        
                                        <button class="button1" type="button" onclick="GetRoute('DRIVING')"/>Get</button>
			            </div>
                              <div id="latLong">
                                    <input type="hidden" id="latitude_awal" name="latitude_awal"/>
                                    <input type="hidden" id="longitude_awal" name="longitude_awal"/>
                                    <input type="hidden" id="latitude_akhir" name="latitude_akhir"/>
                                    <input type="hidden" id="longitude_akhir" name="longitude_akhir"/>
                                </div>
			            
			      </div>
			    </div>
			    <script type="text/javascript">

                function myFunction() {
                    document.getElementById("myDropdown").classList.toggle("show");
                }

                // Close the dropdown if the user clicks outside of it
                window.onclick = function(event) {
                  if (!event.target.matches('.dropbtn')) {

                    var dropdowns = document.getElementsByClassName("dropdown-content");
                    var i;
                    for (i = 0; i < dropdowns.length; i++) {
                      var openDropdown = dropdowns[i];
                      if (openDropdown.classList.contains('show')) {
                        openDropdown.classList.remove('show');
                      }
                    }
                  }
                }
				function openCity(evt, cityName) {
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


        function getCurrentPosition(){
            navigator.geolocation.getCurrentPosition(function(position) {
            var geocoder = new google.maps.Geocoder();
            geocoder.geocode({
              "location": new google.maps.LatLng(position.coords.latitude, position.coords.longitude)
            },
            function(results, status) {
              if (status == google.maps.GeocoderStatus.OK)
                document.getElementById("txtSource").value = results[0].formatted_address;
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
        }
        
        function GetRoute(md){
            var mumbai = new google.maps.LatLng(18.9750, 72.8258);
            var mapOptions = {
                zoom: 7,
                center: mumbai
            };
            map = new google.maps.Map(document.getElementById('dvMap'), mapOptions);
            directionsDisplay.setMap(map);
            directionsDisplay.setPanel(document.getElementById('dvPanel'));
            
            //Enable all radio
            var moda = document.getElementsByName('moda');
            for (var i = 0, len = moda.length; i<len; i++){
                moda[i].disabled = false;
            }
                moda[2].checked = true;
            //*********DIRECTIONS AND ROUTE**********************//
            source = document.getElementById("txtSource").value;
            destination = document.getElementById("txtDestination").value;

            
            //Direction Service
            var request = {
                origin: source,
                destination: destination,
                travelMode: md
            };
            directionsService.route(request, function (response, status) {
                if (status == google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });
            
            /*SET lat long*/
            geocoder = new google.maps.Geocoder();
            geocoder.geocode({
            'address': source
            }, function(results, status) {      
                document.getElementById("latitude_awal").value = results[0].geometry.location.lat();    
                document.getElementById("longitude_awal").value =results[0].geometry.location.lng();        
            });
            
            geocoder.geocode({
            'address': destination
            }, function(results, status) {      
                document.getElementById("latitude_akhir").value = results[0].geometry.location.lat();    
                document.getElementById("longitude_akhir").value =results[0].geometry.location.lng();        
            });
            //Mengambil Start Time Dengan FORMAT 1/14/2018 5:50 PM
            var fullTgl = document.getElementById("waktu_mulai").value.toString().split(" ");
//            for(var i = 0, len = moda.length; i<len; i++){
//                alert(fullTgl[i]);
//            }
            var tgl = fullTgl[0].toString().split("/");
            var jam = fullTgl[1].toString().split(":");
        alert("Jam : " + jam[0]);    
        if(fullTgl[2] == 'PM' ){
                jam[0] = parseInt(jam[0]) + 12;
            }
            alert("Jam : " + jam[0]);
            
            var startTime = new Date(tgl[2],tgl[0] - 1,tgl[1],
                    jam[0],jam[1],0,0);
            
            alert(startTime);
            
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
                    var dvEstTime = document.getElementById("dvEstTime");
                    var dur = response.rows[0].elements[0].duration.value;
                    
                    var estTime = new Date(startTime.getTime() - dur * 1000);
                    var formatEstTime = estTime.getDate()+ "-" + estTime.getMonth() +1 + "-" + estTime.getFullYear()+ " " + estTime.getHours() + ":" + estTime.getMinutes();
                    
                    dvDistance.innerHTML = "";
                dvDuration.innerHTML = "";
                dvEstTime.innerHTML = "";
                
                    dvDistance.innerHTML += distance;
                    dvDuration.innerHTML += duration;
                    
                    dvEstTime.innerHTML +=  formatEstTime;


                } else {
                    alert("Unable to find the distance with walking.");
                    document.getElementById("radioWalk").disabled=true;
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
                dvDistance1.innerHTML = "";
                dvDuration1.innerHTML = "";
                dvEstTime1.innerHTML = "";
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance1");
                    var dvDuration = document.getElementById("dvDuration1");
                    var dvEstTime = document.getElementById("dvEstTime1");
                    var dur = response.rows[0].elements[0].duration.value;
                    
                    var estTime = new Date(startTime.getTime() - dur * 1000);
                    var formatEstTime = estTime.getDate()+ "-" + estTime.getMonth() +1 + "-" + estTime.getFullYear()+ " " + estTime.getHours() + ":" + estTime.getMinutes();
                   
                    
                    dvDistance1.innerHTML += distance;
                    
                    dvDuration1.innerHTML += duration;
                    
                    dvEstTime1.innerHTML += formatEstTime;
                } else {
                    alert("Unable to find the distance when driving with motorcycle.");
                    document.getElementById("radioCar").disabled=true;
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
                dvDistance2.innerHTML = "";
                dvDuration2.innerHTML = "";
                dvEstTime2.innerHTML = "";
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance2");
                    var dvDuration = document.getElementById("dvDuration2");
                    var dvEstTime = document.getElementById("dvEstTime2");
                    var dur = response.rows[0].elements[0].duration.value;
                    
                    var estTime = new Date(startTime.getTime() - dur * 1000);
                    var formatEstTime = estTime.getDate()+ "-" + estTime.getMonth() +1 + "-" + estTime.getFullYear()+ " " + estTime.getHours() + ":" + estTime.getMinutes();
                   
                    
                    dvDistance2.innerHTML += distance;
                    
                    dvDuration2.innerHTML += duration;
                    
                    dvEstTime2.innerHTML += formatEstTime;

                } else {
                    alert("Unable to find the distance via bus.");
                    document.getElementById("radioBus").disabled=true;
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
                dvDistance3.innerHTML = "";
                dvDuration3.innerHTML = "";
                dvEstTime3.innerHTML = "";
                if (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != "ZERO_RESULTS") {
                    var distance = response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance3");
                    var dvDuration = document.getElementById("dvDuration3");
                    var dvEstTime = document.getElementById("dvEstTime3");
                    var dur = response.rows[0].elements[0].duration.value;
                    
                    var estTime = new Date(startTime.getTime() - dur * 1000);
                    var formatEstTime = estTime.getDate()+ "-" + estTime.getMonth() +1 + "-" + estTime.getFullYear()+ " " + estTime.getHours() + ":" + estTime.getMinutes();
                   
                    
                    dvDistance3.innerHTML += distance;
                    
                    dvDuration3.innerHTML += duration;
                    
                    dvEstTime3.innerHTML += formatEstTime;

                } else {
                    alert("Unable to find the distance via train.");
                    document.getElementById("radioTrain").disabled=true;
            }
            });
            
            
        }
        
        function changeRoute(md){
            directionsDisplay.setMap(map);
            directionsDisplay.setPanel(document.getElementById('dvPanel'));
            
            
            
            
            //*********DIRECTIONS AND ROUTE**********************//
            source = document.getElementById("txtSource").value;
            destination = document.getElementById("txtDestination").value;

            var request;
            if(md == 'TRAIN' || md == 'BUS'){
                
               request = {
                origin: source,
                destination: destination,
                travelMode: google.maps.TravelMode.TRANSIT,
                transitOptions: {
                    modes: [md]
                  }
                };
            }
            else{
                request = {
                origin: source,
                destination: destination,
                travelMode: md
                };
            }
            
            directionsService.route(request, function (response, status) {
                if (status == google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });
            
            
        }
		</script>	
        <!--____________________________Tombol Submit or cancel____________________________--> 
		      <div class="col-12 enter">
		        <br><br><center>
                            <input type="button"  value="Clear" style="background-color: #0070cc; width: 100px; height: 30px;"/>
                        <input type="submit" value="Create" style="background-color: #004680; width: 100px; height: 30px; margin-bottom: 10px;">
		        </center>
		      </div>
			    
			</div>
		</div>
		<div class="col-lg-6 col-md-7 col-sm-12 col-xs-12 rightpage">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil">
                            <div id="dvMap" style="width: 655x; height: 280px; margin-top:10px;" ></div>
                            
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
                        <td title="NO"><input type="radio" name="moda" value="WALKING,0" id="radioWalk" onchange="changeRoute('WALKING')"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_walk</i> Walk</td>
                        <td title="Location"><div id="dvDistance"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration"></div></td>
                        <td title="Ibu Kota"><div id="dvEstTime"></div></td>
	            </tr>
	            <tr>
                        <td title="NO"><input type="radio" name="moda" value="DRIVING,1" id="radioMotor" onchange="changeRoute('DRIVING')"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_bike</i> Motorcycle</td>
	                <td title="Location"></td>
	                <td title="Ibu Kota"></td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="moda" value="DRIVING,0" id="radioCar" onchange="changeRoute('DRIVING')"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_car</i> Car</td>
	                <td title="Location"><div id="dvDistance1"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration1"></div></td>
	                <td title="Ibu Kota" ><div id="dvEstTime1"></div></td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="moda" value="BUS,0" id="radioBus" onchange="changeRoute('BUS')"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_bus</i> Bus</td>
	                <td title="Location"><div id="dvDistance2"></div></td>
                        <td title="Ibu Kota"><div id="dvDuration2"></div></td>
	                <td title="Ibu Kota"><div id="dvEstTime2"></div></td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="moda" value="TRAIN,0" id="radioTrain" onchange="changeRoute('TRAIN')"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">directions_subway</i> Train</td>
	                <td title="Location"><div id="dvDistance3"></div></td>
	                <td title="Ibu Kota"><div id="dvDuration3"></div></td>
	                <td title="Ibu Kota"><div id="dvEstTime3"></div></td>
	            </tr>
	            <tr>
	                <td title="NO"><input type="radio" name="moda" value="#" id="radioPlane"><br></td>
	                <td title="Event Name"><i class="material-icons" style="float: left;font-size: 20px; color: grey;">flight</i> Aeroplane</td>
	                <td title="Location">-</td>
	                <td title="Ibu Kota">-</td>
	                <td title="Ibu Kota">-</td>
	            </tr>
	        </table>
			</div>
		</div>
    </div>
  </form>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer">&copy; Kelompok B1 | Front End Team</div>


</body>
</html>
