<%-- 
    Document   : calender
    Created on : Sep 26, 2017, 10:36:38 AM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Super Admin</title>
    <link rel="stylesheet" href="css/2.css"/>
    
    <link rel="stylesheet" href="lib/fullcalendar.css">

	<script src="lib/jquery.min.js"> </script>
    <script src="lib/moment.min.js"></script>
    <script src="lib/fullcalendar.min.js"></script>
      <script>
/*----------------------------edit buat mav----------------------------------------------*/
    function openSlideMenu(){
      document.getElementById('side-menu').style.width = '250px';
      document.getElementById('main').style.marginLeft = '250px';
    }

    function closeSlideMenu(){
      document.getElementById('side-menu').style.width = '0';
      document.getElementById('main').style.marginLeft = '0';
    }
	
/*-------------------------Membuat modal Pop Up-----------------------------------------*/

	function openo()
	{
		document.getElementById("confirm").style.display = "block"
	}
	function opena()
	{
		document.getElementById("ask").style.display = "block"
	}
	function tutup()
	{
		document.getElementById("confirm").style.display = "none"
	}
	function tutup2()
	{
		document.getElementById("ask").style.display = "none"
	}
	 
/*--------------------------------scrip calendar----------------------------------------*/
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
      body
      {
        margin: 40px 10px;
        padding: 0;
        font-family: "Lucida Grande",Helvetica, Arial, Verdana,sans-serif;
        font-size: 14px;
        background-color: cyan;
      }
      
      #calendar
      {
          width: 50%;
          height: 20%;
          margin-top: auto;
          margin-left: auto;
          margin-right: auto;
          margin-bottom: 10%;
      }
      
  </style>
</head>
<body>
  <nav class="navbar">
    <span class="open-slide">
      <a href="#" onclick="openSlideMenu()">
        <svg width="30" height="30">
            <path d="M0,5 30,5" stroke="#fff"stroke-width="5"/>
            <path d="M0,14 30,14" stroke="#fff" stroke-width="5"/>
            <path d="M0,23 30,23" stroke="#fff" stroke-width="5"/>
        </svg>
      </a>
    </span>
    <ul id="dropdown">
    	<li><a href="../logout.jsp">Log Out</a></li>
    </ul>
  </nav>

  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a class="selected" href="calender.jsp">Calendar</a>                                                                                   
    <a href="DataPlace.jsp">Manage Place</a>
    <a href="distance.jsp">Manage Distance</a>
    <a href="time.jsp">Manage Time</a>
    <a href="transportation.jsp">Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">
                            Calendar
                                <div id="calendar">
                      
                                </div>
                        </div>

			
           <div class="tex">
               <p>
                   
               </p>
           </div>
		</div>      
</div>
<div id="confirm" class="confirm2">
	<div class="confirm-content">
    <span onClick="tutup()" class="exit" >&times;</span>
    	<div class="form">
        	<label style="font-weight:bold">
            	<a>Edit Place</a>
            </label>
    		<input type="text" placeholder="Enter New Place" name="#" required>
            <button type="submit" onClick="tutup()" name="#">Update Data</button>
        </div>
	</div>
</div>

<div id="ask" class="confirm2">
	<div class="ask-content">
    	<span onClick="tutup2()" class="exit" >&times;</span>
        <div class="ask">
            <label style="font-weight:bold">
                <a> &nbsp &nbsp Are You Sure To Delete Data? </a> <br>
            </label>
            <button onClick="tutup2()" class="b1" type="submit" name="#">NO</button>  <button onClick="tutup2()" class="b2" type="submit" name="#">YES </button>
        </div> 
    </div>
</div>

  

  

  
</body>
</html>
