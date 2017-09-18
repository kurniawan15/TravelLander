<%-- 
    Document   : index
    Created on : Sep 17, 2017, 11:09:46 PM
    Author     : Cyber Pegasus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1>SELAMAT DATANG DI TRAVELLENDER</h1>
        <form name="login" action="ceklogin.jsp">
        
        <table border="0">
            <tbody>
                <tr>
                    <td colspan="2" align="center"> FORM LOGIN</td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="user" value="" size="20" /></td>
                </tr>
               <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" value="" size="20" /></td>
                </tr> 
            <td colspan="2" align="center"><input type="submit" value="login" name="login" /></td>
            <tr>
               <td colspan="2">Yet Not Registered!! <a href="registrasi.jsp">Register Here</a></td>
            </tr>
            
            </tbody>
        </table>
    </form>
        

    </body>
</html>
