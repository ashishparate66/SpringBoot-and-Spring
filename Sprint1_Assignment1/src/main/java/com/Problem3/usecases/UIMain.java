package com.Problem3.usecases;

import java.util.Scanner;

import com.Problem3.dao.LawyerDAO;
import com.Problem3.dao.LawyerDAOImpl;
import com.Problem3.dto.Lawyer;
import com.Problem3.dto.LawyerImpl;

public class UIMain {

	public static void saveLawyerUI(Scanner sc) {
		System.out.print("Enter Lawyer id ");
		int id = sc.nextInt();
		
		System.out.print("Enter Lawyer Name ");
		String name = sc.next();
		
		System.out.print("Enter email ");
		String email = sc.next();
		
		System.out.print("Enter Address ");
		String address = sc.next();
		
		System.out.print("Enter experience ");
		int experience = sc.nextInt();
		
		//Create an object of DTO
		Lawyer lawyer = new LawyerImpl(id, name, email, address, experience);
		
		LawyerDAO lawDAO = new LawyerDAOImpl();
		
		lawDAO.saveLawyer(lawyer);	
		System.out.println("Lawyer Details added successfully");
	}
	
	public static void findLawyerUI(Scanner sc) {
		System.out.println("Enter Lawyer Id ");
	    int id=sc.nextInt();
		LawyerDAO lawDAO = new LawyerDAOImpl();
	    Lawyer law = lawDAO.findLawyerById(id);
    	if(law==null) {
    		System.out.println("No record Found");
    		System.out.println();
    	}else {
    		System.out.println(law);
    	}
	}
	public static void deleteLawyerUI(Scanner sc)  {
		System.out.println("Enter Lawyer Id ");
	    int id=sc.nextInt();
	    LawyerDAO lawDAO = new LawyerDAOImpl();
	    String law = lawDAO.deleteLawyerById(id);
	   
	    System.out.println(law);
	}
	
	public static void updateLawyerExperienceUI(Scanner sc) {
		    System.out.println("Enter Lawyer Id ");
		    int id=sc.nextInt();
		    System.out.println("Enter experience");
		    int experience=sc.nextInt();
		    LawyerDAO lawDAO = new LawyerDAOImpl();
		    String law = lawDAO.updateLawyerExperience(id, experience);
	    	System.out.println(law);
	}
}
