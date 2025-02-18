
package com.vcubeapplication.model;
//admin 
public class AdminModel {
	private String user_id;
	private String pwd;
			public AdminModel() {
			}
			public AdminModel(String user_id,String Pwd) {
				this.user_id=user_id;
				this.pwd=Pwd;
	
			}
			
			public String getUser_id() {
				return user_id;
			}
			public void setUser_id(String user_id) {
				this.user_id = user_id;
				System.out.println("user_id  admin model: "+user_id);
			}
			public String getPwd() {
				return pwd;
			}
			public void setPwd(String pwd) {
				this.pwd = pwd;
				System.out.println("pwd from admin model: "+pwd);
			}
			

}
