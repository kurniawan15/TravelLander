<%-- 
    Document   : dashboardCreateSchedule
    Created on : Sep 25, 2017, 11:53:00 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet">
	<link href="css/dashboard.css" type="text/css" rel="stylesheet">
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
					<li><a href="dashboardProfil.jsp" style="color: black;">MY PROFIL</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-cog"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                                        <li><a href="../logout.jsp" style="color: black;" >LOGOUT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
				</ul>
				</li>
			</ul>
		</div>
	</div>

	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 dashboard container-fluid">
		<div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 contentkiri visible-lg">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 co l-md-12 col-sm-12 col-xs-12 kiripilih">
				&nbsp;&nbsp;Create Schedule
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 kiri">
				&nbsp;&nbsp;Event List
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiribawah visible-lg">
				&nbsp;
			</div>
		</div>

		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-sm visible-md">
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmdpilih">
				&nbsp;&nbsp;Create Schedule
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirismmd">
				&nbsp;&nbsp;Event List
			</div>
		</div>

		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 contentkiri visible-xs">
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Dashboard
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixspilih">
				&nbsp;&nbsp;Create Schedule
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Finished Task
			</div>
			<div class="col-lg-12 col-md-3 col-sm-3 col-xs-3 kirixs">
				&nbsp;&nbsp;Event List
			</div>
		</div>

		<div class="col-lg-10 col-md-12 col-sm-12 col-xs-12 contentkanan">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul">
				<b>Create Schedule</b>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul2">
				<b>Please Input Created In here</b>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 InputNama">
				<div class="col-lg-3 col-md-6 col-sm-12 col-xs-12 textNama">
					Nama Acara
				</div>
				<div class="col-lg-9 col-md-6 col-sm-12 col-xs-12 formNama">
					<input type="text" name="nama_agenda" placeholder="Untitled event" size="26" maxlength="40">
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 InputWaktu">
				<div class="col-lg-3 col-md-6 col-sm-12 col-xs-12 textWaktu">
					Input Waktu
				</div>
				<div class="col-lg-9 col-md-6 col-sm-12 col-xs-12 formWaktu">
					<input type="datetime-local" style="width: 230px;" size="40" name="waktu_mulai" placeholder="start time">
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul3">
				Event Detail
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 startPoint">
				<div class="col-lg-3 col-md-6 col-sm-12 col-xs-12 textStart">
					Starting Point : Location
				</div>
				<div class="col-lg-9 col-md-6 col-sm-12 col-xs-12 formStart">
					<input type="text" id="txtautocomplete" size="26" maxlength="40" placeholder="Location"/>
                    <label id="lblresult"></label>
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 endPoint">
				<div class="col-lg-3 col-sm-6 col-xs-12 col-xs-12 textEnd">
					End Point
				</div>
				<div class="col-lg-9 col-md-6 col-sm-12 col-xs-12 formEnd">
					<input type="text" name="long_rumah" size="26" maxlength="40" placeholder="Posisi Akhir">
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 Destination">
				<div class="col-lg-3 col-md-6 col-sm-12 col-xs-12 textDest">
					Destination
				</div>
				<div class="col-lg-9 col-md-6 col-sm-12 col-xs-12 formDest">
					<input type="text" name="destination" size="26" maxlength="40" placeholder="Destinasi">
				</div>
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 HeaderJudul4">
				Transportation
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 pilihanTransport">
				<div class="wrap">
                    <form action="" class="choise">
                        <div class="radio">
                            <input type="radio" name="#1" id="mobil">
                                <label for="Mobil" style="width: 100px;">Mobil</label>
                                
                            <input type="radio" name="#2" id="motor">
                                <label for="Motor" style="width: 100px;">Motor</label>
                                
                            <input type="radio" name="#3" id="angkot">
                                <label for="Angkot" style="width: 100px;">Angkot</label>
                                
                            <input type="radio" name="#4" id="Bus">
                                <label for="Bus" style="width: 100px;">Bus</label>
                        </div>
                    </form>
            	</div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 submitAgenda">
				<input type="submit" style="width: 100px; height: 40px;" value="CREATE"/>
			</div>
		</div>
	</div>
</body>
</html>
