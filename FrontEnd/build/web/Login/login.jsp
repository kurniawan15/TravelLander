<%-- 
    Document   : index
    Created on : Sep 17, 2017, 11:09:46 PM
    Author     : Delvin v
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>LOGIN</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/allpages.css">
</head>
<style>
body{
 /* Location of the image */
  background-image: url(img/2.jpg);
  
  /* Background image is centered vertically and horizontally at all times */
  background-position: center center;
  
  /* Background image doesn't tile */
  background-repeat: no-repeat;
  
  /* Background image is fixed in the viewport so that it doesn't move when 
     the content's height is greater than the image's height */
  background-attachment: fixed;
  
  /* This is what makes the background image rescale based
     on the container's size */
  background-size: cover;
}
</style>
<div class="header2">
  	<h1>Travelander</h1>
</div>
<br>
<br>
<br>
<br>
<div class="row">

<div class="col-5 1">
		<div class="header">
                    <form name="login" method="post" action="ceklogin.jsp">
		  <center>Sign In</center>
		</div>
		    <input type="text" id="fname" name="user" placeholder="Username">
		    <input type="password" id="lname" name="pass" placeholder="Password">
		    <input type="submit" value="Login">
		</div>
		<div class="col-6 2">
		<div class="header">
                </form>
                    <form name="registrasi" action="Registrasi/prosesregistrasi.jsp">
		  <center>Register</center>
		</div>
			<div class="col-6 3.1">
			    <input type="text" id="fname" name="firstname" placeholder="Your name..">
			</div>
			<div class="col-6 3.2">
			    <input type="text" id="lname" name="lastname" placeholder="Your last name..">
			</div>
			<input type="text" id="lname" name="email" placeholder="Your E-mail..">
			<div class="col-6 3.1">
			    <input type="text" id="fname" name="user" placeholder="Your Username..">
			</div>
			<div class="col-6 3.2">
			    <input type="password" id="lname" name="pass" placeholder="Your Password..">
			</div>
		    <label for="country" style="color: white">Country</label><br>
		    <select id="country" name="country">
		      <option value="australia">Indonesia</option>
		      <option value="canada">Swedia</option>
		    </select>
		    <input type="submit" value="Submit">
		</div>

</div>
</form>
        <br>
        <br>
	<div class="footer">
 		<p>© Copyright Kelompok B2 | October 2017</p>
 	</div>
</body>
</html>

