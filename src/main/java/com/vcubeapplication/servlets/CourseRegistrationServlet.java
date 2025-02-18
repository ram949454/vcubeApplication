package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcubeapplication.dao.CourseDAO;
import com.vcubeapplication.model.CourseModel;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/Registrationcourse")
public class CourseRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("course servlet");
		String course_id=request.getParameter("courseid");
		String courseName=request.getParameter("coursename");
		String courseFee=request.getParameter("coursefee");
		String courseDuration=request.getParameter("courseduration");
		CourseModel cm=new CourseModel();
		cm.setCourse_id(Integer.parseInt(course_id));
		cm.setCourseName(courseName);
		cm.setCourseFee(Integer.parseInt(courseFee));
		cm.setCourseDuration(Integer.parseInt(courseDuration));
		CourseDAO cdo=new CourseDAO();
		String status=cdo.coursedao(cm);
		if(status.equals("SUCCESS")) {
			RequestDispatcher rd=request.getRequestDispatcher("/admin.jsp");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/course.jsp");
			rd.include(request, response);
		}
	}

}
