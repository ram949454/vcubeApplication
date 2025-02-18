<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title> facultyregistration </title>
 		<meta name="viewport" content="width=device-width, initial-scale=1">
  		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
 		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
 		 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 		 <script>
            
            function view(){
				var firstname=document.getElementById("firstname");
				var password = document.getElementById("password").value;
				var repassword = document.getElementById("repassword").value;
                var mobilenumber=document.getElementById("mobilenumber").value;
                var emailid=document.getElementById("emailid").value;

				if(firstname==""||password=="" ||repassword==""||mobilenumber==""||emailid==""){
					document.getElementById("p3").innerHTML = "*Enter Mandatory Fileds";
					document.getElementById("p3").style.color ="red";
					return false;
				}
				else{
					return true;
				}
			}
             function dispfname(){
                document.getElementById("p1").innerHTML="enter first name";
             }
             function displname(){
                document.getElementById("p2").innerHTML="enter last name";
             }
             function disppwd(){
				document.getElementById("pwd").innerHTML = "Password must be characters";
			}
			function disprepwd(){
				document.getElementById("repwd").innerHTML = "RE ENTER SAME PASSWORD";
			}
			function verifypwd(){
				var pwd = document.getElementById("password").value;
				var repwd = document.getElementById("repassword").value;
				if(pwd==repwd){
					
					document.getElementById("repwd").innerHTML = "Password and Re-password matched";
					
					document.getElementById("repwd").style.color ="green";
				}
				else{
					
					document.getElementById("repwd").innerHTML = "Password and Re-password NOT matched";
					
					document.getElementById("repwd").style.color ="red";
				}
			}
        </script>
        <script>
            document.getElementById("mobilenumber").addEventListener("keypress",function(event){
               var k=event.which;
                if((k>=96 && k<=105) || k==8){
                    if($(this).val().length==10){
                        if(k==8){
                            return true;
                        }
                        else{
                            event.preventDefault();
                            return false;
                        }
                    }

                }
            
                else{
                    event.preventDefault();
                    return false;
                }

            });

		</script>
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
<nav class="navbar ">
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
                <h3>FACULTY REGISTRATION </h3>
                    <form class="form-group" name="facultyregistration" method="post" action="FacultyRegistration" onsubmit="return view()">
                        <div class="row padding-bottom">
                            <div class="col-md-6">
                                <label>*FIRST NAME:</label>
                                <input class="form-control" type="text" name="firstname" id="firstname" placeholder="*First Name" onfocus="dispfname()">
                                <p id="p1"></p>
                            </div>
                            <div class="col-md-6">
                                <label>*LAST NAME:</label>
                                <input class="form-control" type="text" name="lastname" id="lastname" onfocus="displname()" placeholder="Last Name">
                                <p id="p2"></p>
                            </div>

                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <label>*Gender</label>
	                               <select class="form-control" name="gender" id="gender" >
									  <option value="">Select</option>
									  <option value="male">Male</option>
									  <option value="Female">Female</option>
									  
									</select> 
                            </div>
                            <div class="col-md-6">
                                <label>*Mobile Number:</label>
                                <input class="form-control" type="tel" name="mno" id="mno"  placeholder="Mobile Number">
                                
                            </div>

                        </div>
                      
                        <div class="row">
                            <div class="col-md-6">
                                <label>*Course Id</label> 
                               		<select class="form-control" name="courseid" id="courseid" >
									  <option value="">Select</option>
									  <option value="1">Java Fullstack</option>
									  <option value="2">Python FullStack</option>
									  <option value="3">Devops</option>
									</select> 
	                            </div>
                            <div class="col-md-6">
                                <label>*MAIL ID:</label>
                                <input class="form-control" type="text" name="emailid" id="emailid" placeholder="Email-id">
                            </div>

                        </div>
                         <div class="row">
                            <div class="col-md-6">
                                <label>Status</label> 
									<select class="form-control" name="status" id="status" >
									  <option value="">Select</option>
									  <option value="Active">Active</option>
									  <option value="Inactive">Inactive</option>
									  
									</select>                            </div>
                            <div class="col-md-6">
                                <label>User Id:</label> 
                                <input class="form-control" type="text" name="userid" id="userid"  placeholder="*User Id">
                            </div>
     
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <label>*PASSWORD:</label>
                                <input class="form-control" type="password" name="password" id="password" onfocus="disppwd()"  placeholder="Password">
                                <p id="pwd"></p>
                            </div>
                            <div class="col-md-6 padding-bottom">
                                <label>*RE-ENTER PASSWORD:</label> 
                                <input class="form-control" type="password" name="repassword" id="repassword" onfocus="disprepwd()" onblur="verifypwd()" placeholder="Re-Password"> 
                                <p id="repwd"></p>
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