
<%@page import="model.NewEvent"%>
<%@page import="model.NewLokasi"%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white">done</i>Finished Task</li>
    <a href="PageEventList.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="contentlist">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Finished Task</h1>
  <h2 class="ftask">[Completed Event]</h2>
   <table class="table">
  <%
                      DAONewEvent dEvent = new DAONewEvent();
                      DAONewLokasi dlok = new DAONewLokasi();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      List<NewLokasi> datalok = new ArrayList<NewLokasi>();
                     
                          data = dEvent.tampil();
                          datalok = dlok.tampil();
                     
                      for (int x = 0; x < data.size(); x++) {
                    %>
      <tr>
          <td style="font-size: 14px;"><%=x + 1%></td>
          <td style="font-size: 14px;"><%=data.get(x).getKdEvent()%></td>
          <td style="font-size: 14px;"><%=data.get(x).getNamaEvent()%></td>
          <td style="font-size: 14px;"><%=datalok.get(x).getNamaLokasi()%></td>
          <td style="font-size: 14px;"><%=data.get(x).getTravelMode()%></td>
          <td><a href="detailevent.html"><input type="submit" name="" value="detail" style="background-color: grey; width: 100%; height: 5px; line-height: 2px;"></a></td>
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
