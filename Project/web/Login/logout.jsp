<%-- 
    Document   : logout
    Created on : Sep 17, 2017, 11:47:17 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setAttribute("user", null);
session.invalidate();
response.sendRedirect("../index.jsp");
%>
