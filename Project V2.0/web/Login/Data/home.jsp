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

<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="css/grid.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
                        <a href="home.jsp"><li class="pilih">Dashboard</li></a>
                        <a href="calendar.jsp"><li class="none">My Calendar</li></a>
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
                                <h1 class="judul">Event Hari Ini</h1>
                                <table class="table">
                                    <p id="mundur"></p>
                              <%
                                  
                                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                                //DAONewEvent kt = new DAONewEvent();
                                DAOEventToday nx = new DAOEventToday();
                                DAONewLokasi dLok = new DAONewLokasi();
                                List<EventNext> data = new ArrayList<EventNext>();
                                try{
                                String ket = request.getParameter("ket");
                                nx.setKdTraveller("");
                                if (ket == null) {
                                    data = nx.getEventNext("TD001");
                                }

                                for (int x = 0; x < data.size(); x++) {
                              %>                                    
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
                                        <td style="font-size: 12px; line-height: 20px;"><%=x + 1%></td>
                                        <td style="font-size: 12px; line-height: 20px;"><%=data.get(x).getNamaEvent()%></td>
                                        <td style="font-size: 12px; line-height: 20px;"><%=dLok.getLokasiAkhir(data.get(x).getKdEvent())%></td>
                                        <td style="font-size: 12px; line-height: 20px;"><%=format.format(data.get(x).getWaktuSelesai())%></td>
                                        <td style="font-size: 12px; line-height: 35px;"><a href="editEvent.html"><span class="glyphicon glyphicon-edit"></span></a></td>
                                        <td style="font-size: 12px; line-height: 35px;"><span class="glyphicon glyphicon-trash"></span></td>
                                        <td style="font-size: 12px; line-height: 20px;"><button class="tablinks" onclick="openCity(event, 'pageedit')" id="defaultOpen"><span class="glyphicon glyphicon glyphicon-list"></span></button></td>
                                    </tr>
                                                                  <% 
                                }
}catch(Exception ex){
    ex.printStackTrace();
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
                                        //--------------------------------------coundownt--------------------
                                        //set waktu muali nya
                                        var countDownDate = new Date("<%=format.format(data.get(0).getWaktuMulai())%>").getTime();

                                        // pengapdetan selama 1 detik
                                        var x = setInterval(function() {

                                            
                                            var now = new Date().getTime();

                                            
                                            var distance = countDownDate - now;

                                            //hitung hitung yang menyenangkan
                                            var days = Math.floor(distance / (1000 * 60 * 60 * 24));
                                            var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
                                            var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
                                            var seconds = Math.floor((distance % (1000 * 60)) / 1000);

                                           
                                            document.getElementById("mundur").innerHTML = days + "d " + hours + "h "
                                            + minutes + "m " + seconds + "s ";

                                            //kondisi kalo gak ada event
                                            if (distance < 0) {
                                                clearInterval(x);
                                                document.getElementById("mundur").innerHTML = "Tidak Ada Event";
                                            }
                                        }, 1000);
                                    </script>

                                </table>
                                <!--____________________________Tombol Create Event____________________________--> 
                                <div class="col-12 enter">
                                    <br>
                                    <input type="submit" value="Create Event" onclick="window.location.href = 'addEvent.jsp'" style="background-color: green; width: 15%; float: left; margin-bottom: 20px;">
                                    <br>
                                </div>
                            </div>
                        </div>
                    </article>
                </div>
            </div>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 fullfooter">&copy; Kelompok B1 | Made With by FrontEnd in Kosan Uda</div>
    </body>
</html>