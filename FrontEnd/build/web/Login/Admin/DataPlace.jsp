<%-- 
    Document   : Data Place
    Created on : Sep 25, 2017, 8:51:22 PM
    Author     : Cyber Pegasus
--%>

<%@page import="repository.LokasiDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Lokasi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Super Admin</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
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
    <ul id="dropdown">
    	<li><a href="../logout.jsp">Log Out</a></li>
    </ul>
  </nav>

  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="calender.jsp">Calendar</a>                                                                                   
    <a class="selected" href="#">Manage Place</a>
    <a href="distance.jsp">Manage Distance</a>
    <a href="time.jsp">Manage Time</a>
    <a href="transportation.jsp" >Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">Manage Place</div>
            <table class="table">
            <tr>
                <th>NO</th>
                <th>Adrees</th>
                <th>Place</th>
                <th>Action</th>
            </tr>
            
            <%
                String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
                String jdbc = "jdbc:mysql://";  
                String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
                String port = "3306/"; // Port ini port MySQL  
<<<<<<< HEAD
                String database = "travelendar2"; // Ini Database yang akan digunakan  
=======
                String database = "travelender"; // Ini Database yang akan digunakan  
>>>>>>> 853f31a687a7bfcffa0fc9fdfe8e15263170b679
                String jdbcURL = jdbc + host + port + database;  
                String jdbcUsername = "root"; // username default mysql  
                String jdbcPassword = "";
                
                List<Lokasi> listLokasi = new ArrayList();
                LokasiDAO lokasiDAO = new LokasiDAO(jdbcURL, jdbcUsername, jdbcPassword);
                listLokasi = lokasiDAO.listAll();
                 int i = 1;
                for(Lokasi lo : listLokasi){
                    %>
            <tr>
                <td title="NO"><%=i%></td>
                <td title="Adrees"><% out.print(lo.getAlamat());%> </td>
                <td title="Place"><% out.print(lo.getNamaLokasi());%></td>
                <td title="Action"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
                    <%
                i++;
            }
            %>
            
            
            </table>
			<div class="tex">
           <p></p>
            </div>
		</div>
            <form method="post" action="lokasiController.jsp" name="lokasi" id="lokasi">    
        <div class="widget">
        	<div class="title"> 
            	Imput Place 
            </div>
            <div class="imput">
            	Imput New Place 
                <input type="text" placeholder="Enter New Place" name="nama_lokasi" required>
                Input New Address
                <textarea class="address"  rows="4" cols="50" name="alamat" form="lokasi" placeholder="Enter Imput Address In here...">
                    
                </textarea>
                <button type="submit" class="ImputButton" onClick="tutup()" name="#">Update Data</button>
            </div>
        </div>
            </form>
	  </div>
</div>
<div id="confirm" class="confirm2">
	<div class="confirm-content">
    <span onClick="tutup()" class="exit" >&times;</span>
    	<div class="form">
        	<label style="font-weight:bold">
            	<a>Edit Place</a>
            </label>
    		<input type="text" placeholder="Enter New Place" name="#" required>
            <button type="submit" onClick="tutup()" name="#">Update Data</button>
        </div>
	</div>
</div>

<div id="ask" class="confirm2">
	<div class="ask-content">
    	<span onClick="tutup2()" class="exit" >&times;</span>
        <div class="ask">
            <label style="font-weight:bold">
                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>
            </label>
            <button onClick="tutup2()" class="b1" type="submit" name="#">NO</button>  <button onClick="tutup2()" class="b2" type="submit" name="#">YES </button>
        </div> 
    </div>
</div>
  <script>
/*----------------------------edit buat mav----------------------------------------------*/
    function openSlideMenu(){
      document.getElementById('side-menu').style.width = '250px';
      document.getElementById('main').style.marginLeft = '250px';
    }

    function closeSlideMenu(){
      document.getElementById('side-menu').style.width = '0';
      document.getElementById('main').style.marginLeft = '0';
    }
	
/*-------------------------Membuat modal Pop Up-----------------------------------------*/

	function openo()
	{
		document.getElementById("confirm").style.display = "block"
	}
	function opena()
	{
		document.getElementById("ask").style.display = "block"
	}
	function tutup()
	{
		document.getElementById("confirm").style.display = "none"
	}
	function tutup2()
	{
		document.getElementById("ask").style.display = "none"
	}
	 
	


  </script>
</body>
</html>