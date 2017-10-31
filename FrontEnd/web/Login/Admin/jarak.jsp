<%-- 
    Document   : jarak
    Created on : Oct 30, 2017, 7:19:47 PM
    Author     : Hari
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Jarak"%>
<%@page import="DAO.DAOJarak"%>
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
    <a class="selected" href="#">Jarak</a>                                                                                   
    <a href="#">Kota</a>
    <a href="lokasi.jsp" >Lokasi</a>
    <a href="#" >Provinsi</a>
    <a href="#" >Perjalanan</a>
    <a href="#" >Moda Trasportasi</a>
    <a href="#" >Transportasi Pribadi</a>
    <a href="#" >Transportasi Umum</a>
  </div>
<div class="main-content">
    <div id="main">																					
	<div class="widget">
            <div class="title">Data Jarak</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>Kode Jarak</th>
                        <th>Kode Lokasi Awal</th>
                        <th>Kode Lokasi Akhir</th>
                        <th>Jarak (KM)</th>
                        <th>Keterangan</th>
                    </tr>
                    <%
                      DAOJarak dtp = new DAOJarak();
                      List<Jarak> data = new ArrayList<Jarak>();
                      String ket = request.getParameter("ket");
                      
                          data = dtp.tampil();
                     
                      for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        
                        <td><%=data.get(x).getKdJarak()%></td>
                        <td><%=data.get(x).getKdLokasiAwal()%></td>
                        <td><%=data.get(x).getKdLokasiAkhir()%></td>
                        <td><%=data.get(x).getJarak()%></td>
         
                        <td> <a href=""><input type="submit" class="button1" value="Edit"></a>
                            <input type="submit" class="button2" onClick="opena()" value="Hapus" ></a>
                        </td>
                    </tr>
                    <% 
                }   
              %>
                </table>
            
	</div>
        <div class="widget">
            <div class="title">Tambah data Jarak</div>
            <form action="../../jarak?data=jarak&proses=input-jarak" method="post">
             <div class="imput">
                Kode Lokasi Awal 
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
                 Kode Lokasi Akhir
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
                Jarak (KM)
                <input type="text" placeholder="Masukan Jarak" name="Jarak" required>
                <button type="submit" name="Update">Update Data</button>
             </div>
            </form>
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


