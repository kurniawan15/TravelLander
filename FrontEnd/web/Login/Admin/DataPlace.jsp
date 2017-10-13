<%-- 
    Document   : Data Place
    Created on : Sep 25, 2017, 8:51:22 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>Super Admin</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
<script type="text/javascript" src="Js/date.js"></script>
<script type="text/javascript" src="Js/place.js"></script>
<link rel="stylesheet" type="text/css" href="css/calendar.css">

</head>

<body>
					
<div id="header">
    	<div class="logo"><a href="#">Travel<span>Calendar</span></a></div>
        <ul id="dropdown">
        <%
            //String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            %>
            <li><a href="../logout.jsp">Log Out</a></li>
	</ul>
    </div>
    
    <div id="container">
    	<div class="sidebar">
        <ul id="nav">
        	<li><a href="calender.jsp">Calendar</a></li>
            <li><a class="selected" href="#">Manage Place</a></li>
            <li><a href="distance.jsp">Manage Distance</a></li>
            <li><a href="time.jsp">Manage Time</a></li>
            <li><a href="transpotation.jsp">Manage Transpotation</a></li>
      	</ul>
        <div id="calendar">
			<p id="calendar-day"></p>
            <p id="calendar-date"></p>
            <p id="calendar-month-year"></p>
         </div>
            
    	</div>
        
<div class="content">
        	<h1></h1>
            <p>Place</p>                      
            	<div id="box">                    
                 	<div class="box-panel">
                    	<h2></h2>
                        
                        <div id="div2">
                         <table id="table2">
                         	<tr>
                            <th> No </th>
                            <th> Place Name </th>
                            <th> Action </th>
                            </tr>
                         	<tr>
                            <td > 1 </td>
                            <td> Rumah </td>
                            <td > <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                            <td> <input type="submit" name="" value="Delet"> </td>
                       		</tr>                           
                       	  </table>                          
                        </div>
                        <div id="imput">
                        	 Imput Place
                        </div>
                        <div id="form">
                        	 <input type="text" name="#" style="width:100%" placeholder="Place Name">
                            
                             	<button class="button" name="#" style="width:100%"><span>Submit </span></button>
                             
                        </div>
                    </div>
                </div>
   </div>
   </div>	
   </body>
</html>
