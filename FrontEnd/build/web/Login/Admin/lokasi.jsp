<%-- 
    Document   : Data Place
    Created on : Sep 25, 2017, 8:51:22 PM
    Author     : Cyber Pegasus
--%>
<%@page import="model.Lokasi"%>
<%@page import="DAO.DAOLokasi"%>
<%@page import="model.Kota"%>
<%@page import="DAO.DAOKota"%>
<%@page import="model.Provinsi"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
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
            <div class="title">Data Lokasi</div>
                <table class="table">
            <tr>
                <th>NO</th>
                <th>Kode Lokasi</th>
                <th>Nama tempat</th>
                <th>Alamat</th>
                <th>Kode Provinsi</th>
                <th>Kode Kota</th>
                <th>Keterangan</th>
            </tr>
          <%
                      DAOLokasi dlok = new DAOLokasi();
                      List<Lokasi> data = new ArrayList<Lokasi>();
                      
                      DAOProvinsi dpro = new DAOProvinsi();
                        List<Provinsi> pro = new ArrayList<Provinsi>();
                        
                      DAOKota dkot = new DAOKota();
                        List<Kota> kot = new ArrayList<Kota>();  
                      String ket = request.getParameter("ket");
                      
                      if (ket == null) {
                          data = dlok.tampil();
                          pro = dpro.tampil();
                          kot = dkot.tampil();
                      } 
                      for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        <td><%=data.get(x).getKdLokasi()%></td>
                        <td><%=data.get(x).getNamaLokasi()%></td>
                        <td><%=data.get(x).getAlamat()%></td>
                        <td><%=data.get(x).getId_provinsi()%></td>
                        <td><%=data.get(x).getId_kota()%></td>
                        <td>
                            <a href="../../lokasi?proses=edit-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>"><input type="submit" class="button1" value="Edit"></a>
                            <a href="../../lokasi?proses=hapus-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>"><input type="submit" class="button2" value="Hapus"></a>
                        </td>
                    </tr>
                    <% 
                    }
              %>
                </table>
            
<div class="tex">
           <p></p>
            </div>
		</div>
            <form action="../../lokasi?data=lokasi&proses=input-lokasi" method="post">
        <div class="widget">
        	<div class="title"> 
            	Inmput Lokasi 
            </div>
            <div class="imput">
            	Nama Lokasi 
                <input type="text" placeholder="Enter New Place" name="nama_lokasi" required>
                Alamat
               
                 <input type="text" placeholder="Enter New Adress" name="alamat" required>   
               
                Kode Provinsi
                <select class="pilih_kota" name="id_provinsi"">
                 <%
                    
                    for (Provinsi p : pro) {
                    %>
                <option value="<%=p.getIdProvinsi()%>"><%=p.getNamaProvinsi()%></option>
                <% 
                       }
                %>
                </select>
                Nama Kota
                <select class="pilih_kota" name="id_kota"">
                 <%
                     
                    for (Kota k : kot) {
                    %>
                <option value="<%=k.getIdKota()%>"><%=k.getNamaKota()%></option>
                <% 
                       }
                %>
                </select>
                <button type="submit" name="Tambah">Update Data</button>  
            </form>
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
