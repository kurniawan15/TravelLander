<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Input Schedule</title>
  <link rel="stylesheet" href="css/index.css">
</head>
<body>
<style>
body{
 /* Location of the image */
  background-image: url(img/2.jpg);
  
  /* Background image is centered vertically and horizontally at all times */
  background-position: center center;
  
  /* Background image doesn't tile */
  background-repeat: no-repeat;
  
  /* Background image is fixed in the viewport so that it doesn't move when 
     the content's height is greater than the image's height */
  background-attachment: fixed;
  
  /* This is what makes the background image rescale based
     on the container's size */
  background-size: cover;
}
</style>
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
    <a href="#">Calendar</a>                                                                                   
    <a href="#">Manage Place</a>
    <a href="#">Manage Distance</a>
    <a href="#">Manage Time</a>
    <a href="#">Manage Transpotation</a>
  </div>
<div class="main-content">
	  <div id="main">																					
		<div class="widget">
			<div class="title">Create Schedule</div>
          <div class="col-12">
              <div class="col-5 namaevent">
              <h1 style="font-size: 15px; padding-top: 2%; padding-left: 1%;">Event Name :</h1>
              <input type="text" id="fname" name="namaevent" placeholder="Input Event Name">
              </div>
              <div class="col-5 waktu">
              <h1 style="font-size: 15px; padding-left: 1%; padding-bottom: 1%;">Event Time :</h1>
              <input type="datetime-local" style="width: 230px; border-radius:5px;
    box-sizing: border-box; width: 100%; padding-top: 2%; padding-bottom: 2%; padding-left:4%; opacity: 0.8;" name="waktu_mulai" placeholder="start time">     
              </div>
          </div>
              <div class="col-5 LokasiAwal">
                <h1 style="font-size: 15px; padding-left: 1%; padding-top: 2%; opacity: 1;">Start Location :</h1>
               <select id="LokasiAwal" name="LokasiAwal">
                  <option value="Lokasi1">Lokasi 1</option>
                  <option value="Lokasi2">Lokasi 2</option>
                  <option value="Lokasi3">Lokasi 3</option>
                  <option value="Lokasi4">Lokasi 4</option>
                  <option value="Lokasi5">Lokasi 5</option>
                </select>     
              </div>
              <div class="col-5 LokasiAkhir">
                <h1 style="font-size: 15px; padding-left: 1%; padding-top: 1%;">End Location :</h1>
              <input type="text" id="fname" name="Username" placeholder="Lokasi Akhir">  
              </div>
              <div class="col-5 create">
                <input type="submit" value="Create Schedule">
            </div>   
            <br> 
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
<div class="footer">
    <p>© Copyright Kelompok B2 | October 2017</p>
</div>
</body>
</html>