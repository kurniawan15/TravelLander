<%-- 
    Document   : PageEventList
    Created on : Nov 28, 2017, 12:15:34 PM
    Author     : Hari
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.NewLokasi"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="model.NewEvent"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="Database.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
  body{
    background-image: url(img/backweb.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
<body>

<div class="flex-container">
<div class="headbar">
<header>
  <center><img class="logoweb" src="img/L210.png"></center>
</header>
</div>

<nav class="nav">
<ul>
   <br><br><br>
    <a href="myEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dasboard</li></a>
    <a href="calendar.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">date_range</i>Calendar</li></a>
    <a href="addEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="listData.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
   <li class="pilih"><i class="material-icons" style="font-size:20px;color:white">list</i>Event List</li>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="contentlist">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Event List</h1>
   <table class="tableeventlist">
      <tr>
          <th>NO</th>
          <th>Event Name</th>
          <th>Event Location</th>
          <th>Date & Time</th>
          <th>Edit</th>
      </tr>
      <%
                      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");            
                      DAONewEvent namatanggal = new DAONewEvent();
                      List<NewEvent> list = new ArrayList<NewEvent>();
                      DAONewLokasi lokasi = new DAONewLokasi();
//                      List<NewLokasi> list1 = new ArrayList<NewLokasi>();
                      String ket = request.getParameter("ket");
                      if (ket == null) {
                          list = namatanggal.tampil();
//                          list1 = lokasi.tampil();
                      } 
                      for (int x = 0; x < list.size(); x++) {
                          String kd = list.get(x).getKdEvent();
                    %>
      <tr>
          <td style="font-size: 14px;"><%=x + 1%></td>
          <td style="font-size: 14px;"><%=list.get(x).getNamaEvent()%></td>
          <td style="font-size: 14px;"><%=lokasi.getLokasiAkhir(kd)%></td>
          <td style="font-size: 14px;"><%=format.format(list.get(x).getWaktuMulai())%></td>
          <td><a href="edit.html"><input type="submit" name="" value="EDIT" style="background-color: grey; width: 50%; height: 5px; line-height: 2px;"></a><a href="pageedit.html"><input type="submit" name="" value="DELETE" style="background-color: red; width: 50%; height: 5px; line-height: 2px;"></a></td>
      </tr>
      <%
          }
       %>
      </table>
  </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>

