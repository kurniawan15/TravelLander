<%-- 
    Document   : transpublik
    Created on : Oct 30, 2017, 9:30:45 PM
    Author     : Hari
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.TransportasiPublik"%>
<%@page import="DAO.DAOTransportasiPublik"%>
<%@page import="model.Lokasi"%>
<%@page import="DAO.DAOLokasi"%>
<%@page import="model.ModaTransportasi"%>
<%@page import="DAO.DAOModaTransportasi"%>
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
    <a href="#">Jarak</a>                                                                                   
    <a href="#">Kota</a>
    <a href="#" >Lokasi</a>
    <a href="#" >Provinsi</a>
    <a href="#" >Perjalanan</a>
    <a href="#" >Moda Trasportasi</a>
    <a class="selected" href="#" >Transportasi Pribadi</a>
    <a href="#" >Transportasi Umum</a>
  </div>
<div class="main-content">
    <div id="main">																					
	<div class="widget">
            <div class="title">Data Transportasi Publik</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>Kode Transportasi Publik</th>
                        <th>Lokasi Keberangkatan</th>
                        <th>Lokasi Kedatangan</th>
                        <th>Moda Transportasi</th>
                        <th>Nama Transportasi Publik</th>
                        <th>Waktu Berangkat</th>
                        <th>Waktu Kedatangan</th>
                        <th>Keterangan</th>
                    </tr>
                    <%
                      DAOTransportasiPublik dtp = new DAOTransportasiPublik();
                      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH.mm");
                      List<TransportasiPublik> data = new ArrayList<TransportasiPublik>();
                      String ket = request.getParameter("ket");
                      
                          data = dtp.tampil();
                     
                      for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        <td><%=data.get(x).getKdTransportasiPublik()%></td>
                        <td><%=data.get(x).getKdLokasiKeberangkatan()%></td>
                        <td><%=data.get(x).getKdLokasiKedatangan()%></td>
                        <td><%=data.get(x).getKdModa()%></td>
                        <td><%=data.get(x).getNamaTransportasiPublik()%></td>
                        <td><%=format.format(data.get(x).getWaktuBerangkat())%></td>
                        <td><%=format.format(data.get(x).getWaktuDatang())%></td>
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
                Lokasi Keberangkatan
                <select class="pilih_kota">
                <%
                    DAOLokasi dLok = new DAOLokasi();
                    List<Lokasi> lok = new ArrayList<Lokasi>();
                    lok = dLok.tampil();
                    for (Lokasi l : lok) {
                    %>
                <option value="<%=l.getKdLokasi()%>"><%=l.getNamaLokasi()%></option>
                <% 
                       }
                %>
                </select>
                 Lokasi Kedatangan
                 <select class="pilih_kota">
                <%
                    DAOLokasi dked = new DAOLokasi();
                    List<Lokasi> ked = new ArrayList<Lokasi>();
                    ked = dLok.tampil();
                    for (Lokasi k : ked) {
                    %>
                <option value="<%=k.getKdLokasi()%>"><%=k.getNamaLokasi()%></option>
                <% 
                       }
                %>
                 </select>
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
                
                Waktu Keberangkatan
                 <input type="time" name="bdaytime">
                Waktu Kedatangan
                <input type="time" name="bdaytime">
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