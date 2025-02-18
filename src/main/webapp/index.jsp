<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VcubeSoftwaresolutions</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
body {


font-family: Arial, Helvetica, sans-serif;
}

form {


border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}
.fps{
text-align-last: right;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<script>

function view(){
	var username=document.getElementById("uname");
	var password = document.getElementById("pwd").value;
	var role=document.getElementById("role").value
    

	if(username==""||password==""|| role=="") {
		document.getElementById("p").innerHTML = "*Enter Mandatory Fileds";
		document.getElementById("p").style.color ="red";
		return false;
	}
	else{
		return true;
	}
	
	}
/*  $(document).ready(function() {
    
    $('h6').hide();
   
 });  */
 

</script>
</head>

<body >
<div class="container-fluid ">
<nav class="navbar navbar-Inverse ">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">carrier</a></li>
      <li><a href="#">courses</a></li>
      <li><a href="#">contact</a></li>
    </ul>
   
  </div>
</nav>
</div>
    <div class="container-fluid text-centre">
    <div class="row">
    
    <div class="col-md-5">
   
    </div>
    <div class="col md-2">
    
      <a href="index.html">VCUBE SOFTWARE SOLUTIONS</a>
   
    </div>
    </div>
    </div>
  
	<form name="Adminlogin" action="login" method="post" onsubmit="return view()">
  

   <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="*Enter Username" id="uname" name="uname">

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="*Enter Password" name="pwd" id="pwd" >
    <div class="col-sm-10"></div>
    <div class="col-sm-2">

     <a class="text-right" href="forgotpassword.jsp">FORGOT PASSWORD</a><br>
     </div>
    <label for="role"><b>select your role:</b></label>
    
	<select class="form-control" name="role" id="role" >
	  <option value="">Select</option>
	  <option value="Admin">Admin</option>
	  <option value="Faculty">faculty</option>
	  <option value="Student">student</option>
	</select> 
	<p id="p"></p>
	
	<%
	String error= (String) request.getAttribute("invalid");

	if(error!=null){%>

	<h6 style="color:red;"><%=request.getAttribute("invalid")%></h6>
	
	<%
	}
	else{
		out.println("");
		
			 }%>
			 
    <button type="submit">Login</button>
  
    </div>
  
	
</form>
</body>
</html>