<%-- 
    Document   : lokasi
    Created on : Oct 30, 2017, 3:35:57 PM
    Author     : Hari
--%>
<%@page import="model.Lokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page import="DAO.DAOLokasi"%>
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
                        <th>Kode Kota</th>
                        <th>Nama Lokasi</th>
                        <th>Alamat</th>
                        <th>Kota</th>
                        <th>Provinsi</th>
                        <th>ket</th>
                    </tr>
                    <%
                        DAOLokasi km = new DAOLokasi();
                        List<Lokasi> data = new ArrayList<Lokasi>();
                        String ket = request.getParameter("ket");
                        if (ket == null) {
                        data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
                    %>
                    <tr>
                        <td><%=x + 1%></td>
                        <td><%=data.get(x).getKdLokasi()%></td>
                        <td><%=data.get(x).getNamaLokasi()%></td>
                        <td><%=data.get(x).getAlamat()%></td>
                        <td><%=data.get(x).getId_kota()%></td>
                        <td><%=data.get(x).getId_provinsi()%></td>
                        <td>
                            <a href="location?proses=edit-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>"><input type="submit" class="button1" value="Edit"></a></a>
                            <a href="location?proses=hapus-lokasi&kd_lokasi=<%=data.get(x).getKdLokasi()%>"><input type="submit" class="button2" onClick="opena()" value="Hapus" ></a>
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
    <div class="title">Tambah Lokasi </div>  
        <div class="imput">
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
                Nama Lokasi
                <input type="text" placeholder="Masukan Nama Lokasi" name="#" required>
                Alamat
                <input type="text" placeholder="Masukan Alamat" name="#" required>
                Kota
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                Provinsi
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                <button type="submit" name="Tambah">Update Data</button>
                
            </form>
        </div>
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