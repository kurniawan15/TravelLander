<%-- 
    Document   : perjalanan
    Created on : Oct 30, 2017, 6:45:17 PM
    Author     : Hari
--%>

<%@page import="model.Perjalanan"%>
<%@page import="DAO.DAOPerjalanan"%>
<%@page import="model.Provinsi"%>
<%@page import="DAO.DAOProvinsi"%>
<%@page import="model.Jarak"%>
<%@page import="DAO.DAOJarak"%>
<%@page import="model.TransportasiPublik"%>
<%@page import="DAO.DAOTransportasiPublik"%>
<%@page import="model.TransportasiPribadi"%>
<%@page import="DAO.DAOTransportasiPribadi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
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
    <a href="jarak.jsp">Jarak</a>                                                                                   
    <a href="kota.jsp">Kota</a>
    <a href="lokasi.jsp" >Lokasi</a>
    <a href="provinsi.jsp" >Provinsi</a>
    <a class="selected" href="#" >Perjalanan</a>
    <a href="modatrasportasi.jsp" >Moda Trasportasi</a>
    <a href="transpribadi.jsp" >Transportasi Pribadi</a>
    <a href="transpublik.jsp" >Transportasi Umum</a>
  </div>
<div class="main-content">
    <div id="main">																					
	<div class="widget">
            <div class="title">Data Perjalanan</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>ID Pejalanan</th>
                        <th>Kode Transportasi Publik</th>
                        <th>Kode Jarak</th>
                        <th>Kode Tranportasi Pribadi</th>
                        <th>Waktu Tempuh</th>
                        <th>Keterangan</th>
                    </tr>
                    <%
                      DAOPerjalanan jl = new DAOPerjalanan();
                      List<Perjalanan> data = new ArrayList<Perjalanan>();
                      String ket = request.getParameter("ket");
                      if (ket == null) {
                          data = jl.tampil();
                      } 
                      for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                       <td><%=x + 1%></td>
                        <td><%=data.get(x).getKdPerjalanan()%></td>
                        <td><%=data.get(x).getKdTransportasiPublik()%></td>
                        <td><%=data.get(x).getKdJarak()%></td>
                        <td><%=data.get(x).getKdTransportasiPribadi()%></td>
                        <td><%=data.get(x).getWaktuTempuh()%></td>

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
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
                Kode Trasportasi Pulik
                <select class="pilih_kota">
                  <%
                    DAOTransportasiPublik dpub = new DAOTransportasiPublik();
                    List<TransportasiPublik> pub = new ArrayList<TransportasiPublik>();
                    pub = dpub.tampil();
                    for (TransportasiPublik tp : pub) {
                    %>
                <option value="<%=tp.getKdTransportasiPublik()%>"><%=tp.getNamaTransportasiPublik()%></option>
                <% 
                       }
                %>
                </select>
                 Kode Trasportasi Pribadi
                 <select class="pilih_kota">
        <%
                    DAOTransportasiPribadi dpri = new DAOTransportasiPribadi();
                    List<TransportasiPribadi> pri = new ArrayList<TransportasiPribadi>();
                    pri = dpri.tampil();
                    for (TransportasiPribadi tpr : pri) {
                    %>
                <option value="<%=tpr.getKdTansportasiPribadi()%>"><%=tpr.getNamaTransportasiPribadi()%></option>
                <% 
                }       
                %>
                  </select>
                Kode Jarak
                <select class="pilih_kota">
                   <%
                    DAOJarak djar = new DAOJarak();
                    List<Jarak> jar = new ArrayList<Jarak>();
                    jar = djar.tampil();
                    for (Jarak j : jar) {
                    %>
                <option value="<%=j.getKdJarak()%>"><%=j.getJarak()%></option>
                <% 
                }       
                %>
                </select>
                Waktu Tepuh (Menit)
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