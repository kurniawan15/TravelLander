<%-- 
    Document   : prosesregis
    Created on : Sep 25, 2017, 11:28:17 PM
    Author     : Delvin V
--%>
<%@page import="model.User"%>
<%@page import="repository.UserDAO"%>

%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%
/*

    String firstName = request.getParameter("firstname");    
    String lastName = request.getParameter("lastname");    
    String userName = request.getParameter("user");    
    String email = request.getParameter("email");
    String pass = request.getParameter("password");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelender",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    int i = st.executeUpdate("insert into user( email, nama_user,firstname, lastname, password) values "
            + "('" + email + "','" + userName + "','" + firstName + "','" + lastName + "','" + pass + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
       // response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
*/
%>

<%
   String driverName = "com.mysql.jdbc.Driver"; // Driver Untuk Koneksi Ke MySQL  
   String jdbc = "jdbc:mysql://";  
   String host = "localhost:"; // Bisa Menggunakan IP Anda, Cnth : 192.168.100.100  
   String port = "3306/"; // Port ini port MySQL  
   String database = "travelender"; // Ini Database yang akan digunakan  
   String url = jdbc + host + port + database;  
   String username = "root"; // username default mysql  
   String password = "";  

    UserDAO userDAO = new UserDAO(url,username,password);

    String idUser = userDAO.getNewIdUser();
    
    String firstName = request.getParameter("firstname");    
    String lastName = request.getParameter("lastname");    
    String userName = request.getParameter("user");    
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");

    
    User user = new User(idUser,firstName+" "+lastName,userName,email,pass);
    boolean row = userDAO.insert(user);
    
    if(row == true  ){
        response.sendRedirect("../login.jsp");
        out.println(userName);
        out.println(pass);
    }
    else{

    
%>

<%
            out.println("GAGAL");
        }
        %>
        
        