<%-- 
    Document   : index
    Created on : Sep 17, 2017, 11:09:46 PM
    Author     : Delvin v
--%>

<%@page import="model.Traveller"%>
<%@page import="DAO.DAOTraveller"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<!DOCTYPE html>
<html>
<head>
	<title>TRAVELENDAR - Politeknik Negeri Bandung</title>
	<link href="css/grid.css" type="text/css" rel="stylesheet">
	<link href="css/style.css" type="text/css" rel="stylesheet">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>

<style>
body{
	background-image: url(img/1.jpg);
	background-position: center center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
<body>
    <%  response.setHeader("Cache-Control","no-cache"); //HTTP 1.1 
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 
        response.setDateHeader ("Expires", 0); //prevents caching at the proxy server  
       %>
	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-10 red col-lg-offset-4 col-md-offset-4 col-sm-offset-3 col-xs-offset-1">
			<div class="login-form">
				<h1><center><img class="img-responsive" src="img/logo.png"></center></h1>
				<br>

					<button class="tablink" onclick="openCity('login', this, '#25aae2')" id="defaultOpen">LOGIN</button>
					<button class="tablink" onclick="openCity('signup', this, '#25aae2')">SIGNUP</button>
					<div id="login" class="tabcontent">
					  <form action="traveller?data=traveller&proses=cek-traveller" method="post">
						<input type="text" name="USERNAME" placeholder="Username" style="text-align: left; font-size: 14px;">
						<input type="password" name="PASSWORD" placeholder="Password">
						<button type="submit" name="login" class="btn btn-primary btn-block" onclick="Dashboard.html">Login</button></a> 
					  </form>
					</div>

					<div id="signup" class="tabcontent">
					  <form action="traveller?data=traveller&proses=input-traveller" name="tipe" method="post"
					  	<input type="text" name="EMAIL" placeholder="Email" style="text-align: left; font-size: 14px;">
					  	
						<input type="text" name="NAMA_TRAVELLER" placeholder="Fullname"  style="text-align: left; font-size: 14px;">
                                                <input type="text" name="EMAIL" placeholder="Email" style="text-align: left; font-size: 14px;">
					  	<input type="text" name="USERNAME" placeholder="Username" style="text-align: left; font-size: 14px;">
						<input type="password" name="PASSWORD" placeholder="Password">
						<input type="password" name="CONFIRM_PASSWORD" placeholder="Confirm Password">		
					    <button type="submit" name="login" class="btn btn-primary btn-block" onclick="*">Submit</button>
					  </form> 
					</div>

					<script>
					function openCity(cityName,elmnt,color) {
					    var i, tabcontent, tablinks;
					    tabcontent = document.getElementsByClassName("tabcontent");
					    for (i = 0; i < tabcontent.length; i++) {
					        tabcontent[i].style.display = "none";
					    }
					    tablinks = document.getElementsByClassName("tablink");
					    for (i = 0; i < tablinks.length; i++) {
					        tablinks[i].style.backgroundColor = "";
					    }
					    document.getElementById(cityName).style.display = "block";
					    elmnt.style.backgroundColor = color;
                                            
                                            if(cityName == 'signup'){
                                                document.tipe.action="traveller?data=traveller&proses=daftar-traveller";
                                            }
                                            else{
                                                document.tipe.action="traveller?data=traveller&proses=input-traveller";
                                            }

					}
					// Get the element with id="defaultOpen" and click on it
					document.getElementById("defaultOpen").click();
					</script>

			</div>
	</div>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooterlogin"><i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&copy; Kelompok B1 | Made With <i style="color: red;">?</i> by FrontEnd in Kosan Uda</i></div>
</body>
</html>


