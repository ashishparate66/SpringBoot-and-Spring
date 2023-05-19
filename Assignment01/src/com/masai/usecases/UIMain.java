package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.LawyerDAO;
import com.masai.dao.LawyerDAOImpl;
import com.masai.dto.Lawyer;
import com.masai.dto.LawyerImpl;
import com.masai.exception.SomethingWentWrongException;

public class UIMain {

	public static void addLawyerUI(Scanner sc) throws ClassNotFoundException {
		//take input employee details
		
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
		
		try {
			lawDAO.saveLawyer(lawyer);	
			System.out.println("Lawyer Details added successfully");
		}catch(SomethingWentWrongException ex) {
			System.out.println(ex);
		}
		
	}
}
