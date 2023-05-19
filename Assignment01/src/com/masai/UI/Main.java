package com.masai.UI;

import java.util.Scanner;

import com.masai.usecases.UIMain;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Lawyer Details");
			System.out.println("2. Add Department details");
			System.out.println("3. Search Employee who work Account Department");
			System.out.println("4. Delete Department");
			System.out.println("5. Search Department who live in Mumbai");
			System.out.print("Enter Selection ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				UIMain.addLawyerUI(sc);
				break;
			case 2:
//				addDepartmentUI(sc);
				break;
			case 3:
//				viewEmployeeDetails(sc);
				break;
			case 4:
//				deleteDepartmentUI(sc);
				break;
			case 0:
				System.out.println("Bye Bye");
				break;
			default:
				System.out.println("Invalid Selection please try again later");	
			}
			
		}while(choice !=0);
	
	}
}
