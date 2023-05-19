package com.Problem2.usecases;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.Problem1.exception.EmployeeException;
import com.Problem2.dao.StudentDAO;
import com.Problem2.dao.StudentDAOImpl;
import com.Problem2.dto.Student;
import com.Problem2.dto.StudentImpl;
import com.Problem2.exception.StudentException;

public class UImain {

	public static void registerStudentUI(Scanner sc) {
		System.out.print("Enter Student Roll NO ");
		int roll = sc.nextInt();
		
		System.out.print("Enter Student Name ");
		String studentName = sc.next();
		
		System.out.print("Enter address ");
		String address = sc.next();
		
		System.out.print("Enter Marks ");
		int marks = sc.nextInt();
		
		//Create an object of DTO
		Student st = new StudentImpl(roll, studentName, address, marks);
		
		StudentDAO stDAO = new StudentDAOImpl();
		
		stDAO.saveStudentDetails(st);	
		System.out.println("Student Details added successfully");
	}
	
	public static void getStudentByRollNoUI(Scanner sc) throws EmployeeException, StudentException {
		System.out.println("Enter Student Roll No ");
	    int roll=sc.nextInt();
	    StudentDAO stDAO = new StudentDAOImpl();
	    Student st = stDAO.getStudentByRollNo(roll);
    	if(st==null) {
    		System.out.println("No record Found");
    		System.out.println();
    	}else {
    		System.out.println(st);
    	}
	}
	public static void deleteStudentByRollNoUI(Scanner sc) throws StudentException  {
		System.out.println("Enter Student Roll No ");
	    int rollNo=sc.nextInt();
	    StudentDAO stDAO = new StudentDAOImpl();
	    boolean st = stDAO.deleteStudentByRollNo(rollNo);
	  
	    if(st==true) {
	    	System.out.println("Delete Succefully");	
	    }else {
	    	System.out.println("record not found");
	    }
	}

	public static void getAllStudentUI() {
		//take an object of DAO
		StudentDAO stDAO = new StudentDAOImpl();
		List<Student> stList = stDAO.getAllStudent();
		Consumer<Student> con = new Consumer<Student>() {
			@Override
			public void accept(Student e) {
				System.out.println("Roll NO"+ e.getRoll() + " Student Name " + e.getStudentName() 
				+ " address " + e.getAddress() + " marks " + e.getMarks());
			}
		};
		stList.forEach(con);
	}
	
	public static void getStudentByNameUI(Scanner sc) throws StudentException {
		
		System.out.println("Enter Student Name ");
	    String studentName=sc.next();
	    StudentDAO stDAO = new StudentDAOImpl();
	    Student st = stDAO.getStudentsByName(studentName);
	    if(st==null) {
    		System.out.println("No record Found");
    		System.out.println();
    	}else {
    		System.out.println(st);
    	}
	}
	
	public static void graceStudentMarksUI(Scanner sc) throws StudentException {
		    System.out.println("Enter Student roll No ");
		    int rollNo=sc.nextInt();
		    System.out.println("Enter marks");
		    int marks= sc.nextInt();
		    StudentDAO empDAO = new StudentDAOImpl();
		    String st = empDAO.graceStudentMarks(rollNo, marks);
	    	System.out.println(st);
	}
	
}
