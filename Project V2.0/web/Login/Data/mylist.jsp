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
	<link rel="stylesheet" type="text/css" href="css/style2.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
            <center><button onclick="myFunction()" class="dropbtn"><%out.println("Hi, ");%><%=session.getAttribute("USERNAME")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">arrow_drop_down</i></button></center>
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
                      NewLokasi lokAwal = new NewLokasi();
                      NewLokasi lokAkhir = new NewLokasi();
                      String ket = request.getParameter("ket");
                      
                      if (ket == null) {
                          data = nx.getEventNext(session.getAttribute("KdTraveller").toString());
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                              %>
			      <tr>
				      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
			          <td style="font-size: 12px; line-height: 20px;"><%=x + 1%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%=data.get(x).getNamaEvent()%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%NewLokasi l = new NewLokasi(); l = dLok.getLokasiAkhir(data.get(x).getKdEvent()); out.println(l.getNamaLokasi());%></td>
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
						<script src="Js/jquery.min.js"></script>
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
                <%
                    if(request.getParameter("kd_event")!=null){
                        String kd = request.getParameter("kd_event");
                        
                        DAONewEvent dEv = new DAONewEvent();
                        
                        List<NewEvent> ev = new ArrayList<NewEvent>();
                        dEv.setKdEvent(kd);

                        ev = dEv.cariID();
                        lokAwal = dLok.getLokasiAwal(kd);
                        lokAkhir = dLok.getLokasiAkhir(kd);
                        
//                      ev.get(0).get
                %>
			<br>
			<div class="col-lg-1"></div>
			<div class="col-lg-10 col-md-12 col-sm-12 col-xs-12 tableviews">
			<table class="tableview" id="">
	            <tr>
	                <th>Event Name</th>
	                <th>Event Time</th>
	            </tr>
	            <tr>
	                <td title="EventName"> <%=ev.get(0).getNamaEvent()%> </td>
                        <td title="EventTime"><%=format.format(ev.get(0).getWaktuMulai())%></td>
	            </tr>
	        </table>
	        <br><br>
	        <table class="tableview" id="">
	            <tr>
	                <th>End Point</th>
	                <th>Description</th>
	            </tr>
	            <tr>
                        <td title="EndPoint"> <%=lokAwal.getNamaLokasi()%> </td>
	                <td title="Description"><%=ev.get(0).getKeterangan()%></td>
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
	                <td title="Transport"> <%=ev.get(0).getTravelMode()%> </td>
                        <td title="Distance"><div id="distance"></div></td>
	                <td title="Estimated"><div id="est_time"></div></td>
	                <td title="Departure"><div id="dept_time"></div></td>
	            </tr>
	        </table>
	        <br>
	    </div>

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

          calculateAndDisplayRoute(directionsService, directionsDisplay);
       
//        document.getElementById('start').addEventListener('change', onChangeHandler);
//        document.getElementById('end').addEventListener('change', onChangeHandler);
      }

      function calculateAndDisplayRoute(directionsService, directionsDisplay) {
        directionsService.route({
          origin: '<%=lokAwal.getAlamat()%>',
          destination: '<%=lokAkhir.getAlamat()%>',
          <%if(ev.get(0).getTravelMode().equals("TRAIN") || ev.get(0).getTravelMode().equals("BUS")){%>
                travelMode: google.maps.TravelMode.TRANSIT,
                    transitOptions: {
                    modes: ['<%=ev.get(0).getTravelMode()%>']
                  }
          <%} else{
                %>
                travelMode: '<%=ev.get(0).getTravelMode()%>'
                <%
            }%>
        }, function(response, status) {
          if (status === google.maps.DirectionsStatus.OK) {
            directionsDisplay.setDirections(response);
            alert(origin);
          } else {
            window.alert('Directions request failed due to ' + status);
          }
        });
      }


      var deleteLinks = document.querySelectorAll('.delete');

		for (var i = 0; i < deleteLinks.length; i++) {
		  deleteLinks[i].addEventListener('click', function(event) {
			  event.preventDefault();

			  var choice = confirm(this.getAttribute('data-confirm'));

      //*********DISTANCE AND DURATION WALKING**********************//


			  if (choice) {
			    window.location.href = this.getAttribute('href');
			  }
		  });
		}
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBv4kFWkwB0XYeqOlfLxT0ZYsc4DRyNdag&callback=initMap">
    </script>              
			
                     
  		</div><%
                }
                %>
  </div>
</article>
</div>
		</div>

	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With â¤ by FrontEnd in Kosan Uda</div>
</body>
</html>