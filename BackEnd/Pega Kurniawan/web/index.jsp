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
        <title>LOGIN</title>
            <link rel="stylesheet" href="css/index.css">
    </head>
    <body>
    <div class="container">
        <div class="loginBox">
        <h3> Silakan Log In di </h3>
      <form name="login" action="ceklogin.jsp">
        	<div class="inputBox">
            	<input type="text" name="user" placeholder="UserName">
                <span><i class="fa fa-user" aria-hidden="true"></i></span>
        	</div>
          
        	<div class="inputBox">
            	<input type="password" name="pass" placeholder="Password">
                <span><i class="fa fa-user" aria-hidden="true"></i></span>
        	</div>
            	<input type="submit" name="login" value=" Sign In">
                <a href="registrasi.jsp">Daftar Disini !!</a>
   
<!--                <a href="www.google.com">Forget Password</a>-->
         	</form>
                </div>    
 
        
<!--            <tr>
               <td colspan="2">Tidak Memiliki Akun?! <a href="registrasi.jsp">Daftar Disini</a></td>
            </tr>-->
            
            </tbody>
        </table>
    </form>
        

    </body>
</html>
