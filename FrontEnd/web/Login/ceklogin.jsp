<%-- 
    Document   : ceklogin
    Created on : Sep 17, 2017, 11:28:29 PM
    Author     : Delvin V

--%>

<%@ page import ="java.sql.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String user = request.getParameter("user");    
    String pass = request.getParameter("pass");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelender",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from user where username='" + user + "' and password='" + pass + "'");
    if (rs.next()) {
        session.setAttribute("user", user);
        out.println("welcome " + user);
        //out.println("<a href='../logout.jsp'>Log out</a>");
        response.sendRedirect("Admin/calender.jsp");
    } else {
        out.println("Invalid password <a href='../index.jsp'>try again</a>");
    }
%>