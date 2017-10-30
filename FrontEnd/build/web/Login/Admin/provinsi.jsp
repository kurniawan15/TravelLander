<%-- 
    Document   : provinsi
    Created on : Oct 30, 2017, 3:33:10 PM
    Author     : Hari
--%>

<%@page import="model.Provinsi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            <div class="title">Data Provinsi</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>Id Provinsi</th>
                        <th>Nama  Provinsi</th>
                        <th>Ibu Kota</th>
                        <th>ket</th>
                    </tr>
                    <%
                      DAOProvinsi kt = new DAOProvinsi();
                      List<Provinsi> data = new ArrayList<Provinsi>();
                      String ket = request.getParameter("ket");
                      if (ket == null) {
                          data = kt.tampil();
                      } 
                      for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        <td><%=data.get(x).getIdProvinsi()%></td>
                        <td><%=data.get(x).getNamaProvinsi()%></td>
                        <td><%=data.get(x).getIbuKota()%></td>
                        <td> 
                            <a href="../../provinsi?proses=edit-provinsi&id_provinsi=<%=data.get(x).getIdProvinsi()%>"><input type="submit" class="button1" value="Edit"></a>
                            <input type="submit" class="button2" onClick="opena()" value="Hapus" ></a>
                        </td>
                    </tr>
                    <% 
                    }
              %>
                </table>
               
	</div>
    </div>
</div>

<div class="widget">
    <div class="title">Tambah data Provinsi</div>
         <a href="../../provinsi?proses=input-provinsi" > <input type="submit" class="button3" value="Edit"> </a>
    </div>
<!------------------------------------------------------------bagian modal dalet-------------------------------------->   
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
                document.setUserData("");
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

</html>
