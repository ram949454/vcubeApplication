package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.vcubeapplication.dao.AdminDAO;
import com.vcubeapplication.dao.FacultyDAO;
import com.vcubeapplication.dao.StudentDAO;
import com.vcubeapplication.model.AdminModel;
import com.vcubeapplication.model.FacultyModel;
import com.vcubeapplication.model.StudentModel;


@WebServlet("/forgotpassword")
public class ForgotpasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd");
		String role=request.getParameter("role");
		if(role.equals("Admin")) {
			System.out.println("forgot passsword servlet");
		
			 AdminModel forgotpassword= new  AdminModel();
			 forgotpassword.setUser_id(username);
			 forgotpassword.setPwd(password);
		    AdminDAO fpd=new AdminDAO();
		String status=fpd.forgotPassword(forgotpassword);
		if(status.equals("SUCCESS")) {
			RequestDispatcher rd=request.getRequestDispatcher("/passwordchange.jsp");
			rd.include(request, response);
	}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("/forgotpassword.jsp");
			rd.include(request, response);
			
		}

}
		else if(role.equals("Student")) {
			StudentModel forgotpassword=new StudentModel();
			forgotpassword.setUserid(username);
			forgotpassword.setPassword(password);
			StudentDAO fpd= new  StudentDAO();
			String status=fpd.forgotPassword(forgotpassword);
			if(status.equals("SUCCESS")) {
				RequestDispatcher rd=request.getRequestDispatcher("/passwordchange.jsp");
				rd.include(request, response);
		}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("/forgotpassword.jsp");
				rd.include(request, response);
				
			}	
		}
		else {
			System.out.println("faculty forgotpassword");
			FacultyModel forgotpassword=new FacultyModel();
			forgotpassword.setUserid(username);
			forgotpassword.setPassword(password);
			FacultyDAO fpd= new FacultyDAO();
			String status=fpd.forgotPassword(forgotpassword);
			if(status.equals("SUCCESS")) {
				RequestDispatcher rd=request.getRequestDispatcher("/passwordchange.jsp");
				rd.include(request, response);
		}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("/forgotpassword.jsp");
				rd.include(request, response);
				
			}	
		}
			
	}
}
