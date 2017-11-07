<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<%@page import="model.TransportasiPribadi"%>
<%@page import="DAO.DAOTransportasiPribadi"%>
<%@page import="model.TransportasiPublik"%>
<%@page import="DAO.DAOTransportasiPublik"%>
<%@page import="model.Lokasi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAOLokasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-------------------------------------------------------------------------->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag"></script>
    
    <!--____________________________Call Css Page Input____________________________-->
    <link rel="stylesheet" href="css/Createschedule.css">
    <!--____________________________Title Website____________________________-->
    <title>Travelendar - Input Schedule</title>
</head>
<!--____________________________Background page____________________________-->
<style>
  body{
    background-image: url(img/2.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
<body>
  <!--____________________________Header-Menu____________________________-->
  <nav class="navbar">
    <span class="open-slide">
      <a href="#" onclick="openSlideMenu()">
      <svg width="30" height="30">
      <path d="M0,5 30,5" stroke="#fff"stroke-width="5"/>
      <path d="M0,14 30,14" stroke="#fff" stroke-width="5"/>
      <path d="M0,23 30,23" stroke="#fff" stroke-width="5"/>
      </svg>
      </a>
    </span>
    <!--____________________________Tombol-Logout____________________________-->
    <ul id="dropdown">
      <li><a href="#">Log Out</a></li>
    </ul>
    <!--____________________________Script Fungsi Slide Menu____________________________-->
    <script>
      function openSlideMenu(){
        //ukuran menu ketika ditampilkan
        document.getElementById('side-menu').style.width = '250px';
        document.getElementById('main').style.marginLeft = '250px';
      }

      function closeSlideMenu(){
        //ukuran menu ketika dihide
        document.getElementById('side-menu').style.width = '0';
        document.getElementById('main').style.marginLeft = '0';
      }
    /*----------------------------------API------------------------------------*/  
    
    var geocoder;
    var map;
    var marker;

    /*
     * Google Map with marker
     */
    function initialize() {
        var initialLat = $('.search_latitude').val();
        var initialLong = $('.search_longitude').val();
        initialLat = initialLat?initialLat:36.169648;
        initialLong = initialLong?initialLong:-115.141000;

        var latlng = new google.maps.LatLng(initialLat, initialLong);
        var options = {
            zoom: 16,
            center: latlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("geomap"), options);

        geocoder = new google.maps.Geocoder();

        marker = new google.maps.Marker({
            map: map,
            draggable: true,
            position: latlng
        });

        google.maps.event.addListener(marker, "dragend", function () {
            var point = marker.getPosition();
            map.panTo(point);
            geocoder.geocode({'latLng': marker.getPosition()}, function (results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    map.setCenter(results[0].geometry.location);
                    marker.setPosition(results[0].geometry.location);
                    $('.search_addr').val(results[0].formatted_address);
                    $('.search_latitude').val(marker.getPosition().lat());
                    $('.search_longitude').val(marker.getPosition().lng());
                }
            });
        });

    }

    $(document).ready(function () {
        //load google map
        initialize();

        /*
         * autocomplete location search
         */
        var PostCodeid = '#search_location';
        $(function () {
            $(PostCodeid).autocomplete({
                source: function (request, response) {
                    geocoder.geocode({
                        'address': request.term
                    }, function (results, status) {
                        response($.map(results, function (item) {
                            return {
                                label: item.formatted_address,
                                value: item.formatted_address,
                                lat: item.geometry.location.lat(),
                                lon: item.geometry.location.lng()
                            };
                        }));
                    });
                },
                select: function (event, ui) {
                    $('.search_addr').val(ui.item.value);
                    $('.search_latitude').val(ui.item.lat);
                    $('.search_longitude').val(ui.item.lon);
                    var latlng = new google.maps.LatLng(ui.item.lat, ui.item.lon);
                    marker.setPosition(latlng);
                    initialize();
                }
            });
        });

        /*
         * Point location on google map
         */
        $('.get_map').click(function (e) {
            var address = $(PostCodeid).val();
            geocoder.geocode({'address': address}, function (results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    map.setCenter(results[0].geometry.location);
                    marker.setPosition(results[0].geometry.location);
                    $('.search_addr').val(results[0].formatted_address);
                    $('.search_latitude').val(marker.getPosition().lat());
                    $('.search_longitude').val(marker.getPosition().lng());
                } else {
                    alert("Geocode was not successful for the following reason: " + status);
                }
            });
            e.preventDefault();
        });

        //Add listener to marker for reverse geocoding
        google.maps.event.addListener(marker, 'drag', function () {
            geocoder.geocode({'latLng': marker.getPosition()}, function (results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    if (results[0]) {
                        $('.search_addr').val(results[0].formatted_address);
                        $('.search_latitude').val(marker.getPosition().lat());
                        $('.search_longitude').val(marker.getPosition().lng());
                    }
                }
            });
        });
    });
</script>
      
      
    </script>
  </nav>
<form action="../../addEvent?data=event&proses=input-event" method="post">
  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="#">Dashboard</a>                                                                  
    <a href="addEvent.jsp">Create Schedule</a>
    <a href="#">Finished Task</a>
    <a href="listData.jsp">Event List</a>
    <a href="../Admin/jarak.jsp">Manage</a>
  </div>

  <!--____________________________Isi Content Tabel Inputan____________________________-->
  <div class="main-content">
    <div id="main">                                         
    <div class="widget">
    <div class="title">Create Schedule</div>
    

    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="namaevent">
      <h1 class="hnamaevent">Event Name :</h1>
      <input type="text" id="fname" name="nama_event" placeholder="Input Event Name">
    </div>
    
    <!--____________________________Form Inputan Waktu Event____________________________-->
    <div class="waktu">
      <h1 class="hwaktu">Event Time :</h1>
      <!--____________________________Form input waktu awal____________________________-->
      <input type="datetime-local" style="width: 230px; border-radius:5px;
      box-sizing: border-box; width: 45.6%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;" name="waktu_mulai" placeholder="start time"> <i>&nbsp;until&nbsp;</i>
      <!--____________________________Form input waktu akhir--> 
      <input type="datetime-local" style="width: 230px; border-radius:5px;
      box-sizing: border-box; width: 45.6%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;" name="waktu_selesai" placeholder="End time">   
    </div>
    
    <!--____________________________Form Inputan Lokasi Awal____________________________-->
    <div class="LokasiAwal">
      <h1 class="hlokasiawal">Start Location :</h1>
      <select id="LokasiAwal" name="kd_lokasi_awal">
         <%
             DAOLokasi dLok = new DAOLokasi();
             List<Lokasi> lok = new ArrayList<Lokasi>();
             lok = dLok.tampil();
             
             for(Lokasi l:lok){
         %>
        <option value="<%=l.getKdLokasi()%>"><%=l.getNamaLokasi()%></option>
        <%
            }
        %>
      </select>     
    </div>
    
    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   
    <div class="LokasiAkhir">
      <h1 class="hlokasiakhir">End Location :</h1>
      <select id="LokasiAkhir" name="kd_lokasi_akhir">
        <%
             for(Lokasi l:lok){
         %>
        <option value="<%=l.getKdLokasi()%>"><%=l.getNamaLokasi()%></option>
        <%
            }
        %>
      </select> 
    </div>
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="keteranganevent">
      <h1 class="hketevent">Event Description :</h1>
      <input type="text" id="fname" name="keterangan" placeholder="Input Event Description">
    </div>

    <!--____________________________Form Inputan Transportasi____________________________-->   
    <div class="Transportasi">
      <h1 class="htransportasi">Transportation :</h1>
      <div class="tab">
         <input type="hidden" name="jenis_moda" id="jenis_moda">
        <button type="button" class="tablinks" onclick="openCity(event, 'Umum')" id="defaultOpen">Umum</button>
        <button type="button" class="tablinks" onclick="openCity(event, 'Pribadi')">Pribadi</button>
      </div>
      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
      
      <script type="text/javascript">
        function openCity(evt, cityName) {
          var i, tabcontent, tablinks; //deklarasi variabel
          //
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
          
           document.getElementById("jenis_moda").value = cityName;
                    }
      </script>
     
        <!--____________________________isi option di kendaraan umum____________________________-->      
        <div id="Umum" class="tabcontent">
        <select id="UmumModa" name="kd_transportasi_publik">
            <%
                DAOTransportasiPublik dTransP = new DAOTransportasiPublik();
                List<TransportasiPublik> listTP = new ArrayList<TransportasiPublik>();
                listTP = dTransP.tampil();
                for(TransportasiPublik tp : listTP){
            %>
                <option value=" <%=tp.getKdTransportasiPublik()%>"> <%=tp.getNamaTransportasiPublik()%></option>
            <%
                }
            %>
        </select>     
        </div>
        <!--____________________________isi option di kendaraan pribadi____________________________--> 
        <div id="Pribadi" class="tabcontent">
        <select id="PribadiModa" name="kd_transportasi_pribadi">
          <%
                DAOTransportasiPribadi dTransPr = new DAOTransportasiPribadi();
                List<TransportasiPribadi> listTPr = new ArrayList<TransportasiPribadi>();
                listTPr = dTransPr.tampil();
                for(int x = 0; x < listTPr.size(); x++){
            %>
                <option value="<%=listTPr.get(x).getKdTansportasiPribadi()%>"> <%=listTPr.get(x).getNamaTransportasiPribadi()%></option>
            <%
                }
            %>
        </select>      
        </div>
      </div><br>

      <!--____________________________Tombol Submit or cancel____________________________--> 
      <div class="col-12 enter">
        
            <input type="submit" value="Create Schedule">
        
            <input type="submit" value="Cancel" style="background-color: red;">
      </div><br> 
      

      </div>
      </div>   

</form> 
<!-------------------------------------API INPUT-------------------------------->
<form>
<div class="form-group input-group">
    <input type="text" id="search_location" class="form-control" placeholder="Search location">
    <div class="input-group-btn">
        <button class="btn btn-default get_map" type="submit">
            Locate
        </button>
    </div>
</div>
</form>
<div id="geomap"></div>
    </div>
    <!--____________________________Footer Page____________________________--> 
    <div class="footer">
        <a href="addEvent.jsp"></a>
      <div class="footkiri">
        <img class="logoweb" src="img/L21.png">
      </div>
      <div class="footkanan">
        <p class="pfooter">  
        ©Copyright Kelompok B1 [<i><b>Brave Heart-Group</b></i>] | Front-End [Made With Love] | October 2017</p>
      </div>
    </div>
</body>
</html>