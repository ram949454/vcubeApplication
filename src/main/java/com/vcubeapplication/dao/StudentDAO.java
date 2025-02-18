package com.vcubeapplication.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.vcubeapplication.connection.DBconnection;
import com.vcubeapplication.model.StudentModel;
		
public class StudentDAO {
	String status="fail";
	public String studentRegistration(StudentModel srm) {
	try {
		System.out.println("student reg dao");
		Connection cn=DBconnection.Connect();
		PreparedStatement ps=cn.prepareStatement("insert into Student(Student_fname,Student_lname,gender,MOBILENO,MAIL_ID,BRANCH,uder_id,PASSEDOUT,PERCENTAGE,PASSWORD,STATUS,course_id) values(?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1, srm.getFirstname());
		ps.setString(2, srm.getLastname());
		ps.setString(3, srm.getGender());
		ps.setString(4, srm.getMblno());
		ps.setString(5, srm.getEmailid());
		ps.setString(6, srm.getBranch());
		ps.setString(7,srm.getUserid());
		ps.setString(8, srm.getYop());
		ps.setInt(9, srm.getPercentage());
		ps.setString(10,srm.getPassword());
		ps.setString(11, srm.getStatus());
		ps.setInt(12, srm.getCourseid());
		
		int n=ps.executeUpdate();
		if (n>0) {
			status="SUCCESS";
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
		return status;
	}
	public String forgotPassword(StudentModel forgotpassword) {
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("update  Student set PASSWORD=? where uder_id=?");
			ps.setString(1,forgotpassword.getUserid());
			ps.setString(2, forgotpassword.getPassword());
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
public String studentLogin(StudentModel slm) {
		
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("Select * from Student where uder_id=? and PASSWORD=? ");
			ps.setString(1,slm.getUserid() );
			ps.setString(2, slm.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				status=slm.getUserid();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return status;
	}
	

}
