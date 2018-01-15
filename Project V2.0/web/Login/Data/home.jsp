<!DOCTYPE html>
<%@page import="DAO.DAONewEvent"%>
<%@page import="DAO.DAOEventToday"%>
<%@page import="model.EventNext"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.NewEvent"%>
<%@page import="DAO.DAONewLokasi"%>
<%@page import="model.NewLokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>
<%
response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
%>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/grid.css">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
    <%
        if(session != null || session.getAttribute("USERNAME").toString() != null){
           
           
%>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header">
        <div class="col-lg-4 col-md-12 col-sm-12 col-xs-12 kiri">
        	 <ul>
                <a href="home.jsp" style="text-decoration: none; color: white;"><li class="pilih"><i style="font-size: 14px;" class="material-icons">home</i>&nbsp;&nbsp;Home</li></a>
                <a href="addEvent.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">add</i>&nbsp;&nbsp;Add Event</li></a>
                <a href="CalendarBase.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">event_note</i>&nbsp;&nbsp;Calendar</li></a>
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

                <img src="img/avatar.png" alt="Avatar" style="width:20%">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 home">
                    <article class="article">
                        <div class="contentlist">
                            <div id="main">
                                <h1 class="welcome">WELCOME <%out.println("");%><%=session.getAttribute("USERNAME")%>, HAVE NICE DAY</h1>
                                <br><br>
                                <h1 class="judul">Your Event Today</h1>
                                <div class="col-lg-12 info">
                                    <table class="table">
                                        <tr>
                                            <th>NO</th>
                                            <th>Event Name</th>
                                            <th>Event Location</th>
                                            <th>Date & Time</th>
                                            <th>&nbsp;&nbsp;Edit&nbsp;&nbsp;</th>
                                            <th>Delete</th>
                                            <th>View</th>
                                        </tr>
                                        <%         
                                           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                                           //DAONewEvent kt = new DAONewEvent();
                                           DAOEventToday et = new DAOEventToday();
                                           DAONewLokasi dLok = new DAONewLokasi();
                                           List<EventNext> data = new ArrayList<EventNext>();
                                           NewLokasi lokAwal = new NewLokasi();
                                           NewLokasi lokAkhir = new NewLokasi();
                                           String ket = request.getParameter("ket");

                                           if (ket == null) {
                                               data = et.getEventToday(session.getAttribute("KdTraveller").toString());
                                           }

                                           for (int x = 0; x < data.size(); x++) {
                                         %>
                                        <tr>
                                            <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
                                            <td style="font-size: 12px; line-height: 20px;"><%=x + 1%></td>
                                            <td style="font-size: 12px; line-height: 20px;"><%=data.get(x).getNamaEvent()%></td>
                                            <td style="font-size: 12px; line-height: 20px;"><%NewLokasi l = new NewLokasi(); l = dLok.getLokasiAkhir(data.get(x).getKdEvent()); out.println(l.getNamaLokasi());%></td>
                                            <td style="font-size: 12px; line-height: 20px;"><%=format.format(data.get(x).getWaktuSelesai())%></td>
                                            <td style="font-size: 12px; line-height: 35px;"><a href="edit.jsp"><i style="font-size: 20px;" class="material-icons">mode_edit</i></a></td>
                                            <td style="font-size: 12px; line-height: 35px;"><a href="#" class="delete" data-confirm="Are you sure to delete this Event?"><i style="font-size: 20px;" class="material-icons">delete</i></a></td>
                                            <td style="font-size: 12px; line-height: 20px;"><a href="mylist.jsp?kd_event=<%=data.get(x).getKdEvent()%>"><button class="tablinks" onclick="openCity(event, 'pageedit')" id="defaultOpen"><i style="font-size: 20px;" class="material-icons">subject</i></button></td>
                                        </tr>
                                            <% 
                                             }
                                           %>
                                        <script type="text/javascript">
                                            function openCity(evt, editEvent) {
                                                var i, tabcontent, tablinks; //deklarasi variabel
                                                //mengambil element yang ada di class tabcontent dan menyembunyikan class 
                                                tabcontent = document.getElementsByClassName("tabcontent");
                                                for (i = 0; i < tabcontent.length; i++) {
                                                    tabcontent[i].style.display = "none";
                                                }
                                                //mengambil element yang ada di class tablinks dan menghapus yg aktif di display
                                                tablinks = document.getElementsByClassName("tablinks");
                                                for (i = 0; i < tablinks.length; i++) {
                                                    tablinks[i].className = tablinks[i].className.replace(" active", "");
                                                }
                                                //menampilkan class yang aktif kelayar dengan posisi block/dibawah content tsb
                                                document.getElementById(editEvent).style.display = "block";
                                                evt.currentTarget.className += " active";
                                            }

                                            function myFunction() {
                                                document.getElementById("myDropdown").classList.toggle("show");
                                            }

                                            // Close the dropdown if the user clicks outside of it
                                            window.onclick = function (event) {
                                                if (!event.target.matches('.dropbtn')) {

                                                    var dropdowns = document.getElementsByClassName("dropdown-content");
                                                    var i;
                                                    for (i = 0; i < dropdowns.length; i++) {
                                                        var openDropdown = dropdowns[i];
                                                        if (openDropdown.classList.contains('show')) {
                                                            openDropdown.classList.remove('show');
                                                        }
                                                    }
                                                }
                                            }
                                            var deleteLinks = document.querySelectorAll('.delete');

                                            for (var i = 0; i < deleteLinks.length; i++) {
                                                deleteLinks[i].addEventListener('click', function (event) {
                                                    event.preventDefault();

                                                    var choice = confirm(this.getAttribute('data-confirm'));

                                                    if (choice) {
                                                        window.location.href = this.getAttribute('href');
                                                    }
                                                });
                                            }
                                         
    
//----------------------------------------------------------------Hitung Mundur dan web notification--------------------------------------    
                                        if(window.Notification && Notification.permission !== "denied") 
                                        {
                                            var countDownDate = new Date("2018-01-15 10:33").getTime();

                                            // pengapdetan selama 1 detik
                                            var x = setInterval(function() {


                                                var now = new Date().getTime();


                                                var distance = countDownDate - now;

                                                //hitung hitung yang menyenangkan
                                                var days = Math.floor(distance / (1000 * 60 * 60 * 24));
                                                var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
                                                var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
                                                var seconds = Math.floor((distance % (1000 * 60)) / 1000);


                                                //document.getElementById("mundur").innerHTML = days + "d " + hours + "h "
                                               // + minutes + "m " + seconds + "s ";

                                                //kondisi kalo gak ada event
                                                if (distance < 0) {
                                                    clearInterval(x);
                                                    Notification.requestPermission(function(status) 
                                                    {  // status is "granted", if accepted by user
                                                        var n = new Notification('Title', 
                                                        { 
                                                                body: 'I am the body text!',
                                                                icon: '/path/to/icon.png' // optional
                                                        }); 
                                                    }); 

                                                }
                                            }, 1000);       
                                        }
                                        
                             
                                            
                                            
                                        </script>
                                    </table>
                                </div>
                                <!--____________________________Tombol Create Event____________________________--> 
                                <div class="col-12 enter">
                                    <br><center>
                                        <input type="submit" value="Create New Event" onclick="window.location.href = 'addEvent.jsp'" style="background-color: #0062b3; width: 200px; height: 40px; margin-bottom: 20px;">
                                        <br></center>
                                    <br>
                                </div>
                            </div>
                        </div>
                    </article>
                </div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-footer">&copy; Kelompok B1 | Front End Team</div>
    
<%
}else{
            response.sendRedirect("../../index.jsp");
        }%>
</body>
</html>