<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>facultypage</title>
<style>
h3 {text-align: center;
			color: Green;
			background-color: lightgrey;
		}
		</style>
</head>
<body>
<h3>welcome to faculty portal </h3>
<% HttpSession session1=request.getSession();
	out.println ("Welcome  "+ session1.getAttribute("userid"));
	
	%>
</body>
</html>