<%-- 
    Document   : selected
    Created on : Sep 25, 2017, 9:25:00 PM
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
    	<li><a href="../logout.jsp">Log Out</a></li>
    </ul>
  </nav>

  <div id="side-menu" class="side-nav">
    <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
    <a href="calender.jsp">Calendar</a>                                                                                   
    <a href="DataPlace.jsp">Manage Place</a>
    <a class="selected" href="#">Manage Distance</a>
    <a href="time.jsp">Manage Time</a>
    <a href="transportation.jsp" >Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">Manage Distance</div>
            <table class="table">
            <tr>
                <th>NO</th>
                <th>Start Point</th>
                <th>End Point </th>
                <th> Distance </th>
                <th>Action</th>
            </tr>
            <tr>
                <td title="NO">1</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">2</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit" onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">3</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit" onClick="openo()"  class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
              <tr>
                <td title="NO">4</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NO">5</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            <tr>
                <td title="NO">6</td>
                <td title="Start">Posisi</td>
                <td title="End">Posisi</td>
                <td title="distance"> 19 </td>
                <td title="Action"><input type="submit"  onClick="openo()" class="button1" name="" value=" Edit ">&nbsp <input type="submit" onClick="opena()" class="button2" name="" value=" Delete"></td>
            </tr>
            </table>
			<div class="tex">
           <p></p>
            </div>
		</div>
        <div class="widget">
        	<div class="title"> 
            	Imput Distance 
            </div>
            <div class="imput-distace">
            	<span style="font-size:24px"> <u>  Imput Distance here </u>  </span> <br>
           	<div class="form-distance"> 
                Start Point 
                	<input  type="text" placeholder="Enter Start Point" style="width:190px" name="#" required> 
              	
                End Point
                	<input  type="text" placeholder="Enter End Point" style="width:190px" name="#" required>
                    </div> 
                <br>
                Distance &nbsp&nbsp
                    <input type="text" placeholder="" style="width:80px" name="#" required> KM
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
            	<a>Edit Distance</a>
            </label>
    		<input type="text" placeholder="Enter New Start Point" name="#" >
            <input type="text" placeholder="Enter New End Point" name="#"  >
            <input type="text" placeholder="New Distance" name="#" style="width:50%" > KM
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
