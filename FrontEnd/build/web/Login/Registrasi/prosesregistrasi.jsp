<%-- 
    Document   : prosesregis
    Created on : Sep 25, 2017, 11:28:17 PM
    Author     : Cyber Pegasuss
--%>
%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
    String firstName = request.getParameter("firstname");    
    String lastName = request.getParameter("lastname");    
    String userName = request.getParameter("user");    
    String email = request.getParameter("email");
    String pass = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelender1",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into user( email, nama_user,firstname, lastname, password) values "
            + "('" + email + "','" + userName + "','" + firstName + "','" + lastName + "','" + pass + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
       // response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
