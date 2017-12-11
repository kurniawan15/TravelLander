<%-- 
    Document   : myEvent
    Created on : Nov 20, 2017, 9:14:29 PM
    Author     : Hari
--%>
<%@page import="model.NewLokasi"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="model.NewEvent"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</li></a>
    <a href="pageinput.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="pageeventlist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
    <%
          String id_event = request.getParameter("Kd_Event");
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");            
          DAONewEvent newEv = new DAONewEvent();
          DAONewLokasi nLok= new DAONewLokasi();
          List<NewEvent> list = new ArrayList<NewEvent>();
          List<NewLokasi> listLok = new ArrayList<NewLokasi>();
          list = newEv.cariID();
        //  listLok = nLok.cariID();
            if (list.size() > 0){
        %>

  <div class="contentdetail">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Detail Event</h1>
  <h2 class="h2detail">Detail</h2>
    <p class="pdetail">Event Name &nbsp;&nbsp;: <%=list.get(0).getKdEvent()%> </p>
    <p class="pdetail">Event Time &nbsp;&nbsp;: <%=format.format(list.get(0).getWaktuMulai())%> until <%=format.format(list.get(0).getWaktuSelesai())%></p>
  
  <h2 class="h2detail">Location</h2>
  <p class="pdetail">Start Point &nbsp;&nbsp;: <%=list.get(0).getKdEvent()%></p>
  <p class="pdetail">End Point &nbsp;&nbsp;: SMAN 20 Bandung</p>
  <p class="pdetail">Description &nbsp;&nbsp;: Description of Event</p>

  <h2 class="h2detail">Transportation</h2>
  <p class="pdetail">Transport Name &nbsp;&nbsp;: Motorcycle</p>
  <p class="pdetail">Distance &nbsp;&nbsp;: 0.55 KM</p>
  <p class="pdetail">Estimated &nbsp;&nbsp;: 5 Minutes</p>
  <p class="pdetail">Departure Time &nbsp;&nbsp;: 06:45</p>
  <br><br>
  <a class="back" href="pagelist.html"><p><i class="material-icons" style="font-size:20px;color:black; padding-right: 10px;">reply</i>Back</p></a>
  </div>
  </div>
                    <%
          }
       %>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>

