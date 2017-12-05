<%@page import="model.Event"%>
<%@page import="DAO.DAOEvent"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">home</i>Dashboard</li></a>
    <a href="pageinput.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">add</i>Create Schedule</li></a>
    <li class="pilih"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">done</i>Finished Task</li>
    <a href="pageeventlist.html"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">list</i>Event List</li></a>
    <a href="#"><li class="none"><i class="material-icons" style="font-size:20px;color:white; padding-right: 30px;">build</i>Manage</li></a>
</ul>
</nav>

<article class="article">
  <div class="contentlist">
  <div id="main">                                         
  <br><br><br><br><br>
  <h1 class="judul">Finished Task</h1>
  <h2 class="ftask">[Completed Event]</h2>
   <table class="table">
      <%
          DAOEvent namatanggal = new DAOEvent();
          List<Event> list = new ArrayList<Event>();
          
          list = namatanggal.tampil();
          for(int i=0 ; i<list.size(); i++){
      %>
      <tr>
          <td style="font-size: 14px;"><%=list.get(i).getStartTime()%></td>
          <td style="font-size: 14px;"><%=list.get(i).getNameEvent()%></td>
          <td style="font-size: 14px;">SMAN 20 BANDUNG</td>
          <td style="font-size: 14px;">Car</td>
          <td><a href="detailevent.html"><input type="submit" name="" value="detail" style="background-color: grey; width: 100%; height: 5px; line-height: 2px;"></a></td>
      </tr>
      <%
          }
       %>
      </table>
  </div>
  </div>
</article>

<footer>Copyright &copy; Kelompok B1 | Front-End [Made With Love] </footer>
</div>

</body>
</html>
