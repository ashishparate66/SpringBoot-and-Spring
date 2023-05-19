package com.Problem2.Main;

import java.util.Scanner;

import com.Problem2.dao.StudentDAO;
import com.Problem2.dao.StudentDAOImpl;
import com.Problem2.dto.Student;
import com.Problem2.dto.StudentImpl;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentDAO methods = new StudentDAOImpl();
		
		int choice = 0;
		do {
			System.out.println();
			System.out.println("press 1 To find student ");
			System.out.println("Press 2 To Registered student ");
      	    System.out.println("Press 3 To delete Student ");
	        System.out.println("Press 4 To update Student ");
			System.out.println("Press 0 To exit");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Student Id ");
	    	    int studentCode=sc.nextInt();
	    	    Student st = methods.findStudentById(studentCode);
	        	System.out.println(st);
				break;
			case 2:
				    System.out.println("Enter student Id ");
		    	    studentCode =sc.nextInt();
		    	    System.out.println("Enter email Name");
		    	    String email =sc.next();
		    	    System.out.println("Enter address name");
		    	    String  address =sc.next();
		    	    System.out.println("Enter course");
		    	    String  course =sc.next();
		    	    System.out.println("Enter level");
		    	    int level =sc.nextInt();
		    	    Student s = new StudentImpl();
		    	    s.setStudentCode(studentCode);
		    	    s.setEmail(email);
		    	    s.setAddress(address);
		    	    s.setCourse(course);
		    	    s.setLevel(level);
		    	    String st1 = methods.saveStudent(s);
		        	System.out.println(st1);
		    	    break;
		    	    
			case 3:
				 	System.out.println("Enter student code ");
				 	studentCode=sc.nextInt();
		    	    st1 = methods.deleteStudentById(studentCode);
		    	    System.out.println(st1);
		    	    break;
			case 4:
					System.out.println("Enter Student code ");
					studentCode=sc.nextInt();
					System.out.println("Enter level ");
					level = sc.nextInt();
		    	    st1 = methods.updateStudentLevel(studentCode,level);
		    	    	System.out.println(st1);
		    	    break;
			}
			
		}while(choice !=0);
		System.out.println("Thank You");
	}
}
