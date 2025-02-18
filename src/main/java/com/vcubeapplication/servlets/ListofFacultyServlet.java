package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.vcubeapplication.dao.FacultyDAO;
import com.vcubeapplication.model.FacultyModel;

@WebServlet("/trainers")
public class ListofFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FacultyDAO listoffaculty=new FacultyDAO();
		List<FacultyModel> facultylist=listoffaculty.listOfFaculty();
		
		request.setAttribute("listoffaculty", facultylist);
		RequestDispatcher rd=request.getRequestDispatcher("/listoffaculty.jsp");
		rd.include(request, response);
	}

}
