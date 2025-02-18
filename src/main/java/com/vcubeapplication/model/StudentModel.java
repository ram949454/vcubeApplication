package com.vcubeapplication.model;

public class StudentModel {
	private int id;
	private String firstname;
	private String lastname;
	private String gender;
	private String mblno;
	private String emailid;
	private String branch;
	private String yop;
	private int percentage;
	private String userid;
	private String password;
	private String status;
	private int courseid;
	
	public StudentModel(){
		
	}
public StudentModel(int id,String firstname,String lastname,String gender,String mblno,String emailid,String branch,String yop,int percentage,String userid,String password,String status,int courseid){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.gender=gender;
		this.mblno=mblno;
		this.emailid=emailid;
		this.branch=branch;
		this.yop=yop;
		this.percentage=percentage;
		this.userid=userid;
		this.password=password;
		this.status=status;
		this.courseid=courseid;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
		System.out.println("STUDENT REG FROM MODEL");
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
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
		System.out.println(this.status);
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
		System.out.println(this.courseid);
	}
	
	
	

}
