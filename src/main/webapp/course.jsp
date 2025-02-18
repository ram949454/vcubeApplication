<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CourseRegistration</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
			h3 {text-align: center;
			color: Green;
			background-color: lightgrey;
		}
			.paddingbottom{
				padding-bottom: 15px;
			}
			.paddingbottom1{
				padding-bottom: 25px;
			}
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
<div class="container-fluid" style="padding-top: 50px;">
		
            <div class="row">
                <div class="col-lg-2 bg-info">
                    
                </div>
                <div class="col-lg-8">
                <h3>COURSE  </h3>
                    <form class="form-group" name="course" method="post" action ="Registrationcourse">
                        <div class="row padding-bottom">
                            <div class="col-md-6">
                                <label>CourseId</label>
                                <input class="form-control" type="text" name="courseid" id="courseid" placeholder="*Courseid">
                                <p id="p1"></p>
                            </div>
                            <div class="col-md-6">
                                <label>Course Name:</label>
                                <input class="form-control" type="text" name="coursename" id="coursename" onfocus="displname()" placeholder="*Course Name">
                                <p id="p2"></p>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <label>*Course Fee</label>
                                <input class="form-control" type="text" name="coursefee" id="coursefee" placeholder="*Course Fee" >
                               
                            </div>
                            <div class="col-md-6">
                                <label>Course Duration:</label>
                                <input class="form-control" type="text" name="courseduration" id="courseduration"  placeholder="Course Duration">
                                
                            </div>

                        </div>
                      
                       
                        <div class="row padding-bottom">
                        
                            <div class="col-md-6">
                                <button type="submit" class="btn btn-success ">SUBMIT</button>
                                <p id="p3"> </p>
                            </div>

                        </div>
                        

                    </form>
                </div>
                <div class="col-lg-2 bg-info" >

                </div>
            </div>
        </div>


</body>
</html>