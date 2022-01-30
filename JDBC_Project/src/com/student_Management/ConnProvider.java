package com.student_Management;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConnProvider {
	
	 static Connection con;
	
	public static Connection createC() {
		
		
		try {
			//loaded the driver
			Class.forName("com.mysql.jdbc.Driver");
			//create the connection
			
			String user="root";
			String password="1234";
			String url="jdbc:mysql://loacalhost:3306/student_management";
			
			con= DriverManager.getConnection(url, user, password);
			
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
		
	}

}
