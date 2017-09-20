<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Helooo</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
<script type="text/javascript" src="Js/date.js"></script>
<script type="text/javascript" src="Js/place.js"></script>
<link rel="stylesheet" type="text/css" href="css/calendar.css">
</head>

<body>
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&signedin=true&libraries=places"></script>
	<div id="header">
    	<div class="logo"><a href="#">Haloo<span>Source</span></a></div>
    </div>
    
    <div id="container">
    	<div class="sidebar">
        <ul id="nav">
        	<li><a href="#">Dashboard</a></li>
            <li><a class="selected" href="#">Create scedule</a></li>
            <li><a href="#">Finished Task</a></li>
            <li><a href="#">Pending or Cancle</a></li>
             <%
            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            %>
            <li><a href="logout.jsp">LOGOUT</a></li>
      	</ul>
            
        <div id="calendar">
	    <p id="calendar-day"></p>
            <p id="calendar-date"></p>
            <p id="calendar-month-year"></p>
         </div>
            
    	</div>
        
    	<div class="content">
        	<h1></h1>
           <form name="myForm" action="addData.jsp" method="POST">
            <p>Create Scedule</p>
            
            <div id="box">
            	<div class="box-top">Please Input Created In here</div>
                <div class="box-panel">
                <h2></h2>
                	<div id="imput1">
                    	nama acara       : 
                		<input type="text" name="event" placeholder="Untitled event">
                    </div>
                    <div id="imput2">
                    	Imput waktu :
                    	<input type="datetime-local" name="arrive" placeholder="start time"> until 
                    	<input type="datetime-local" name="depart" placeholder="end time">
                    </div>
                    <div id="boxin">
                    	Event Details
                    </div>
                    <div id="imput3">
                    	Sarting Point 	:
                    	<input type="text" name="start" style="width:52%" placeholder="Posisi Akhir">
           			</div>
                    <div id="imput5">
                    Destination	:
                    	<input type="text" name="destination" style="width:51%" placeholder="enter a location">
                    </div>
                    <div class="wrap">
                        <form action="" class="choise">
                            <div class="radio">
                                <h2>Transportation</h2>
                                <input type="radio" name="transfortation" id="Sepedah">
                                    <label for="Sepedah">Sepedah</label>
                                    
                              <input type="radio" name="transfortation" id="Mobil">
                                    <label for="Mobil">Mobil</label>
                                    
                                <input type="radio" name="transfortation" id="Motor">
                                    <label for="Motor">Motor</label>
                                    
                                <input type="radio" name="transfortation" id="Pesawat">
                                    <label for="Pesawat">Pesawat</label>
                                    
                              	<input type="radio" name="transfortation" id="Perahu">
                                    <label for="Perahu">Perahu</label>
                 		
                                 <input type="radio" name="transfortation" id="Kereta">
                                    <label for="Kereta">Kereta</label>
                                    
                           		<input type="radio" name="transfortation" id="Kendaraan_Umum">
                                    <label for="Kendaraan_Umum">Kendaraan Umum</label>
                            </div>
                        </form>
                	</div>    
                    <input type="submit" name="#" value=" created"> 
               	
                </div>
    	</div
    </div>
    </body>
</html>
