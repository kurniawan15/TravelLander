<%-- 
    Document   : transpribadi
    Created on : Oct 30, 2017, 10:39:01 PM
    Author     : Hari
--%>
<%@page import="model.TransportasiPribadi"%>
<%@page import="DAO.DAOTransportasiPribadi"%>
<%@page import="model.ModaTransportasi"%>
<%@page import="DAO.DAOModaTransportasi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <a class="selected" href="#">Data Kota</a>
    <a href="distance.jsp">Manage Distance</a>
    <a href="time.jsp">Manage Time</a>
    <a href="transportation.jsp" >Manage Transpotation</a>
  </div>
<div class="main-content">
    <div id="main">																					
	<div class="widget">
            <div class="title">Data Transportasi Publik</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>Kode Transportasi Pribadi</th>>
                        <th>Moda Transportasi</th>
                        <th>Nama Transportasi Publik</th>
                        <th>Keterangan</th>
                    </tr>
                    <%
                        DAOTransportasiPribadi kt = new DAOTransportasiPribadi();
                        List<TransportasiPribadi> data = new ArrayList<TransportasiPribadi>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                        data = kt.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        <td><%=data.get(x).getKdTansportasiPribadi()%></td>
                        <td><%=data.get(x).getKdModa()%></td>
                        <td><%=data.get(x).getNamaTransportasiPribadi()%></td>
                        <td> 
                            <a href=""><input type="submit" class="button1" value="Edit"></a>
                            <input type="submit" class="button2" onClick="opena()" value="Hapus" ></a>
                        </td>
                    </tr>
                    <% 
                 }  
              %>
                </table>
            
	</div>
        <div class="widget">
            <div class="title">Tambah Perjalanan </div>  
        <div class="imput_publik">
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
Moda Transportasi
                <select class="pilih_kota">
                <%
                    DAOModaTransportasi dmod = new DAOModaTransportasi();
                    List<ModaTransportasi> mod = new ArrayList<ModaTransportasi>();
                    mod = dmod.tampil();
                    for (ModaTransportasi m : mod) {
                    %>
                <option value="<%=m.getKdModa()%>"><%=m.getTipeModa()%></option>
                <% 
                       }
                %>
                </select>
                Nama Trasportasi
                <input type="text" placeholder="Masukan Id erjalanan" name="#i" required>
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
</html>
