package com.vcubeapplication.model;

public class CourseModel {
	private int course_id;
	private String courseName;
	private int courseFee;
	private int courseDuration;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
		System.out.println("hello from course model");
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public CourseModel() {
		
	}
public CourseModel(int course_id,String courseName,int courseFee,int courseDuration) {
		this.course_id=course_id;
		this.courseName=courseName;
		this.courseFee=courseFee;
		this.courseDuration=courseDuration;
	}
@Override
public String toString() {
	return "CourseModel [course_id=" + course_id + ", courseName=" + courseName + ", courseFee=" + courseFee
			+ ", courseDuration=" + courseDuration + "]";
}



}
