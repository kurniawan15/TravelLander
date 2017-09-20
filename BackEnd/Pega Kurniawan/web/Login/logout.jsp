<%-- 
    Document   : logout
    Created on : Sep 17, 2017, 11:47:17 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGOUT</title>
    </head>
    <body>
        <%
         session.invalidate(); //untuk membersihkan session  
         response.sendRedirect("../login.jsp");
        %>
    </body>
</html>
