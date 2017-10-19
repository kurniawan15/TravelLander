<%-- 
    Document   : index
<<<<<<< HEAD
    Created on : Oct 15, 2017, 5:58:58 PM
    Author     : Delvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head lang="en"> 
   <!--     <meta charset="utf-8"> -->
        <title>Travelender</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    
    <body>
        <nav> 
            <img src="images/logo_head.png" width=20% height=100%>
        </nav>
        

        <div id="head">
            <nav>
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#anchor-headline">What's This?</a></li>
                    <li><a href="#">Admin</a></li>
                    <li><a href="#">Go to Date</a></li>
                </ul>
            </nav>
        
        </div>

             
        <div class="sect sectOne">         
 
           <br />
           <p id="Tagline">Create Your Simple Plans</p>   
           <a href="Login/login.jsp"> <button>Get's Started</button> </a>  
        
        </div>
        
        <div class="subSection">
            
            <h3 id="anchor-headline"> Anchor </h3>            
            
            <br />


            <h2 id="heading-headline">Schedule - Check - Go</h2>
            
            <img src="images/logo_kotak.png" width="50%"" height="80%" >
            <p>
                  Create Your any Plan for Tomorrow and Next <br> Anything, Anytime, Anywhere
            </p>
            

        </div>

        <div class="tesc sectTwo">
            
           <br />
           
           <!--<img src="images/DAYS.png" width="20%" height="20%" id="Anchor-Down"> -->
           <p>Start your Date Now!</p>  
           <a href="Login/login.jsp"> <button>Sign Up</button> </a>  
        

        </div>


    </body>

</html>
=======
    Created on : Nov 20, 2016, 12:39:11 PM
    Author     : PH4NTHOM
--%>
<%@page import="model.Lokasi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="repository.KoneksiDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Travellender</title>
    </head>
    <body>
    <center><h1>DAFTAR LOKASI</h1></center>
    <center>
        <a class="tambah" href="location?proses=input-lokasi">Tambah</a>
    </center>
        <table style="margin:20px auto;" border="1">
              <tr>
                  <th>No</th>
                  <th>Kode Kota</th>
                  <th>Nama</th>
                  <th>Alamat</th>
                  <th>Action</th>
              </tr>
              <%
                  Lokasi km = new Lokasi();
                  List<Lokasi> data = new ArrayList<Lokasi>();
                  String ket = request.getParameter("ket");
                  if (ket == null) {
                      data = km.tampil();
                  } 
                  for (int x = 0; x < data.size(); x++) {
              %>
               <tr>
                  <td><%=x + 1%></td>
                  <td><%=data.get(x).getIdLokasi()%></td>
                  <td><%=data.get(x).getNamaLokasi()%></td>
                  <td><%=data.get(x).getAlamat()%></td>
                  <td>
                      <a href="location?proses=edit-lokasi&idLokasi=<%=data.get(x).getIdLokasi()%>">Edit</a>
                      <a href="location?proses=hapus-lokasi&idLokasi=<%=data.get(x).getIdLokasi()%>">Hapus</a>
                  </td>
              </tr>
              <% 
                    }
              %>
          </table>
              
</body>
</html>
>>>>>>> cbe4bf2d8b7d365872b01b2c03b6e93ace831471
