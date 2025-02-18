<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style>
	.dropbtn {
  background-color: rgb(64, 128, 128);
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
h3 {text-align: center;
	background-color:  rgb(64, 128, 128);
	color:white;
		}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}
.padding-bottom{
padding:10px 10px 10px 10px}


.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}

</style>
</head>
<body>

<div class="container-fluid ">
<nav class="navbar navbar-Inverse ">
  <div class="container-fluid">
    <div class="row">
    <div class="col-md-8">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">carrier</a></li>
      <li><a href="#">courses</a></li>
      <li><a href="#">contact</a></li>
    </ul>
    </div>
    
    <div class="col-md-2"></div>
    <div class="col-md-2">
    <% HttpSession session1=request.getSession();
	out.println ("Welcome  "+ session1.getAttribute("userid"));
	
	%>
   <form class="form-group" name="logout" method="post" action="logout" >
    <button type="submit" class="btn btn-center btn-info">logout</button>
    
  </form>
  </div>
  </div>
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
<div class="container-fluid padding-bottom">

		<h3>WELCOME TO V-CUBE SOFTWARE SOLUTIONS</h3>
		  </div>
		  <div class="container-fluid">
		<div class="row">
		<div class="col-md-3">
		<a href="facultyRegistration.jsp"><button class="btn btn-info">FACULTY REGISTRATION</button> </a></div>
		<div class="col-md-3">
		    <a href="studentRegistration.jsp"><button class="btn btn-info">STUDENT REGISTRATION</button></a>
		
		</div>
		<div class="col-md-3">
		
		<a href="course.jsp"><button class="btn btn-info">COURSE REGISTRATION</button></a>
		</div>
		<div class="col-md-3">
		    <a href="batch.jsp"><button class="btn btn-info">BATCH REGISTRATION</button></a>
		
		</div>
 
  
   
    
    
</div>
  </div>
  



<div class="container">
<div class="row">
<div class="col-lg-4">

<form class="form-group" name="listofcourses" method="post" action="listofcourses" >
    <h3><button type="submit" class="btn btn-center btn-info">Listofcourse offered</button></h3>
  </form>
  
</div>
<div class="col-lg-4">

<form class="form-group" name="trainers" method="post" action="trainers" >
    <h3><button type="submit" class="btn btn-center btn-info">Trainers</button></h3>
    
  </form>   
</div>
<div class="col-lg-4">

<form class="form-group" name="PLACEMENTS" method="post" action="PLACEMENTS" >
    <h3><button type="submit" class="btn btn-center btn-info">PLACEMENTS</button></h3>
    
  </form>
</div>
</div>
</div>
</body>
</html>