package com.Problem2.UI;

import java.util.Scanner;

import com.Problem1.exception.EmployeeException;
import com.Problem2.exception.StudentException;
import com.Problem2.usecases.UImain;

public class Demo {
	public static void main(String[] args) throws EmployeeException, StudentException {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println();
			System.out.println("1. Register Student Details");
			System.out.println("2. Search Student by Roll NO");
			System.out.println("3. Get All Student");
			System.out.println("4. Delete Student details ");
			System.out.println("5. Grace Student Marks ");
			System.out.println("6. Search STudent by Name ");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("***** Enter Selection *****");
			System.out.println();
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
			  UImain.registerStudentUI(sc);
				break;
			case 2:
				UImain.getStudentByRollNoUI(sc);
				break;
			case 3:
				UImain.getAllStudentUI();
				break;
			case 4:
				UImain.deleteStudentByRollNoUI(sc);
				break;
			case 5:
				UImain.graceStudentMarksUI(sc);
				break;
			case 6:
				UImain.getStudentByNameUI(sc);
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
