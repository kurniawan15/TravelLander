<%-- 
    Document   : mylist
    Created on : Dec 18, 2017, 8:52:56 PM
    Author     : Hari
--%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.NewEvent"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="model.NewLokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/grid.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
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
		<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar">
				<ul>
					<li class="none">Dashboard</li>
					<li class="none">My Calendar</li>
					<a href="addEvent.jsp"><li class="none">Add Event</li></a>
					<li cla<a href="mylist.jsp"><li class="none">My Event</li></a>
					<li class="none">History</li>
				</ul>
			</div>

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
			          <th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>
			          <th>Delete</th>
			          <th>View</th>
			      </tr>
                              <%
                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                      DAONewEvent kt = new DAONewEvent();
                      DAONewLokasi dLok = new DAONewLokasi();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      String ket = request.getParameter("ket");
                      kt.setKdEvent("");
                      if (ket == null) {
                          data = kt.cariID();
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                              %>
			      <tr>
				      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
			          <td style="font-size: 12px; line-height: 20px;"><%=x + 1%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%=data.get(x).getNamaEvent()%></td>
			          <td style="font-size: 12px; line-height: 20px;"><%=dLok.getLokasiAkhir(data.get(x).getKdEvent())%></td>
                                  <td style="font-size: 12px; line-height: 20px;"><%=format.format(data.get(x).getWaktuSelesai())%></td>
			          <td style="font-size: 12px; line-height: 35px;"><span class="glyphicon glyphicon-edit"></span></td>
			          <td style="font-size: 12px; line-height: 35px;"><span class="glyphicon glyphicon-trash"></span></td>
                                  <td style="font-size: 12px; line-height: 20px;"><button class="tablinks" id="defaultOpen"><span class="glyphicon glyphicon glyphicon-list"></span></button></td>
			      </tr>
                              <% 
                                }
                              %>
				      <script type="text/javascript">
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
			<div id="pageedit" class="tabcontent">
		      <h1 class="judul">Detail Event</h1>
			  <h2 class="h2detail">Detail</h2>
			    <p class="pdetail">Event Name &nbsp;&nbsp;:  </p>
			    <p class="pdetail">Event Time &nbsp;&nbsp;: 19.00 07/11/2017 until 21:30 07/11/2017</p>
			  
			  <h2 class="h2detail">Location</h2>
			  <p class="pdetail">Start Point &nbsp;&nbsp;: Hotel Amorossa Bandung</p>
			  <p class="pdetail">End Point &nbsp;&nbsp;: SMAN 20 Bandung</p>
			  <p class="pdetail">Description &nbsp;&nbsp;: Description of Event</p>

			  <h2 class="h2detail">Transportation</h2>
			  <p class="pdetail">Transport Name &nbsp;&nbsp;: Motorcycle</p>
			  <p class="pdetail">Distance &nbsp;&nbsp;: 0.55 KM</p>
			  <p class="pdetail">Estimated &nbsp;&nbsp;: 5 Minutes</p>
			  <p class="pdetail">Departure Time &nbsp;&nbsp;: 06:45</p>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 maptampil">
	     		<div id="map"><img class="img-responsive mapboong" style="margin-left: 80px;" src="img/3.jpg"></div>
	     	</div>
			</div>
  		</div>
  </div>
</article>
</div>
		</div>
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With ❤ by FrontEnd in Kosan Uda</div>
</body>
</html>
