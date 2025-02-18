package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.vcubeapplication.dao.CourseDAO;
import com.vcubeapplication.model.CourseModel;
@WebServlet("/listofcourses")
public class ListOfCoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseDAO listofcourses =new CourseDAO();
		List<CourseModel> courselist=listofcourses.selectAllCourse();
		request.setAttribute("courselist", courselist);
		RequestDispatcher rd=request.getRequestDispatcher("/coursesofferd.jsp");
		rd.include(request, response);
		
	}

}
