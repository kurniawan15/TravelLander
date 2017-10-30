<%-- 
    Document   : listData
    Created on : Oct 31, 2017, 12:03:59 AM
    Author     : Fajar Panca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <!--____________________________Call Css Page Input____________________________-->
    <link rel="stylesheet" href="css/List.css">
    <!--____________________________Title Website____________________________-->
    <title>Travelendar - List Schedule</title>
</head>
<style>
body{
    background-image: url(img/2.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
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
      <li><a href="#">Log Out</a></li>
    </ul>
  </nav>

  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="#">Dashboard</a>                                                                  
    <a href="#">Create Schedule</a>
    <a href="#">Finished Task</a>
    <a href="#">Event List</a>
  </div>

<div class="main-content">
    <div id="main">                                         
    <div class="widget">
      <div class="title"><center>Event List</center></div>
            <table class="table">
            <tr>
                <th>NO</th>
                <th>Event Name</th>
                <th>Event Location</th>
                <th>Time</th>
                <th>Edit</th>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">1</td>
                <td title="EventName" style="font-size: 18px;">Rapat dengan Client</td>
                <td title="EventLocation" style="font-size: 18px;">Surabaya</td> 
                <td title="Date" style="font-size: 18px;">Date, Time</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
               <td title="NOEVENT" style="font-size: 18px;">2</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NOEVENT" style="font-size: 18px;">3</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NOEVENT" style="font-size: 18px;">4</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">5</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">6</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">7</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">8</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">9</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">10</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">11</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">12</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NOEVENT" style="font-size: 18px;">13</td>
                <td title="EventName" style="font-size: 18px;">-</td>
                <td title="EventLocation" style="font-size: 18px;">-</td> 
                <td title="Date" style="font-size: 18px;">-</td>
                <td title="EditEvent" style="font-size: 18px;"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            </table>
      <div class="tex">
           <p></p>
            </div>
    </div>
        
    </div>
</div><br><br><br><br><br>
<!--____________________________Footer Page____________________________--> 
    <div class="footer">
      <div class="footkiri">
        <img class="logoweb" src="img/L21.png">
      </div>
      <div class="footkanan">
        <p class="pfooter">  
        ©Copyright Kelompok B1 [<i><b>Brave Heart-Group</b></i>] | Front-End [Made With Love] | October 2017</p>
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
  
<script>
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
</script>
</body>
</html> 