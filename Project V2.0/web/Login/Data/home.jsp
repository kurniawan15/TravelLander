<!DOCTYPE html>
<%@page import="model.Traveller"%>
<%@page import="DAO.DAOTraveller"%>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/grid.css">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fixed-header">
            <div class="col-lg-3 col-md-12 col-sm-12 col-xs-12 kiri">
                <ul>
                    <li class="pilih"><i style="font-size: 14px;" class="material-icons">home</i>&nbsp;&nbsp;&nbsp;Home</li>
                    <a href="addEvent.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">add</i>&nbsp;&nbsp;&nbsp;Add Event</li></a>
                    <a href="mylist.jsp" style="text-decoration: none; color: white;"><li class="none"><i style="font-size: 14px;" class="material-icons">toc</i>&nbsp;&nbsp;&nbsp;My Event</li></a>
                </ul>
            </div>
            <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12 kiri">
                <center><img class="img-responsive logo" src="img/logo1.png">
                    </div>
                    <div class="col-lg-1 col-md-12 col-sm-12 col-xs-12 kanan">
                    </div>
                    <div class="col-lg-2 col-md-12 col-sm-12 col-xs-12 dropdown">
                        <center><button onclick="myFunction()" class="dropbtn"><%out.println("Hi, ");%><%=session.getAttribute("USERNAME")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">arrow_drop_down</i></button></center>
                        <div id="myDropdown" class="dropdown-content">
                            <center><a href="traveller?proses=logout-traveller">Logout &nbsp;&nbsp;&nbsp;<i style="font-size: 14px;" class="material-icons">launch</i></a></center>
                        </div>
                    </div>
            </div>
            <%
                String username = (String) session.getAttribute("USERNAME");

                if (username == null) {
                    response.sendRedirect("../../index.jsp");
                }
            %>
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
                                        <tr>
                                            <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
                                            <td style="font-size: 12px; line-height: 20px;">1</td>
                                            <td style="font-size: 12px; line-height: 20px;">Pengawasan dan Pelatihan</td>
                                            <td style="font-size: 12px; line-height: 20px;">SMAN 20 BANDUNG</td>
                                            <td style="font-size: 12px; line-height: 20px;">21-09-2017, 17.00</td>
                                            <td style="font-size: 12px; line-height: 35px;"><a href="edit.html"><i style="font-size: 20px;" class="material-icons">mode_edit</i></a></td>
                                            <td style="font-size: 12px; line-height: 35px;"><a href="#" class="delete" data-confirm="Are you sure to delete this Event?"><i style="font-size: 20px;" class="material-icons">delete</i></a></td>
                                            <td style="font-size: 12px; line-height: 20px;"><button class="tablinks" onclick="openCity(event, 'pageedit')" id="defaultOpen"><i style="font-size: 20px;" class="material-icons">subject</i></button></td>
                                        </tr>
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
    </body>
</html>