package com.vcubeapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.vcubeapplication.connection.DBconnection;
import com.vcubeapplication.model.FacultyModel;

public class FacultyDAO {
	String status="fail";
	public String facultyRegistrationDAO(FacultyModel frm) {
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("insert into Faculty(Faculty_fname,Faculty_lname,gender,MOBILEN0,MAIL_ID,user_id,PASSWORD,STATUS,course_id) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, frm.getFirstname());
			ps.setString(2, frm.getLastname());
			ps.setString(3, frm.getGender());
			ps.setString(4,frm.getMblno());
			ps.setString(5, frm.getEmailid());
			ps.setString(6, frm.getUserid());
			ps.setString(7, frm.getPassword());
			ps.setString(8, frm.getStatus());
			ps.setInt(9, frm.getCourseid());
			int n=ps.executeUpdate();
			if(n>0) {
				status="SUCCESS";
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	return status;	
	}
	public List<FacultyModel> listOfFaculty(){
		List<FacultyModel> listoffaculty=new ArrayList<FacultyModel>();
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("select * from Faculty");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int facultyid=rs.getInt(1);
				String firstname=rs.getString(1);
				String lastname=rs.getString(3);
				String gender=rs.getString(3);
				String mblno=rs.getString(5);
				String emailid=rs.getString(6);
				String userid=rs.getString(7);
				String password=rs.getString(8);
				String status=rs.getString(9);
				int courseid=rs.getInt(10);
				listoffaculty.add(new FacultyModel(facultyid,firstname,lastname,gender,mblno,emailid,userid,password,status,courseid));
			}
		}
		
		 catch (Exception e) {
			e.printStackTrace();
			}
		return listoffaculty;
	}
	
	public String facultyLogin(FacultyModel flm) {
		try {
			Connection cn=DBconnection.Connect();
			System.out.println("hello from FACULTY dao");
			PreparedStatement ps=cn.prepareStatement("select * from Faculty where user_id=? and PASSWORD=?");
			ps.setString(1,flm.getUserid());
			ps.setString(2, flm.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				status=flm.getUserid();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return status;
	}
	public String forgotPassword(FacultyModel forgotpassword) {
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("update  Student set PASSWORD=? where uder_id=?");
			ps.setString(1,forgotpassword.getPassword());
			ps.setString(2, forgotpassword.getUserid());
			int n=ps.executeUpdate();
			if(n>0) {
				status="SUCCESS";
				
		}
		}
		catch(Exception e ) {
			e.printStackTrace();
			
		}
		return status;
}
}


