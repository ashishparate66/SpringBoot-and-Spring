package com.Problem3.usecase;

import java.util.Scanner;

import com.Problem3.dao.LawyerDAO;
import com.Problem3.dao.LawyerDAOImpl;
import com.Problem3.model.Lawyer;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LawyerDAO methods = new LawyerDAOImpl();
		int choice = 0;
		do {

			System.out.println("Press 1 find lawyer ");
	        System.out.println("Press 2 To Add Lawyer ");
	    	System.out.println("Press 3 To delete lawyer ");
	        System.out.println("Press 4 To update lawyer experience");
	        System.out.println("Press 0 To exit");
	 	    choice=sc.nextInt();
	 	    
	 	    switch(choice){
	 	    	case 1:
	 	    		System.out.println("Enter Lawyer Id");
	 	    		int id=sc.nextInt();
	 	    		Lawyer l = methods.findLawyerById(id);
	 	    		if(l==null) {
	 	    		System.out.println("record not found");	
	 	    		}else {
	 	    			System.out.println(l);
	 	    		}
	 	    		break;
	 	    	case 2:
	 	    		System.out.println("Enter Lawyer Id");
	 	    		id = sc.nextInt();
	 	    		System.out.println("Enter Lawyer Name");
	 	    		String name = sc.next();
	 	    		System.out.println("Enter Lawyer email");
	 	    		String email = sc.next();
	 	    		System.out.println("Enter Lawyer address");
	 	    		String address = sc.next();
	 	    		System.out.println("Enter Lawyer experience");
	 	    		int experience = sc.nextInt();
	 	    		Lawyer p = new Lawyer();
	 	    		p.setId(id);
	 	    		p.setName(name);
	 	    		p.setEmail(email);
	 	    		p.setAddress(address);
	 	    		p.setExperience(experience);
	 	    		String s = methods.saveLawyer(p);
	 	    		System.out.println(s);
	 	    		break;
	 	    	case 3:
	 	    		System.out.println("Enter Lawyer Id");
	 	    	    id=sc.nextInt();
	 	    	    String d = methods.deleteLawyerById(id);
	 	    		System.out.println(d);
	 	    		break;
	 	    	case 4:
	 	    		System.out.println("Enter Lawyer Id");
	 	    		id=sc.nextInt();
	 	    		System.out.println("Enter Lawyer experience");
	 	    		experience=sc.nextInt();
	 	    		d = methods.updateLawyerExperience(id,experience);
	 	    		System.out.println(d);
	 	    		break;
	 	    		
	 	    }
		}while(choice != 0);
		System.out.println("HAVE a GOOD DAY");
	} 		
}
