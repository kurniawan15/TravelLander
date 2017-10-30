<%-- 
    Document   : transortasi
    Created on : Oct 30, 2017, 9:14:53 PM
    Author     : Hari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <div class="title">Data Moda Trasportasi</div>
                <table class="table">
                    <tr>
                        <th>NO</th>
                        <th>Tipe Noda</th>
                        <th>Keterangan</th>
                    </tr>
                    <%
                      
                    %>
                    <tr>
                        <td></td>
                        <td></td>
                        <td> <a href=""><input type="submit" class="button1" value="Edit"></a>
                            <input type="submit" class="button2" onClick="opena()" value="Hapus" ></a>
                        </td>
                    </tr>
                    <% 
                   
              %>
                </table>
            
	</div>
    <div class="widget">
        <div class="title">Tambah Kota</div>
        <div class="imput">
            <form action="../../kota?data=kota&proses=input-kota" method="post">
                Kode Provinsi
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                Nama Kota
                <input type="text" placeholder="Masukan Nama Kota" name="nama_kota" required>
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
