package com.vcubeapplication.model;

public class FacultyModel {
	private int facultyid;
	private String firstname;
	private String lastname;
	private String gender;
	private String mblno;
	private String emailid;
	private String userid;
	private String password;
	private String status;
	private int courseid;
	
	public FacultyModel() {
		
	}
		public FacultyModel(int facultyid,String firstname,String lastname,String gender,String mblno,String emailid,String userid,String password,String status,int courseid) {
			this.facultyid=facultyid;
			this.firstname=firstname;
			this.lastname=lastname;
			this.gender=gender;
			this.mblno=mblno;
			this.emailid=emailid;
			this.userid=userid;
			this.password=password;
			this.status=status;
			this.courseid=courseid;
		
	}
		public int getFacultyid() {
			return facultyid;
		}
		public void setFacultyid(int facultyid) {
			this.facultyid = facultyid;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMblno() {
			return mblno;
		}
		public void setMblno(String mblno) {
			this.mblno = mblno;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			System.out.println("userid");
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getCourseid() {
			return courseid;
		}
		public void setCourseid(int courseid) {
			this.courseid = courseid;
		}
		
		
	
}
