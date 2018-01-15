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
              listbaca.setKdTraveller(session.getAttribute("KdTraveller").toString());
              List<NewEvent> events = listbaca.getEventByTraveller();  
                                                                
            
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
        <link rel="stylesheet" type="text/css" href="css/style_calendar.css">
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
            max-width: 50%;
            max-height: 5%;
            margin: 0 auto;
        }

    </style>

        
        
    </head>
    <body>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header">
        <div class="col-lg-4 col-md-12 col-sm-12 col-xs-12 kiri">
        	 <ul>
                <a href="home.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">home</i>&nbsp;&nbsp;Home</li></a>
                <a href="addEvent.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">add</i>&nbsp;&nbsp;Add Event</li></a>
                <a href="CalendarBase.jsp" style="text-decoration: none; color: white;"><li class="pilih"><i style="font-size: 14px;" class="material-icons">event_note</i>&nbsp;&nbsp;Calendar</li></a>
                <a href="mylist.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">toc</i>&nbsp;&nbsp;My Event</li></a>
            </ul>
        </div>
        <div class="col-lg-4 col-md-12 col-sm-12 col-xs-12 kiri">
            <center><img class="img-responsive logo" src="img/logo1.png"></center>
        </div>
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 null">
        </div>
        <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 notif">
        	<ul>
        		<li><i style="font-size: 16px;" class="material-icons">notifications</i></li>
        	</ul>
        </div>
        <div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown">
            <center><button onclick="myFunction()" class="dropbtn">Hi, <%=session.getAttribute("USERNAME")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">arrow_drop_down</i></button></center>
              <div id="myDropdown" class="dropdown-content">
                <center><a href="../../traveller?proses=logout-traveller">Logout &nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">launch</i></a></center>
              </div>
        </div>
	</div>
                        
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 homepage">
               
                
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
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer">&copy; Kelompok B1 | Front End Team</div>
    </body>
</html>
