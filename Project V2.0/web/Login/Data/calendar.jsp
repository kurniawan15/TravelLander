<%-- 
    Document   : calendar
    Created on : Dec 5, 2017, 12:25:15 PM
    Author     : Hari
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <%@page import="DAO.DAONewEvent, model.NewEvent, DAO.DAONewLokasi, model.NewLokasi, java.util.*"%>
  <meta name="viewport" content="width=device-width, initial-scale=1">


    <link href='lib/lain/fullcalendar.min.css' rel='stylesheet' />
    
    <script src='lib/moment.min.js'></script>    
    <script src='lib/jquery.min.js'></script>
    <script src='lib/lain/fullcalendar.min.js'></script>
    
      <%
            String username = (String) session.getAttribute("USERNAME");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            DAONewEvent ev = new DAONewEvent();
            List<NewEvent> data = new ArrayList<NewEvent>();
            String ket = request.getParameter("ket");
            data = ev.tampil();
            ev.setKdEvent("");

         %>
    
    <script>

  $(document).ready(function() {
    
    $('#calendar').fullCalendar({
      header: {
        left: 'prev,next today',
        center: 'title',
        right: 'month,agendaWeek,agendaDay,listWeek'
      },
      defaultDate: '2017-11-12',
      navLinks: true, // can click day/week names to navigate views
      editable: true,
      eventLimit: true, // allow "more" link when too many events
      events: [
        <%                        
              for (int x = 0; x < data.size(); x++) {
              %>
                        {
                            title: '<%=data.get(x).getNamaEvent()%>',
                            start: '<%=format.format(data.get(x).getWaktuMulai())%>',
                            end: '<%=format.format(data.get(x).getWaktuSelesai())%>',
                                                                },
            <%}%>
      ]
    });
    
  });

    </script>

<style>



  #calendar {
    max-width: 70%;

    margin: 0 auto;
  }

</style>
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
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white">date_range</i>Calendar</li>
    <a href="addEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="listData.jsp.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="PageEventList.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="contentlist">
  <div id="main">                                         
  <br><br><br><br><br>


      <div id='calendar'></div>




   
  </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
