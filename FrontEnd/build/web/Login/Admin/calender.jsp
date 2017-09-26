<%-- 
    Document   : calender
    Created on : Sep 26, 2017, 10:36:38 AM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Super Admin</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<script type="text/javascript" src="Js/date.js"></script>
<script type="text/javascript" src="Js/place.js"></script>
<link rel="stylesheet" type="text/css" href="css/calendar.css"/>
<link rel="stylesheet" href="lib/fullcalendar.css">

<script src="lib/jquery.min.js"> </script>
<script src="lib/moment.min.js"></script>
<script src="lib/fullcalendar.min.js"></script>

<script>
	$(document).ready(function() {
		
		$('#calendar').fullCalendar({
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay,listWeek'
			},
			defaultDate: '2017-09-12',
			navLinks: true, // can click day/week names to navigate views
			editable: true,
			eventLimit: true, // allow "more" link when too many events
			events: [
				{
					title: 'All Day Event',
					start: '2017-09-01',
				},
				{
					title: 'Long Event',
					start: '2017-09-07',
					end: '2017-09-10'
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: '2017-09-09T16:00:00'
				},
				{
					id: 999,
					title: 'Repeating Event',
					start: '2017-09-16T16:00:00'
				},
				{
					title: 'Conference',
					start: '2017-09-11',
					end: '2017-09-13'
				},
				{
					title: 'Meeting',
					start: '2017-09-12T10:30:00',
					end: '2017-09-12T12:30:00'
				},
				{
					title: 'Lunch',
					start: '2017-09-12T12:00:00'
				},
				{
					title: 'Meeting',
					start: '2017-09-12T14:30:00'
				},
				{
					title: 'Happy Hour',
					start: '2017-09-12T17:30:00'
				},
				{
					title: 'Dinner',
					start: '2017-09-12T20:00:00'
				},
				{
					title: 'Birthday Party',
					start: '2017-09-13T07:00:00'
				},
				{
					title: 'Click for Google',
					url: 'http://google.com/',
					start: '2017-09-28'
				}
			]
		});
		
	});
</script>
<style>
	#calendar {
		max-width: 90%;
		margin: 0 auto;
	}
</style>
</head>

<body>
             <%
            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            %>					
<div id="header">
   	<div class="logo"><a href="#">Travel<span>Calendar</span></a></div>
	<ul id="dropdown">
			<li><a href="../logout.jsp"">Log Out</a></li>
	</ul>
</div>
    
    <div id="container">
    	<div class="sidebar">
        <ul id="nav">
        	<li><a class="selected" href="#">Calendar</a></li>
            <li><a href="DataPlace.jsp">Manage Place</a></li>
            <li><a href="distance.jsp">Manage Distance</a></li>
            <li><a href="time.jsp">Manage Time</a></li>
            <li><a href="transpotation.jsp">Manage Transpotation</a></li>
      	</ul>
        
            
    	</div>
        
<div class="content">
        	<h1></h1>
            <p>Calendar</p>                      
            	<div id="box">                    
                 	<div class="box-panel">
                    	<h2></h2>
                        <div id="calendar">
                       </div>
                    </div>
                </div>
   </div>
   </div>
   </body>
</html>
