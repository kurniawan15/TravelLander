<%-- 
    Document   : finish
    Created on : Dec 18, 2017, 9:06:36 PM
    Author     : Hari
--%>

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
			Hi, Fajar&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span>
		</div>
	</div>
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage">
		<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 leftpagefinish">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar">
				<ul>
					<li class="none">Dashboard</li>
					<li class="none">My Calendar</li>
					<a href="addEvent.jsp"><li class="none">Add Event</li></a>
					<a href="mylist.jsp"><li class="none">My Event</li></a>
					<li class="pilih">History</li>
				</ul>
			</div>

			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 isicontent">
			<article class="article">
			  <div class="contentlist">
			  <div id="main">                                         
			  <br><br>
			  <h1 class="judul">History</h1>
			  <h2 class="ftask">[Completed Event]</h2>
			   <table class="table">
			      <tr style="background-color: white;">
			          <td style="font-size: 11px;">20 September 2017</td>
			          <td style="font-size: 11px;">Pengawasan dan Pelatihan</td>
			          <td style="font-size: 11px;">SMAN 20 BANDUNG</td>
			          <td style="font-size: 11px;">Car</td>
			          <td style="font-size: 12px; line-height: 20px;">21-09-2017, 17.00</td>
			          <td style="font-size: 12px;"><button class="tablinks" onclick="openCity(event, 'pageedit')" id="defaultOpen" style="background-color: red; height: 20px; width: 100%; color: white;">View</span></button></td>
			      </tr>
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
		      <h1 class="judul2">Detail Event</h1>
			  <h2 class="h2detail">Detail</h2>
			    <p class="pdetail">Event Name &nbsp;&nbsp;: Pertemuan Pengawas </p>
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
			  <br><br>
			</div>
		</div>
	</div>

	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With ❤ by FrontEnd in Kosan Uda</div>
</body>
</html>
