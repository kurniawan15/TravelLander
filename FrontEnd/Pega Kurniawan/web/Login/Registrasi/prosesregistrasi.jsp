<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : prosesregistrasi
    Created on : Sep 18, 2017, 7:42:08 PM
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
        
   <%!
      public class Data{
      String URL = "jdbc:mysql://localhost:3306/travelender";
      String username = "pega";
      String password = "pega";

      Connection connection = null;
      PreparedStatement insertData = null;
      ResultSet resultset = null;
      
      public Data(){
      
      try{
         connection = DriverManager.getConnection(URL, username,password);
         insertData = connection.prepareStatement(
         "INSERT INTO akun (username, password, email)"
         + "VALUES(?,?,?) ");

        } catch (SQLException e){
        e.printStackTrace();
        }
    }

    public int setData(String usernama, String password, String email){
    int result = 0;
    
    try{
      insertData.setString(1, username);
      insertData.setString(2, password);
      insertData.setString(3, email);
      result = insertData.executeUpdate();

    }
     catch(SQLException e){
     e.printStackTrace();
    }
    
    return result;
    }
}
    %>
        
    <%
        int result = 0;
           
        String user = new String();
        String pass = new String();
        String mail = new String();
        
        if(request.getPart("username") != null){
            user = request.getParameter("username");
        }
        if(request.getPart("password") != null){
            pass = request.getParameter("password");
        }
        if(request.getPart("email") != null){
            mail = request.getParameter("email");
        }
        
       Data data = new Data();
       result = data.setData(user, pass, mail);
       
    %> 
        
    <%
//        String user = request.getParameter("username");    
//        String pass = request.getParameter("password");
//        String email = request.getParameter("email");
//        koneksi connection = new koneksi();
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveller", "root", "");
//        Statement st = con.createStatement();
//        ResultSet rs;
//        int i = st.executeUpdate("insert into akun( username, password, email) values ('" + user + "' ,'" + pass + "','" + email + "'())");
//        if (i > 0) {
//            //session.setAttribute("userid", user);
//            response.sendRedirect("welcome.jsp");
//            out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
//        } else {
//            response.sendRedirect("index.jsp");
//        }
    %>

    </body>
</html>
