<%-- 
    Document   : editEvent
    Created on : Oct 31, 2017, 12:03:15 AM
    Author     : Fajar Panca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<style>
  body{
    background-image: url(img/backweb.jpg);/*call image*/
    background-position: center center;/*set posisi background agar ditengah*/
    background-repeat: no-repeat;/*set gambar biar gaberulang*/
    background-attachment: fixed;/*set gambar agar ketika discroll tidak ikut bergerak*/
    background-size: cover;/*set ukuran gambar sesuai ukuran layar*/
    }
</style>
<body>

<div class="flex-container">
<div class="headbar">
<header>
  <center><img class="logoweb" src="img/L210.png"></center>
</header>
</div>

<nav class="nav">
<ul>
   <br><br><br>
    <li class="none"><a href="#"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</a></li>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li>
    <li class="none"><a href="#"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</a></li>
    <li class="none"><a href="#"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</a></li>
    <li class="none"><a href="#"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</a></li>
</ul>
</nav>

<article class="article">
  <div class="content">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Edit Schedule</h1>
    <div class="widget">
    <div class="title"><b>Detail</b></div>
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="namaevent">
      <h1 class="hnamaevent">Event Name :</h1>
      <input type="text" id="fname" name="nama_event" placeholder="Input Event Name">
    </div>
    
    <!--____________________________Form Inputan Waktu Event____________________________-->
    <div class="waktu">
      <h1 class="hwaktu">Event Time :</h1>
      <!--____________________________Form input waktu awal____________________________-->
      <input type="datetime-local" name="waktu_mulai" placeholder="start time"> <i>&nbsp;until&nbsp;</i>
      <!--____________________________Form input waktu akhir--> 
      <input type="datetime-local" name="waktu_selesai" placeholder="End time">   
    </div>
    
    <!--____________________________Form Inputan Lokasi Awal____________________________-->
    <div class="LokasiAwal">
      <div class="title"><b><br>Location</b></div>
      <h1 class="hlokasiawal">Start Location :</h1>
      <select id="LokasiAwal" name="kd_lokasi_awal">
        <option value="Lokasi1">Lokasi 1</option>
        <option value="Lokasi2">Lokasi 2</option>
        <option value="Lokasi3">Lokasi 3</option>
        <option value="Lokasi4">Lokasi 4</option>
        <option value="Lokasi5">Lokasi 5</option>
      </select>     
    </div>
    
    <!--____________________________Form Inputan Lokasi Akhir____________________________-->   
    <div class="LokasiAkhir">
      <h1 class="hlokasiakhir">End Location :</h1>
      <select id="LokasiAkhir" name="kd_lokasi_akhir">
        <option value="Lokasi1">Lokasi 1</option>
        <option value="Lokasi2">Lokasi 2</option>
        <option value="Lokasi3">Lokasi 3</option>
        <option value="Lokasi4">Lokasi 4</option>
        <option value="Lokasi5">Lokasi 5</option>
      </select>     
    </div>
    
    <!--____________________________Form Inputan Nama Event____________________________-->
    <div class="keteranganevent">
      <h1 class="hketevent">Event Description :</h1>
      <input type="text" id="fname" name="keterangan" placeholder="Input Event Description">
    </div>

    <!--____________________________Form Inputan Transportasi____________________________-->   
    <div class="Transportasi">
      <h1 class="htransportasi">Transportation :</h1>
      <div class="tab">
        <button class="tablinks" onclick="openCity(event, 'Umum')" id="defaultOpen">Umum</button>
        <button class="tablinks" onclick="openCity(event, 'Pribadi')">Pribadi</button>
      </div>
      <!--____________________________script fungsi option kendaraan umum/pribadi____________________________-->   
      <script type="text/javascript">
        function openCity(evt, cityName) {
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
          document.getElementById(cityName).style.display = "block";
          evt.currentTarget.className += " active";
          }
      </script>
        <!--____________________________isi option di kendaraan umum____________________________-->      
        <div id="Umum" class="tabcontent">
        <select id="UmumModa" name="kd_moda">
          <option value="Taksi">Taksi</option>
          <option value="Bus">Bus</option>
          <option value="Kereta">Kereta</option>
          <option value="Pesawat">Pesawat</option>
        </select>     
        </div>
        <!--____________________________isi option di kendaraan pribadi____________________________--> 
        <div id="Pribadi" class="tabcontent">
        <select id="PribadiModa" name="kd_transport_pribadi">
          <option value="Sepeda">Sepeda</option>
          <option value="Motor">Motor</option>
          <option value="Mobil">Mobil</option>
        </select>      
        </div>

        <!--____________________________Tombol Submit or cancel____________________________--> 
      <div class="col-12 enter">
        <br>
        <input type="submit" value="Cancel" style="background-color: red;">
        <input type="submit" value="Create Schedule">
      </div><br> 
      </div>
    </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
