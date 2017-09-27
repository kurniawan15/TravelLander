<%-- 
    Document   : selected
    Created on : Sep 25, 2017, 9:25:00 PM
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
            String nama = session.getAttribute("id_Admin").toString();
        //    out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
            %>
            <li><a href="../logout.jsp">Log Out</a></li>
	</ul>
</div>
    
    <div id="container">
    	<div class="sidebar">
        <ul id="nav">
        	<li><a href="calender.jsp">Calendar</a></li>
            <li><a href="DataPlace.jsp">Manage Place</a></li>
            <li><a class="selected"  href="distance.html">Manage Distance</a></li>
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
            <p>Distance</p>                      
            	<div id="box">                    
                 	<div class="box-panel">
                    	<h2></h2>
                        
                        <div id="div2">
                         <table id="table2">
                         	<tr>
                            <th> No </th>
                            <th> starting location </th>
                            <th> final location </th>
                            <th> Distance (KM) </th>
                            <th> Action </th>
                            </tr>
                         	<tr>
                            <td > 1 </td>
                            <td> Rumah </td>
                            <td> Kantor </td>
                            <td> 10 </td>
                            <td > <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <a href="place-update.html"><input type="submit" name="" value=" Delet Data"></a> </td>
                       		</tr>
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value=" Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet Data"> </td>
                       		</tr>    
                            <tr>
                            <td> 1 </td>
                            <td> Rumah </td>
                             <td> Kantor </td>
                            <td> 10 </td>
                            <td> <input type="submit" name="" value="Delet"> </td>
                       		</tr>                           
                       	  </table>                          
                        </div>
                        <div id="imput">
                        	 Imput Distance
                        </div>
                        <div id="form">
                        	<div class="chose1">
                            starting location		
                                <select id="locaton" name="location" style="width:25%" >
                                    <option value="jangar"></option>
                                    <option value="jangar">Tempat1</option>
                                    <option value="jangar">Tempat2</option>
                                    <option value="jangar">Tempat3</option>
                                    <option value="jangar">Tempat4</option>
                                    <option value="jangar">Tempat5</option>
                                    <option value="jangar">Tempat6</option>
                                </select>
                               
                        	
                           Final Location
                           		
                             	<select id="locaton2" name="location" style="width:25%">
                                    <option value="jangar"></option>
                                    <option value="jangar">Tempat1</option>
                                    <option value="jangar">Tempat2</option>
                                    <option value="jangar">Tempat3</option>
                                    <option value="jangar">Tempat4</option>
                                    <option value="jangar">Tempat5</option>
                                    <option value="jangar">Tempat6</option>
                            	</select>
                                                          
                        	</div>
                           
                        	 <input type="text" name="#" style="width:50%" placeholder="Distance"> KM        
                              <br>                
                             <button class="button"><span>Submit </span></button>
                            
                        </div>
                    </div>
                </div>
   </div>
   </div>
   </body>
</html>
