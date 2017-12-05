<%-- 
    Document   : Desk
    Created on : Dec 5, 2017, 1:54:56 PM
    Author     : Fachri Hammad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.DAONewEvent, model.NewEvent, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">


    <link href='../lib/lain/fullcalendar.min.css' rel='stylesheet' />
    
    <script src='../lib/moment.min.js'></script>    
    <script src='../lib/jquery.min.js'></script>
    <script src='../lib/lain/fullcalendar.min.js'></script>
    <title>Calendar</title>
    <%
        List<NewEvent> newEvents ;
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
      editable: false,
      eventLimit: true, // allow "more" link when too many events
      events: [
        {
          title: 'Working',
          url: '#',
          start: '2017-11-07',
          end: '2017-11-10'
        }
        
   
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
  <center><img class="logoweb" src="img/L21.png"></center>
</header>
</div>

<nav class="nav">
<ul>
   <br><br><br>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</li>
    <a href="pageinput.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="pagelist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="pageeventlist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
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

