<%-- 
    Document   : mylist
    Created on : Dec 18, 2017, 8:52:56 PM
    Author     : Hari
--%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="DAO.DAOEventNext"%>
<%@page import="model.EventNext"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.NewEvent"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="model.NewLokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/grid.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
           <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
</head>
<body>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header">
        <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri">
        	 <ul>
                <a href="home.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">home</i>&nbsp;&nbsp;&nbsp;Home</li></a>
                <a href="addEvent.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">add</i>&nbsp;&nbsp;&nbsp;Add Event</li></a>
                <li class="pilih"><i style="font-size: 14px;" class="material-icons">toc</i>&nbsp;&nbsp;&nbsp;My Event</li>
            </ul>
        </div>
        <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri">
            <center><img class="img-responsive logo" src="img/logo1.png">
        </div>
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan">
        </div>
        <div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown">
            <center><button onclick="myFunction()" class="dropbtn">Hi, Fajar Panca Saputra&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">arrow_drop_down</i></button></center>
              <div id="myDropdown" class="dropdown-content">
                <center><a href="#contact">Logout &nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">launch</i></a></center>
              </div>
        </div>
	</div>
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage">
		<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish">

			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent">
			<article class="article">
			  <div class="contentlist">
			  <div id="main">                                         
			  <br><br>
			  <h1 class="judul">Event List</h1>
			   <table class="table">
			      <tr>
			          <th>NO</th>
			          <th>Event Name</th>
			          <th>Event Location</th>
			          <th>Date & Time</th>
			          <th>Edit</th>
			          <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Delete</th>
			          <th>&nbsp;&nbsp;&nbsp;&nbsp;View</th>
			      </tr>
                             <%
                                  
                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                      //DAONewEvent kt = new DAONewEvent();
                      DAOEventNext nx = new DAOEventNext();
                      DAONewLokasi dLok = new DAONewLokasi();
                      List<EventNext> data = new ArrayList<EventNext>();
                      try{
                      String ket = request.getParameter("ket");
                      nx.setKdTraveller("");
                      if (ket == null) {
                          data = nx.getEventNext("TD001");
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                              %>
			      <tr>
				      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
			          <td style="font-size: 12px; line-height: 20px;"><%=x + 1%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%=data.get(x).getNamaEvent()%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%=dLok.getLokasiAkhir(data.get(x).getKdEvent())%></td>
                                  <td style="font-size: 12px; line-height: 20px;"><%=format.format(data.get(x).getWaktuSelesai())%></td>
			          <td style="font-size: 12px; line-height: 45px;"><a href="edit.html"><i style="font-size: 20px; color: grey;" class="material-icons">edit</i></a></td>
			          <td><button class="btn"><i style="font-size: 19px; text-align: center;" class="material-icons">delete</i></button>
							<div class="popup">
								<span id="close">&times;</span>
								<p class="confirm">Do you want to delete this event?</p>
								<div class="option">
									<a class="confirmbtn" href="">cancel</a>
									<a class="confirmbtn" href="">delete</a>
								</div>
							</div>
						<div class="cover"></div>
						<script src="js/jquery.min.js"></script>
						<script>
							$(document).ready(function(){
								$(".btn").on('click', function(){
									$(".cover").fadeIn('slow');
									$(".popup").fadeIn('slow');
								});
								$(".popup").on('click', function(){
									if($(event.target).is("#close")){
										$(".cover").fadeOut('slow');
										$(".popup").fadeOut('slow');
									}
								});
								$('.cover').on('click', function(){
									$(".cover").fadeOut('slow');
									$(".popup").fadeOut('slow');
								});
							});
						</script>	</td>
                                  <td style="font-size: 12px; line-height: 20px; background-color: none;"><a href="?kd_event=<%=data.get(x).getKdEvent()%>"><button class="tablinks" id="defaultOpen" onclick="opencity('tabcontent','pageedit')"><i style="font-size: 20px; color: grey;" class="material-icons">subject</i></a></td>
			      		</tr>

                               <% 
                                }
                              %>
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

				        function openCity(evt, editEvent) {
				          var i, tabcontent, tablinks; //deklarasi variabel
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
				          document.getElementById(editEvent).style.display = "block";
				          evt.currentTarget.className += " active";
				          }
				      </script>
			      </table>
			  </div>
  		</div>
</article>
  </div>
		</div>
                
		<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 rightpage">
			<!--<div id="pageedit" class="tabcontent">-->
<<<<<<< HEAD
			<br>
			<div class="col-lg-1"></div>
			<div class="col-lg-10 col-md-12 col-sm-12 col-xs-12 tableviews">
			<table class="tableview" id="">
	            <tr>
	                <th>Event Name</th>
	                <th>Event Time</th>
	            </tr>
	            <tr>
	                <td title="EventName"> - </td>
	                <td title="EventTime"> - </td>
	            </tr>
	        </table>
	        <br><br>
	        <table class="tableview" id="">
	            <tr>
	                <th>End Point</th>
	                <th>Description</th>
	            </tr>
	            <tr>
	                <td title="EndPoint"> - </td>
	                <td title="Description"> - </td>
	            </tr>
	        </table>
	        <br><br>
	        <table class="tableview" id="">
	            <tr>
	                <th>Transport Name</th>
	                <th>Distance</th>
	                <th>Estimated</th>
	                <th>Departure Time</th>
	            </tr>
	            <tr>
	                <td title="Transport"> - </td>
	                <td title="Distance"> - </td>
	                <td title="Estimated"> - </td>
	                <td title="Departure"> - </td>
	            </tr>
	        </table>
	        <br>
	    </div>
=======
		      <h1 class="judul">Detail Event</h1>
                      <%
                          if(request.getParameter("kd_event")!= null){
                                String kd = request.getParameter("kd_event");
                                kt.setKdEvent(kd);
                                List<NewEvent> ev = new ArrayList<NewEvent>();
                                ev = kt.cariID();
                      %>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul">
			  <h2 class="h2detail">Detail</h2>
                      </div>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1">
                          <p class="pdetail">Event Name &nbsp;&nbsp;:  <%=ev.get(0).getNamaEvent()%></p>
			  <p class="pdetail">Event Time &nbsp;&nbsp;: <%=format.format(ev.get(0).getWaktuMulai())%> until <%=format.format(ev.get(0).getWaktuSelesai())%></p>
                      </div>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul">
			  <h2 class="h2detail">Location</h2>
                      </div>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1">
                          
                      <p class="pdetail">End Point &nbsp;&nbsp;:<%=dLok.getLokasiAkhir(kd)%></div></p>  <div id="end">
			  <p class="pdetail">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Description &nbsp;&nbsp;: <%=ev.get(0).getKeterangan()%></p>
                      </div>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1judul">
			  <h2 class="h2detail">Transportation</h2>
                      </div>
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 detail1">
			  <p class="pdetail">Transport Name &nbsp;&nbsp;: Motorcycle</p>
                          <p class="pdetail"><div id="dvDistance" style="margin-left: 100px;"></div></p>
			  <p class="pdetail"><div id="dvDuration" style="margin-left: 100px;"></div></p>
			  <p class="pdetail">Departure Time &nbsp;&nbsp;: 06:45</p>
                      </div>
>>>>>>> 778e259681649414cafec075744af6c4cd8257df
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil">
            <div class="col-lg-1"></div>                
			<div class="col-lg-10" id="map" style="width: 530px; height:280px;"></div>
	     	</div>

    <script type="text/javascript">               
      
      function initMap() {
        var directionsService = new google.maps.DirectionsService;
        var directionsDisplay = new google.maps.DirectionsRenderer;
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 7,
          center: {lat: 41.85, lng: -87.65}
        });
        directionsDisplay.setMap(map);

        var onChangeHandler = function() {
          calculateAndDisplayRoute(directionsService, directionsDisplay);
        };
        document.getElementById('start').addEventListener('change', onChangeHandler);
        document.getElementById('end').addEventListener('change', onChangeHandler);
      }

      function calculateAndDisplayRoute(directionsService, directionsDisplay) {
        directionsService.route({
          origin: document.getElementById('start').value,
          destination: document.getElementById('end').value,
          
          travelMode: 'DRIVING'
        }, function(response, status) {
          if (status === 'OK') {
            directionsDisplay.setDirections(response);
            alert(origin);
          } else {
            window.alert('Directions request failed due to ' + status);
          }
        });
      }

<<<<<<< HEAD
      var deleteLinks = document.querySelectorAll('.delete');

		for (var i = 0; i < deleteLinks.length; i++) {
		  deleteLinks[i].addEventListener('click', function(event) {
			  event.preventDefault();

			  var choice = confirm(this.getAttribute('data-confirm'));
=======
      //*********DISTANCE AND DURATION WALKING**********************//
>>>>>>> 778e259681649414cafec075744af6c4cd8257df

			  if (choice) {
			    window.location.href = this.getAttribute('href');
			  }
		  });
		}
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&callback=initMap">
    </script>              
			
                     
  		</div>
  </div>
</article>
</div>
		</div>
<<<<<<< HEAD
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer">&copy; Kelompok B1 | Front End Team</div>
=======
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With â¤ by FrontEnd in Kosan Uda</div>
>>>>>>> 778e259681649414cafec075744af6c4cd8257df
</body>
</html>