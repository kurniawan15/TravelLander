<%-- 
    Document   : myEvent
    Created on : Nov 20, 2017, 9:14:29 PM
    Author     : Hari
--%>
<%@page import="DAO.DAONewEvent"%>
<%@page import="model.NewEvent"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Database.KoneksiDB"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab" rel="stylesheet">
        <link rel="stylesheet" href="css/myEvent.css">
        <script src="Js/myEvent.js"></script>
        <title>MY EVENT</title>
    </head>

    <body onload="startTime()">
            <div class="headbar" id="side-menu">
                <header>
                    <center><img class="logoweb" id="logoweb" src="img/L210.png"></center>
                </header>
            </div>
    <div class="container" id="main">
  <div id="menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="myEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dasboard</li></a>
    <a href="calendar.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">date_range</i>Calendar</li></a>
    <a href="addEvent.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="listData.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="PageEventList.jsp"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
  </div>
    <div class="Walpaper">
        <a href="#" onclick="openSlideMenu()">
            <svg width="30" height="30">
                <path d="M0,5 30,5" stroke="#fff"stroke-width="5"/>
                <path d="M0,14 30,14" stroke="#fff" stroke-width="5"/>
                <path d="M0,23 30,23" stroke="#fff" stroke-width="5"/>
            </svg>
        </a>
        <div class="tampilan-text" id="coba"></div>
        <div class="tampilan-text" id="tess">
            <h1> Rizal Muhammad </h1>
        </div>
        <div class="tempat-foto">
            <img src="https://akademik.polban.ac.id/fotomhsrekap/161511057.jpg" alt="" class="profile main">
        </div>
        <div class="tampilan-text">
            <h2>Your Event Today</h2>
        </div>
    </div>
    
    <div class="bottom-view">
            <div class="entry">
                <div class="batas-tabel">
                    <table class="table" id="TabelFilter">
                        <tr>
                            <th>NO</th>
                            <th>Event Name</th>
                            <th>Event Locaton</th>
                            <th>Event Time</th>
                            <th>Edit Your Event</th>
                        </tr>
                        <%
                      DAONewEvent kt = new DAONewEvent();
                      List<NewEvent> data = new ArrayList<NewEvent>();
                      String ket = request.getParameter("ket");

                      if (ket == null) {
                          data = kt.tampil();
                      }
                  
                      for (int x = 0; x < data.size(); x++) {
                    %>
                        <tr>
                            <td title="NO"><%=x + 1%></td>
                            <td title="Event Name"><%=data.get(x).getNamaEvent()%></td>
                            <td title="Location"><%=data.get(x).getKdTraveller()%></td>
                            <td title="Ibu Kota"><%=data.get(x).getWaktuMulai()%></td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                           <% 
                    }
              %>                 
                    </table>
                </div>
                <div class="row-full-event">
                    <button class="full-event" type="submit" name="Tambah">Show All List</button> 
                </div>
                    
                     <input type="text" id="Filter" onkeyup="FungsiFilter()" placeholder="Filter Berdasarkan Provinsi">
            </div>
    </div>
    <footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] <div id="coba1"></div> </footer>
</div>
    </body>
</html>
