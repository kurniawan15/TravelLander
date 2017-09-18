<%-- 
    Document   : index
    Created on : Sep 15, 2017, 8:39:55 PM
    Author     : Pega Kurniawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Event</title>
    </head>
    <body>
        <%
            String nama = session.getAttribute("username").toString();
            out.println("Selamat Datang " + nama +"<br> Anda berhasil Login");
        %>
        
        <a href="logout.jsp"> LOGOUT </a>
        
        <h1>CALENDER TRAVELLER</h1>
        <form name="myForm" action="addData.jsp" method="POST">
            <table border="0">

                <tbody>
                     <tr>
                        <td>DATE OF TODAY</td>
                        <td><input type="text" name="date" value="MM/DD/YYYY" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Event :</td>
                        <td><input type="text" name="event" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Destination :</td>
                        <td><input type="text" name="destination" value="" size="40" /></td>
                    </tr>
                    
                   
                    <tr>
                        <td>Transfortation :</td>
                        <td><select name="transfortation">
                                <option>BIKE</option>
                                <option>MOTORCYCLE</option>
                                <option>CAR</option>
                                <option>PUBLIC TRANSPORT</option>
                                <option>TRAIN</option>
                                <option>BOAT</option>
                                <option>AIRCRAFT</option>
                            </select></td>
                    </tr>
                   
                    <tr>
                        <td>Time Arrive :</td>
                        <td><input type="text" name="arrive" value="HH:MM:SS" size="15" /></td>
                    </tr>
                    <tr>
                        <td>Time Depart :</td>
                        <td><input type="text" name="depart" value="HH:MM:SS" size="15" /></td>
                    </tr>
                     <tr>
                        <td>Duration time:</td>
                        <td><input type="text" name="duration" value="" size="40" /></td>
                    </tr>
                
                </tbody>
            </table>
            <input type="reset" value="Claer" name="clear" />
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
