package com.student_Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentData {

	public static boolean insertStudentToDB(Student st) {
		//jdbc code goes here
		
		boolean f=false;  //to check query is submitted to db or not
		try {
			
			Connection con= ConnProvider.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//Prepared statement to fire the query
			
			PreparedStatement pstmt=con.prepareStatement(q);
			// setbthe values of parameters
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//excution of query
			
			pstmt.executeUpdate();
			//this sends data to db
			
			f=true;
			
			con.close();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		
		boolean f=false;  //to check query is submitted to db or not
		try {
			
			Connection con= ConnProvider.createC();
			String q = "Delete from student where sid=?";
			//Prepared statement to fire the query
			
			PreparedStatement pstmt=con.prepareStatement(q);
			// setbthe values of parameters
			
			pstmt.setInt(1, userId);
			
			
			//excution of query
			
			pstmt.executeUpdate();
			//this sends data to db
			
			f=true;
			
			con.close();
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		return f;
		
		
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		
		boolean f=false;  //to check query is submitted to db or not
		try {
			
			Connection con= ConnProvider.createC();
			String q = "Select  * from students";
			
			Statement stmt = con.createStatement();
			
			//excution of query
			//executequery method bcoz it is bringing the data 
			stmt.executeQuery(q);
			
			//result set  is use to store the fetched data
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				
				System.out.println("Id : " +id);
				System.out.println("Name : " +name);
				System.out.println("Phone No. : " +phone);
				System.out.println("City : " +city);
				System.out.println("-----------------------------------");
			}
			
			con.close();
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	
		
		
	}
	
}
