<%-- 
    Document   : jarak
    Created on : Oct 30, 2017, 7:19:47 PM
    Author     : Hari
--%>

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
                      
                    %>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
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
            <div class="title">Tambah data Jarak</div>
            <form action="../../provinsi?data=provinsi&proses=input-provinsi" method="post">
             <div class="imput">
                Kode Lokasi Awal 
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                 Kode Lokasi Akhir
                <select class="pilih_kota">
                    <option value="volvo">Volv33o</option>
                    <option value="saab">Saab</option>
                    <option value="opel">Opel</option>
                    <option value="audi">Audi</option>
                </select>
                Jarak (KM)
                <input type="text" placeholder="Masukan Id erjalanan" name="#i" required>
                <button type="submit" name="Tambah">Update Data</button>
             </div>
            </form>
        </div>
