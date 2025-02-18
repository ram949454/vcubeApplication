<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import=" java.util.List,com.vcubeapplication.model.FacultyModel,com.vcubeapplication.model.CourseModel" %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>courses offerd</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
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
<table >
  <thead>
	  <tr>
		 <th>COURSEID</th>
		 <th>COURSENAME</th>
		 <th>COURSE FEE</th>
		 <th>COURSE DURATION</th>
		 </tr>
		 </thead>
  <%try{
	 
	  List<CourseModel> courselist=(List<CourseModel>) request.getAttribute("courselist");
	 
  if (courselist!=null){
	  for(CourseModel courselist1 :courselist){%>
		 
		 <tr>
		 <td><%=courselist1.getCourse_id() %></td>
		 <td><%=courselist1.getCourseName() %></td>
		 <td><%=courselist1.getCourseFee() %></td>
		 <td><%=courselist1.getCourseDuration() %></td>
		</tr>
		
		
		 <% 
 }
 }
  }
 catch(Exception e){
	 e.printStackTrace();
 }%>
  </table>
 </div>
 </div>
 </div>
</body>
</html>