<%-- 
    Document   : dashboardProfil
    Created on : Sep 25, 2017, 11:41:16 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
	<link href="css/profil.css" type="text/css" rel="stylesheet">
<body>
                 <%
            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            %>
	<div class="col-lg-12 col-sm-12 col-xs-12 col-md-12 wrapper container-fluid">
		<div class="col-lg-6 col-sm-6 col-xs-6 col-md-6 menubar">
			&nbsp;&nbsp;HalooSource
		</div>
		<div class="col-lg-6 col-sm-6 col-xs-6 col-md-6 menubarLog">
			<ul>
				<li><span class="glyphicon glyphicon-user"> <%= nama %> </span>&nbsp;&nbsp;&nbsp;&nbsp;
				<ul>
					<li>AGENDA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li style="background-color: red; color: white;">MY PROFIL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-cog"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
					<li><a href="../logout.jsp" style="color: black;">LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
				</ul>
				</li>
			</ul>
		</div>
	</div>

	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 container-fluid dashboard">
		<div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;<a href="dashboardCreateSchedule.jsp" style="color: white;">Create Schedule</a>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Event list
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiribawah visible-lg">
				&nbsp;
			</div>
		</div>

		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-sm visible-md">
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Create Schedule
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Event list
			</div>
		</div>

		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs">
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Create Schedule
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Event list
			</div>
		</div>

		<div class="col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul">
				<b>My Profil</b>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 isiprofil">
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 fotoprofil">
					<center><span class="glyphicon glyphicon-user" style="font-size: 180px;"></center>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6 keteranganprofil">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 nama">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-10 textnama">
							Nama Lengkap
						</div>
						<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua">
							:
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 namalengkapuser">
							FULL_NAME_USER_1
						</div>
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 usernama">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-10 textusernama">
							Username
						</div>
						<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua">
							:
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 namauser">
							<%= nama %>
						</div>
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 birthday">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-10 textbirthday">
							Birthday
						</div>
						<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua">
							:
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 birthdayuser">
							BIRTHDAY_USER_1
						</div>
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 email">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-10 textemail">
							E-mail
						</div>
						<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 titikdua">
							:
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 emailuser">
							EMAIL_ADDRESS_USER_1
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 editprofil">
					<input type="submit" style="width: 100px; height: 40px;" value="EDIT PROFIL"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
