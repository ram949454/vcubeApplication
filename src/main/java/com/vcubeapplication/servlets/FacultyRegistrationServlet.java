package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcubeapplication.dao.FacultyDAO;
import com.vcubeapplication.model.FacultyModel;


 @WebServlet("/FacultyRegistration")
 public class FacultyRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String mblno=request.getParameter("mno");
		String emailid=request.getParameter("emailid");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		String status=request.getParameter("status");
		String courseid=request.getParameter("courseid");
		FacultyModel frm=new FacultyModel();
		frm.setFirstname(firstname);
		frm.setLastname(lastname);
		frm.setGender(gender);
		frm.setMblno(mblno);
		frm.setEmailid(emailid);
		frm.setUserid(userid);
		frm.setPassword(password);
		frm.setStatus(status);
		frm.setCourseid(Integer.parseInt(courseid));
		FacultyDAO frd =new  FacultyDAO();
		String status1 =frd.facultyRegistrationDAO(frm);
		if(status1.equals("SUCCESS")) {
			RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
			rd.include(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/facultyRegistration.jsp");
			rd.include(request, response);
			
		}
	}

}
