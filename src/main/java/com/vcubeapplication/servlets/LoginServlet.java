package com.vcubeapplication.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import com.vcubeapplication.dao.AdminDAO;
import com.vcubeapplication.dao.FacultyDAO;
import com.vcubeapplication.dao.StudentDAO;
import com.vcubeapplication.model.AdminModel;
import com.vcubeapplication.model.FacultyModel;
import com.vcubeapplication.model.StudentModel;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Adminservlet");
		String user_id= request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String role=request.getParameter("role");
		if(role.equals("Admin")) {
		AdminModel alm=new AdminModel();
		alm.setUser_id(user_id);
		alm.setPwd(pwd);
		
		AdminDAO ado=new AdminDAO();
		String status=ado.adminLogin(alm);
		
		if(status.equals(user_id)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("userid",user_id);
			
			RequestDispatcher rd=request.getRequestDispatcher("/admin.jsp");
			rd.include(request, response);
		}
		else {
			HttpSession session=request.getSession(true);
			session.invalidate();
			
			request.setAttribute("invalid","Invalid credentials");
			
			RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
			
			rd.include(request, response);
			
		}
		
		}
		else if(role.equals("Faculty")) {
			FacultyModel flm=new FacultyModel();
			flm.setUserid(user_id);
			flm.setPassword(pwd);
			FacultyDAO fld=new FacultyDAO();
			String status =fld.facultyLogin(flm);
			
		
			if(status.equals(user_id)) {
				HttpSession session= request.getSession();
				session.setAttribute("userid",user_id);
				RequestDispatcher rd=request.getRequestDispatcher("/faculty.jsp");
				rd.include(request, response);
			}
			else {
				HttpSession session=request.getSession(true);
				session.invalidate();
				request.setAttribute("invalid","Invalid credentials");
			
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
			
		}
		else {
			StudentModel  slm= new StudentModel();
			slm.setUserid(user_id);
			slm.setPassword(pwd);
			StudentDAO sld=new StudentDAO();
			String status=sld.studentLogin(slm);
			if(status.equals(user_id)) {
				HttpSession session= request.getSession();
				session.setAttribute("userid",user_id);
				RequestDispatcher rd=request.getRequestDispatcher("/student.jsp");
				rd.include(request, response);
				
			}
			else {
				HttpSession session=request.getSession(true);
				
				request.setAttribute("invalid","Invalid credentials");
				
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
				
				
			}
		}
		
	}

}
