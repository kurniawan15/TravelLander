<%-- 
    Document   : ceklogin
    Created on : Sep 17, 2017, 11:28:29 PM
    Author     : Cyber Pegasus

--%>
<%@page import="traveller.controller.koneksi"%>
<%@ page import ="java.sql.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          String username = request.getParameter("user");
          String password = request.getParameter("pass");
          //koneksi connection = new koneksi();  
//          Class.forName("com.mysql.jdbc.Driver");
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveller","root", "");
//          Statement st = con.createStatement();
//          ResultSet rs;
//          rs = st.executeQuery("select * from admin where username='" + Username + "' and password='" + Password + "'");
//          if(rs.next())
        if (username.equals("pega")&&(password.equals("pega")))
          {
              //berhasil
              session.setAttribute("username",username);
              response.sendRedirect("addEvent.jsp");
          }
          else
          {
              //gagal 
              response.sendRedirect("error.jsp");
          }
        %>
    </body>
</html>
