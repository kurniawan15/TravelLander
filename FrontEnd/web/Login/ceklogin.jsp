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
//          koneksi connection = new koneksi();  
//          Class.forName("com.mysql.jdbc.Driver");
//          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelender","root", "");
//          Statement st = con.createStatement();
//          ResultSet rs;
//          rs = st.executeQuery("select * from admin where id_Admin ='" + username + "' and password='" + password + "'");
        if (username.equals("admin1")&&(password.equals("admin1"))){
                session.setAttribute("id_Admin",username);
                response.sendRedirect("Admin/DataPlace.jsp");
        }
        else{
       //     {
//            if(rs.next())
//            {
                //berhasil
                session.setAttribute("id_Admin",username);
                response.sendRedirect("Data/dashboardCreateSchedule.jsp");
       //     }
       //     else
       //     {
                //gagal 
       //         response.sendRedirect("error.jsp");
       //  }
        }
        %>
    </body>
</html>
