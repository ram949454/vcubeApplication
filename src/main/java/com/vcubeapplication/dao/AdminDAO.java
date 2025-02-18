package com.vcubeapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.vcubeapplication.connection.DBconnection;
import com.vcubeapplication.model.AdminModel;
public class AdminDAO {
	String status="fail";
	public String adminLogin(AdminModel alm) {
		try {

			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("select * from admin where adminuser_id=? and adminpassword=?");
			ps.setString(1,alm.getUser_id());
			ps.setString(2, alm.getPwd());
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				//System.out.println(rs.getString(1)+" "+rs.getString(2));
				status=alm.getUser_id();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	return status;	
	}
	public String forgotPassword(AdminModel forgotpassword) {
		try {
			System.out.println("admin forgot pwd method");
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("update  Admin set adminpassword=? where adminuser_id=?");
			ps.setString(1,forgotpassword.getPwd());
			ps.setString(2, forgotpassword.getUser_id());
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
