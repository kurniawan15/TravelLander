<%-- 
    Document   : transpotation
    Created on : Sep 25, 2017, 9:31:25 PM
    Author     : Cyber Pegasus
--%>

<%@page import="model.ModaTransportasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="repository.ModaTransportasiDAO"%>
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
    <a href="DataPlace.jsp">Manage Place</a>
    <a href="distance.jsp">Manage Distance</a>
    <a href="time.jsp">Manage Time</a>
    <a class="selected" href="#" >Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">Manage Transpotation</div>
            <table class="table">
            <tr>
                <th>NO</th>
                <th>Vehicle</th>
                <th>Action</th>
            </tr>
            <%
                String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
                String jdbc = "jdbc:mysql://";  
                String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
                String port = "3306/"; // Port ini port MySQL  
                String database = "travelender"; // Ini Database yang akan digunakan  
                String jdbcURL = jdbc + host + port + database;  
                String jdbcUsername = "root"; // username default mysql  
                String jdbcPassword = "";
                
                List<ModaTransportasi> listModaTransportasi = new ArrayList();
                ModaTransportasiDAO modaDAO = new ModaTransportasiDAO(jdbcURL, jdbcUsername, jdbcPassword);
                listModaTransportasi = modaDAO.listAll();
                 int i = 1;
                for(ModaTransportasi md : listModaTransportasi){
                    %>
                    <tr>
                        <td title="NO"> <%=i%> </td>
                        <td title="Vehicle"><% out.print(md.getTipeModa());%></td>
                        <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
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
              <form action="transportationController.jsp" method="post">      
        <div class="widget">
        	<div class="title"> 
            	Imput Transpotation 
            </div>
            <div class="imput">
            	Imput New Transpotation 
                <input type="text" placeholder="Enter New Transpotation" name="nama_moda" required>
                <button type="submit" class="ImputButton" onClick="tutup()" name="#">Update Data</button>
            </div>
        </div>
        </form>
              
</div>
<div id="confirm" class="confirm2">
	<div class="confirm-content">
    <span onClick="tutup()" class="exit" >&times;</span>
    	<div class="form">
        	<label style="font-weight:bold">
            	<a>Edit Transpotation</a>
            </label>
    		<input type="text" placeholder="Enter New Transpotation" name="#" required>
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
