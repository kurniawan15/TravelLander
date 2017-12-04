<%-- 
    Document   : myEvent
    Created on : Nov 20, 2017, 9:14:29 PM
    Author     : Hari
--%>

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
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</li></a>                                                                                  
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <a href="pagelist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="pageeventlist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
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
                    <table class="table">
                        <tr>
                            <th>NO</th>
                            <th>Event Name</th>
                            <th>Event Locaton</th>
                            <th>Event Time</th>
                            <th>Edit Your Event</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                                            <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td>bubu</td>
                        </tr>
                                            <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                                            <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                                            <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                                            <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Rapat dengan ayah </td>
                            <td>bandung</td>
                            <td>07:00</td>
                            <td><input type="submit" class="button2" onClick="opena()" value="Edit" ></td>
                        </tr>
                    </table>
                </div>
                <div class="row-full-event">
                    <button class="full-event" type="submit" name="Tambah">Show All List</button> 
                </div>
            </div>
    </div>
    <footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>
    </body>
</html>
