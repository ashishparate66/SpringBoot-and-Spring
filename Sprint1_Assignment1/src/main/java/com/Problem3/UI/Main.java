package com.Problem3.UI;

import java.util.Scanner;

import com.Problem3.usecases.UIMain;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("0. Exit");
			System.out.println("1. Add Lawyer Details");
			System.out.println("2. Search Lawyer by Id");
			System.out.println("3. delete Lawyer by id");
			System.out.println("4. update lawyer experience");
			System.out.print("Enter Selection ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				UIMain.saveLawyerUI(sc);
				break;
			case 2:
				UIMain.findLawyerUI(sc);;
				break;
			case 3:
				UIMain.deleteLawyerUI(sc);
				break;
			case 4:
				UIMain.updateLawyerExperienceUI(sc);
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
