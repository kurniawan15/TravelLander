<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.DAONewEvent, model.NewEvent, java.util.*" %>
<%@page import="model.NewModelCalendar"%>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
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
    <head>
        
        <title>Calendar</title>
        <%
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                String dateNow;
                
                // formatting Date Now Dynamic
                dateNow = format.format(new Date());    
                request.setAttribute("dateNow", dateNow);
        
                //Title fill
                String title = "Hello";
                request.setAttribute("title", title);
                
                // Start Example fill
                String start = "2018-01-07";
                request.setAttribute("start", start);
        
        
              DAONewEvent listbaca = new DAONewEvent();
              List<NewEvent> events = listbaca.tampil();  
                                                                
            
              List<NewModelCalendar> listCal = new ArrayList<NewModelCalendar>();
           
               
              for(int fill=0; fill<=events.size()-1; fill++ )
              {
                  NewModelCalendar filling = new NewModelCalendar(); 
                  //events.get(fill).getNamaEvent();
                  //filling.setTitleEvent("Saskeeh");
                  filling.setTitleEvent(events.get(fill).getNamaEvent());
                  filling.setStartTime(format.format(events.get(fill).getWaktuMulai()));
                  filling.setEndTime(format.format(events.get(fill).getWaktuSelesai()));
                  
                  listCal.add(filling);
                  
              }
              
              request.setAttribute("listCal", listCal);
           /*    */
              
              
    %>
    
    
    
        <script>

            $(document).ready(function() 
            {
    
                $('#calendar').fullCalendar(
                {
                    header: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'month,agendaWeek,agendaDay,listWeek'
                    },
      
                    defaultDate: '${dateNow}', //Tanggal dinamis 13 Desember 2017(update)
                    navLinks: true, // can click day/week names to navigate views
                    editable: false,
                    eventLimit: true, // allow "more" link when too many events
                    events: 
                    [
                           
                    <c:forEach items="${listCal}" var="item">
                        {
                            title: '${item.titleEvent}',
                            start: '${item.startTime}',
                            end: '${item.endTime}',
                        },
                    </c:forEach>
                       
                        
                        
                    
          
                    ]
                });
    
            });

    </script>
    
    
    <style>
        
        #calendar 
        {
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
                    <a href="home.jsp"><li class="none">Dashboard</li></a>
                    <a href="calendar.jsp"><li class="none">My Calendar</li></a>
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
</html>