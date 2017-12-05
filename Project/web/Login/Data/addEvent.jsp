<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
   <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag"></script>
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
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="namaevent">
      <h1 class="hnamaevent">Event Name :</h1>
      <input type="text" id="fname" name="nama_event" placeholder="Input Event Name">
    </div>
    
    <!--____________________________Form Inputan Waktu Event____________________________-->
    <div class="waktu">
      <h1 class="hwaktu">Event Time :</h1>
      <!--____________________________Form input waktu awal____________________________-->
      <input type="datetime-local" name="waktu_mulai" placeholder="start time"> <i>&nbsp;until&nbsp;</i>
      <!--____________________________Form input waktu akhir--> 
      <input type="datetime-local" name="waktu_selesai" placeholder="End time">   
    </div>
    
    <!--____________________________Form Inputan Lokasi Awal____________________________-->
    <div class="LokasiAwal">
      <div class="title"><b><br>Location</b></div>
      <form id="calculate-route" name="calculate-route" action="#" method="get">
            <h1 class="hlokasiawal">Start Location :</h1>
            <input type="text" id="from" name="from" required="required" placeholder="lokasi awal" size="30" />
            <a id="from-link" href="#">Posisi sekarang</a>
            <div class="LokasiAkhir">
                <h1 class="hlokasiakhir">End Location :</h1>
                <input type="text" id="to" name="to" required="required" placeholder="lokasi akhir" size="30" />
            </div>
            
            <input type="submit" value="cari lokasi" />
            <input type="text" id="latAwal">
            <input type="text" id="longAwal">
            <br>
            <input type="text" id="latAkhir">
            <input type="text" id="longAkhir">
      </form>
    </div>
     <div id="map"></div>
    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   
    
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="keteranganevent">
      <h1 class="hketevent">Event Description :</h1>
      <input type="text" id="fname" name="keterangan" placeholder="Input Event Description">
    </div>

    <!--____________________________Form Inputan Transportasi____________________________-->   
    <div class="Transportasi">
        <input type="text" id="tipe_moda" name="tipe_moda">
      <h1 class="htransportasi">Transportation :</h1>
      <div class="tab">
        <button class="tablinks" onclick="openCity(event, 'Umum')" id="defaultOpen">Umum</button>
        <button class="tablinks" onclick="openCity(event, 'Pribadi')">Pribadi</button>
      </div>
      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
      <script type="text/javascript">
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
          
      </script>
        <!--____________________________isi option di kendaraan umum____________________________-->      
        <div id="Umum" class="tabcontent">
        <select id="UmumModa" name="kd_moda">
          <option value="Taksi">Taksi</option>
          <option value="Bus">Bus</option>
          <option value="Kereta">Kereta</option>
          <option value="Pesawat">Pesawat</option>
        </select>     
        </div>
        <!--____________________________isi option di kendaraan pribadi____________________________--> 
        <div id="Pribadi" class="tabcontent">
        <select id="PribadiModa" name="kd_transport_pribadi">
          <option value="Sepeda">Sepeda</option>
          <option value="Motor">Motor</option>
          <option value="Mobil">Mobil</option>
        </select>      
        </div>

        <!--____________________________Tombol Submit or cancel____________________________--> 
      <div class="col-12 enter">
        <br>
        <input type="submit" value="Cancel" style="background-color: red;">
        <input type="submit" value="Create Schedule">
      </div><br> 
      </div>
    </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
