<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import=" java.util.List,com.vcubeapplication.model.FacultyModel" %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>courses offerd</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
   th,td {
            border: 1px solid #dee2e6;
            padding: 10px;
            text-align: center;
            }
            
            th {
            background-color: #f2f2f2;
            color: #343a40;
            }</style>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-3">
</div>
<div class="col-md-6">
<table>
  <thead>
	  <tr>
		 <th>Faculty_id</th>
		 <th></th>
		 <th></th>
		 <th></th>
		  <th></th>
		 <th></th>
		 <th></th>
		 <th></th>
		 </tr>
		 </thead>
  <%
  try{
  	 
  	  List<FacultyModel> facultylist=(List<FacultyModel>)request.getAttribute("listoffaculty");
  	    if(facultylist!=null){
  	     for(FacultyModel faculty :facultylist){
  %>
		 <tr>
		 <td></td>
		 <td></td>
		 <td></td>
		 <td></td>
		
		 </tr>
		 </table>
		 <% 
 }
 }
  }
 catch(Exception e){
	 e.printStackTrace();
 }%>
 </div>
 </div>
 </div>
</body>
</html>