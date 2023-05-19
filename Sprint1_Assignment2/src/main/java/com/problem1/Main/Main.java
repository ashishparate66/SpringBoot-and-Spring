package com.problem1.Main;

import java.util.Scanner;

import com.problem1.dao.ProductDAO;
import com.problem1.dao.ProductDAOImpl;
import com.problem1.dto.Product;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			ProductDAO methods = new ProductDAOImpl();
			
			int choice = 0;
			do {
				System.out.println("press 1 To find Product ");
				System.out.println("Press 0 To exit");
				choice =sc.nextInt();
				
				switch(choice) {
				case 1: 
					System.out.println("Enter Product Id ");
		    	    int productId=sc.nextInt();
		    	    Product pro = methods.findProductById(productId);
		        	System.out.println(pro);
					break;
				}
				
			}while(choice !=0);
			System.out.println("Thank You");
		}
}
