package com.Problem1.UI;

import java.util.Scanner;

import com.Problem1.exception.EmployeeException;
import com.Problem1.usecases.UiMain;

public class MainJDBC {
	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println();
			System.out.println("1. Register Employee Details");
			System.out.println("2. Search Employee by Id");
			System.out.println("3. Get All Employee ");
			System.out.println("4. Delete Employee ");
			System.out.println("5. Give Bonus to Employee ");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("***** Enter Selection *****");
			System.out.println();
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
			  UiMain.registerEmployeUI(sc);
				break;
			case 2:
				UiMain.getEmployeeByIdUI(sc);
				break;
			case 3:
				UiMain.getAllEmployeeUI();
				break;
			case 4:
				UiMain.deleteEmployeeByIdUI(sc);
				break;
			case 5:
				UiMain.giveBonusToEmployeeUI(sc);
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
