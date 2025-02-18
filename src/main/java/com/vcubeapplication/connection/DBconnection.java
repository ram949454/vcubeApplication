package com.vcubeapplication.connection;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection {
	public static Connection  Connect() {
		Connection cn=null;
try {
	// driver loading
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 //connection establishing
	 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","R@m949454");
	
	}
catch(Exception e) {
	e.printStackTrace();
	
}

return cn;
}


}
