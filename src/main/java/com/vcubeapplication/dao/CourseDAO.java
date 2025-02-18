package com.vcubeapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcubeapplication.connection.DBconnection;
import com.vcubeapplication.model.CourseModel;

public class CourseDAO {
	String status="fail";
	public String coursedao(CourseModel cm) {
		
		try {
			Connection cn=DBconnection.Connect();
			System.out.println("hello dao of course");
			PreparedStatement ps=cn.prepareStatement("insert into Course values(?,?,?,?)");
			ps.setInt(1,cm.getCourse_id());
			ps.setString(2,cm.getCourseName());
			ps.setInt(3, cm.getCourseFee());
			ps.setInt(4, cm.getCourseDuration());
			int n=ps.executeUpdate();
			if(n>0) {
				System.out.println("course table filled with values ");
				status="SUCCESS";
			}
				
			}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public List<CourseModel> selectAllCourse() {
		List<CourseModel> courses = new ArrayList<CourseModel>();
		
		try {
			Connection cn=DBconnection.Connect();
			PreparedStatement ps=cn.prepareStatement("select * from Course");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int course_id=rs.getInt(1);
				String course_name=rs.getString(2);
				int course_fee=rs.getInt(3);
				int course_duration=rs.getInt(4);
				courses.add(new CourseModel(course_id,course_name,course_fee,course_duration));
			}
		}
		
		 catch (Exception e) {
			e.printStackTrace();
			}
		return courses;
	}
	

}
