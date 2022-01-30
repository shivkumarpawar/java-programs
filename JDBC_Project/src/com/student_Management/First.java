package com.student_Management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student_Management.Student;
import com.student_Management.StudentData;


public class First {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome to Student Management Application");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit  App");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				System.out.println("Enter User Name:");
				String name =br.readLine();
				
				System.out.println("Enter User Phone");
				String phone =br.readLine();
				
				System.out.println("Enter User City");
				String city=br.readLine();
				
				//student obj to store student
				
				Student st=new Student(name,phone, city);
				boolean answer =StudentData.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student Added Successfully...");
				}
				else
				{
					System.out.println("Something went Wrong...Try Again");
				}
				
				System.out.println(st);
				
			}else if(c==2)
			{
				System.out.println("Enter Student Id to delete:");
				int userId = Integer.parseInt(br.readLine());
				boolean f=StudentData.deleteStudent(userId);
				if(f)
				{
					System.out.println("Student is Deleted...");
				}
				else
				{
					System.out.println("Something went Wrong...");
				}
				
			}else if(c==3)
			{
				StudentData.showAllStudents();
			}else if(c==4)
			{
				//exit
				break;
			}else
			{
				
			}
			
		}

	}

}
