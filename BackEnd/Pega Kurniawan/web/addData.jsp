<%-- 
    Document   : addEvent
    Created on : Sep 15, 2017, 9:22:54 PM
    Author     : Pega Kurniawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EVENT</title>
    </head>
    <body>
        <h1>ADD EVENT TRAVELLER!</h1>
        <% 
            String dateTraveller = request.getParameter("date");
            String nameTraveller = request.getParameter("name");
            String destinationTraveller = request.getParameter("destination");
            String transfortationTraveller = request.getParameter("transfortation");
            String arriveTraveller = request.getParameter("arrive");
            String departTraveller = request.getParameter("depart");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>DATE :</th>
                    <th> <%= dateTraveller %> </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>NAME :</td>
                    <td><%= nameTraveller %></td>
                </tr>
                <tr>
                    <td>DESTINATION</td>
                    <td><%= destinationTraveller %></td>
                </tr>
                <tr>
                    <td>TRANSFORTATION</td>
                    <td><%= transfortationTraveller %></td>
                </tr>
                <tr>
                    <td>TIME ARRIVE</td>
                    <td><%= arriveTraveller %></td>
                </tr>
                <tr>
                    <td>TIME DEPART</td>
                    <td><%= departTraveller %></td>
                </tr>
            </tbody>
            <a href="addEvent.jsp">Tambah Data</a>
        </table>

    </body>
</html>
