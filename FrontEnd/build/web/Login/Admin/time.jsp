<%-- 
    Document   : time
    Created on : Sep 25, 2017, 9:29:31 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Super Admin</title>
  <link rel="stylesheet" href="css/style.css">
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
    	<li><a href="#">Log Out</a></li>
    </ul>
  </nav>

  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="calender.jsp">Calendar</a>                                                                                   
    <a href="DataPlace.jsp">Manage Place</a>
    <a href="distance.jsp">Manage Distance</a>
    <a class="selected" href="#">Manage Time and Distance</a>
    <a href="transportation.jsp" >Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">Manage Time and Distance</div>
            <table class="table">
            <tr>
                <th>NO</th>
                <th>Start Point</th>
                <th>End Point </th>
                <th>Vehicle </th>
                <th>Distance</th>
                <th>Time (Minute) </th>
                <th>Action</th>
            </tr>
            <tr>
                <td title="NO">1</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">2</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">3</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit" onClick="openo()"  class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">4</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NO">5</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NO">6</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="Vehicle">Motor</td>
                <td title="Distance">12</td>
                <td title="Time">10</td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            </table>
			<div class="tex">
           <p></p>
            </div>
		</div
 <!------------------------------------bagian inmput data------------------------------------------------>
        <div class="widget">
        	<div class="title"> 
            	Imput Time and Distance 
            </div>
            <div class="imput-time">
            	<span style="font-size:24px"> <u>  Imput Time here </u>  </span> <br>
           	<div class="form-time"> 
                Start Point 
                <select class="choise-imput"> 
                      <option value="Posisi 1">Posisi 1</option>
                      <option value="Posisi 2">Posisi 2</option>
                      <option value="Posisi 3">Posisi 3</option>
                      <option value="Posisi 4">Posisi 4</option>
                   </select> 
              	
                End Point
                      <select class="choise-imput">
                      <option value="Posisi 1">Posisi 1</option>
                      <option value="Posisi 2">Posisi 2</option>
                      <option value="Posisi 3">Posisi 3</option>
                      <option value="Posisi 4">Posisi 4</option>
                    </select> 
                    </div> 
                
                Vehicle &nbsp &nbsp &nbsp
                    <select class="choise-imput">
                      <option value="Mobi">Mobil</option>
                      <option value="Motor">Motor</option>
                      <option value="Pesawat">Pesawat</option>
                      <option value="Kereta">Kereta</option>
                      <option value="Bus">Bus</option>
                      <option value="Sepedah">Sepedah</option>
                    </select>
                    <br>
                    input Distance <input type="text" placeholder="" style="width:80px" name="#" required> Meter
                    <br>
                    Input Time &nbsp &nbsp &nbsp <input type="text" placeholder="" style="width:80px" name="#" required> Minute 
                 <br>
                <button type="submit" class="ImputButton" style="width:170px"  onClick="tutup()" name="#">Update Data</button>
            </div>
        </div>
	  </div>
</div>
<!--------------------------------Bagian Modal----------------------------------------------->
<div id="confirm" class="confirm2">
	<div class="confirm-content-distance">
    <span onClick="tutup()" class="exit" >&times;</span>
    	<div class="form">
        	<label style="font-weight:bold">
            	<a>Edit Distance </a>
            </label>
            <br>
            Start Posision
            <select class="choise-imput">
                <option value="Posisi 1">Posisi 1</option>
                <option value="Posisi 2">Posisi 2</option>
                <option value="Posisi 3">Posisi 3</option>
                <option value="Posisi 4">Posisi 4</option>
            </select>
            End Posision
            <select class="choise-imput">
                <option value="Posisi 1">Posisi 1</option>
                <option value="Posisi 2">Posisi 2</option>
                <option value="Posisi 3">Posisi 3</option>
                <option value="Posisi 4">Posisi 4</option>
            </select>
            <br>
            Vehicle    
            <select class="choise-imput">
                <option value="Mobi">Mobil</option>
                <option value="Motor">Motor</option>
                <option value="Pesawat">Pesawat</option>
                <option value="Kereta">Kereta</option>
                <option value="Bus">Bus</option>
                <option value="Sepedah">Sepedah</option>
            </select>
            <br>
            <input type="text" placeholder="New Distance" name="#" style="width:50%" > Meter
            <input type="text" placeholder="New Time" name="#" style="width:50%" > Minutes
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
	 
	


  </script>
</body>
</html>
