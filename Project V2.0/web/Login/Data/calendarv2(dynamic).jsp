<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : hari pc
--%>
<%@page import="DAO.DAONewEvent, model.NewEvent, DAO.DAONewLokasi, model.NewLokasi, java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/grid.css">
    <link rel="stylesheet" type="text/css" href="css/style_calendar.css">  
    <link href='lib/lain/fullcalendar.css' rel='stylesheet' />
    <script src='lib/moment.min.js'></script>    
    <script src='lib/jquery.min.js'></script>
    <script src='lib/lain/fullcalendar.min.js'></script>
    <style>



      #calendar {
        max-width: 70%;


        margin: 40px auto;
      }

    </style>
</head>
<body>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 header">
	<div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri">
        </div>
	<div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri">
            <center><img class="img-responsive" src="img/logo1.png">
	</div>
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan">
            <span class="glyphicon glyphicon-bell"></span>
	</div>
	<div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2">
            Fajar&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span>
	</div>
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2">
            Logout&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-off"></span>
	</div>        
    </div>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullpage">
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 leftpage_calendar">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar">
                <ul>
                    <li class="none">Dashboard</li>
                    <li class="none">My Calendar</li>
                    <a href="addEvent.jsp"><li class="none">Add Event</li></a> 
                    <a href="mylist.jsp"><li class="none">My Event</li></a>
                    <li class="none">History</li>
		</ul>
            </div>
            <div id='calendar'></div>
        </div>
    </div>
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With ? by FrontEnd in Kosan Uda</div>

                    


</body>
<script>
    
      <%
            String username = (String) session.getAttribute("USERNAME");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            DAONewEvent ev = new DAONewEvent();
            List<NewEvent> data = new ArrayList<NewEvent>();
            String ket = request.getParameter("ket");
            data = ev.tampil();
            ev.setKdEvent("");

         %>

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
    $('#calendar').fullCalendar({
    aspectRatio: 2
});
    
</script>
</html>
