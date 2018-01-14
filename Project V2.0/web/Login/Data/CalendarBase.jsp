<%-- 
    Document   : CalendarBase
    Created on : Jan 14, 2018, 4:29:24 PM
    Author     : Fachri_Holmes
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.NewModelCalendar"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.NewEvent"%>
<%@page import="java.util.List"%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                String dateNow;
                
                
                String patternHour = "HH:mm:ss";
                SimpleDateFormat formatHour = new SimpleDateFormat(patternHour); 
                
                // formatting Date Now Dynamic
                dateNow = format.format(new Date());    
                request.setAttribute("dateNow", dateNow);
        
                        
              DAONewEvent listbaca = new DAONewEvent();
              List<NewEvent> events = listbaca.tampil();  
                                                                
            
              List<NewModelCalendar> listCal = new ArrayList<NewModelCalendar>();
           
               
              for(int fill=0; fill<=events.size()-1; fill++ )
              {
                  NewModelCalendar filling = new NewModelCalendar(); 
                  filling.setTitleEvent(events.get(fill).getNamaEvent());
                  filling.setStartTime(format.format(events.get(fill).getWaktuMulai()));
                  filling.setEndTime(format.format(events.get(fill).getWaktuSelesai()));
                  
                  filling.setStartHour(formatHour.format(events.get(fill).getWaktuMulai()));
                  filling.setEndHour(formatHour.format(events.get(fill).getWaktuSelesai()));
                  listCal.add(filling);
                  
              }
              
              request.setAttribute("listCal", listCal);
         
              
              
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/grid.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        
        <!-- Script Untuk Calendar -->
        <link href='bil/fullcalendar.min.css' rel='stylesheet' />
        <link href='bil/fullcalendar.print.min.css' rel='stylesheet' media='print' />
        <script src='bil/moment.min.js'></script>
        <script src='bil/jquery.min.js'></script>
        <script src='bil/fullcalendar.min.js'></script>
        
        <script>
            $(document).ready(function() {
		
		$('#calendar').fullCalendar(
                {
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay,listWeek'
			},
			defaultDate: '${dateNow}',
			navLinks: true, // can click day/week names to navigate views
			editable: true,
			eventLimit: true, // allow "more" link when too many events
			events: [
                                        <c:forEach items="${listCal}" var="item">
                                        {
                                            title: '${item.titleEvent}',
                                            start: '${item.startTime}T${item.startHour}',
                                            end: '${item.endTime}T${item.endHour}',
                                        },
                                        </c:forEach>
			]
		});
		
	});

        </script> 
    
        <style>
        
        #calendar 
        {
            max-width: 60%;
            max-height: 5%;
            margin: 0 auto;
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
                        <%out.println("Hi, ");%><%=session.getAttribute("USERNAME")%>&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span>
                    </div>
                    <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan2">
                        Logout&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-off"></span>
                    </div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 homepage">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 menubar">
                    <ul>
                        <a href="home.jsp"><li class="none">Dashboard</li></a>
                        <a href="calendar.jsp"><li class="pilih">My Calendar</li></a>
                        <a href="addEvent.jsp"><li class="none">Add Event</li></a>
                        <a href="mylist.jsp"><li class="none">My Event</li></a>
                        <a href="finish.jsp"><li class="none">History</li></a>
                    </ul>
                </div>
                <img src="img/avatar.png" alt="Avatar" style="width:20%">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 home">
                    <article class="article">
                        <div class="contentlist">
                            <div id="main">
                                <br><br>
                                <div id='calendar'></div> 
                            </div>
                        </div>
                    </article>
                </div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With by FrontEnd in Kosan Uda</div>
    </body>
</html>
