package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcubeapplication.dao.StudentDAO;
import com.vcubeapplication.model.StudentModel;

@WebServlet("/StudentRegistration")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("student reg servlet");
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String mno=request.getParameter("mno");
		String emid=request.getParameter("emid");
		String branch=request.getParameter("branch");
		String yop=request.getParameter("yop");
		String percentage=request.getParameter("percentage");
		String status=request.getParameter("status");
		String courseid=request.getParameter("courseid");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		//model object to student and setting parameters to model
		
		StudentModel srm=new StudentModel();
		srm.setFirstname(fname);
		srm.setLastname(lname);
		srm.setGender(gender);
		srm.setMblno(mno);
		srm.setEmailid(emid);
		srm.setBranch(branch);
		srm.setYop(yop);
		srm.setPercentage(Integer.parseInt(percentage));
		srm.setStatus(status);
		srm.setCourseid(Integer.parseInt(courseid));
		srm.setUserid(userid);
		srm.setPassword(password);
		//creating object student dao
		StudentDAO srd=new StudentDAO();
		
		String status1=srd.studentRegistration(srm);
		
		if(status1.equals("SUCCESS")) {
			RequestDispatcher rd= request.getRequestDispatcher("/success.jsp");
			rd.include(request, response);
			
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("/StudentRegistration.jsp");
			rd.include(request, response);
			
		}
		
		
		
	}

}
