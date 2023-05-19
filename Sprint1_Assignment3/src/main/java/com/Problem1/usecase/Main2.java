package com.Problem1.usecase;

import java.util.Scanner;

import com.Problem1.dao.EmployeeDAO;
import com.Problem1.dao.EmployeeDAOImpl;
import com.Problem1.exception.EmployeeExpection;
import com.Problem1.model.Employee;

public class Main2 {
	public static void main(String[] args) throws EmployeeExpection {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDAO methods = new EmployeeDAOImpl();
		
		
		int choice = 0;
		do {
			System.out.println();
			
			System.out.println("Press 1 To Registered employee ");
			System.out.println("press 2 To find employee ");
      	    System.out.println("Press 3 To delete Employee ");
	        System.out.println("Press 4 To update Student ");
			System.out.println("Press 0 To exit");
			choice =sc.nextInt();
			
			switch(choice) {

			case 1:
				   
		    	    System.out.println("Enter Employee Name");
		    	    String name =sc.next();
		    	    System.out.println("Enter address name");
		    	    String  address =sc.next();
		    	    System.out.println("Enter salary");
		    	    int salary =sc.nextInt();
		    	    
		    	    Employee s = new Employee();
		    	   
		    	    s.setName(name);
		    	    s.setAddress(address);
		    	    s.setSalary(salary);;
		    	    String st1 = methods.save(s);
		        	System.out.println(st1);
		    	    break;
		    	    
			case 2: 
					System.out.println("Enter Employee Id ");
		    	    int empId=sc.nextInt();
		    	    String e = methods.getAddressOfEmployee(empId);
		        	System.out.println(empId+" "+e);
					break;
		    	    
			case 3:
				 	System.out.println("Enter Employee Id ");
				 	empId=sc.nextInt();
		    	    Boolean d = methods.deleteEmployee(empId);
		    	    if(d==true) {
		    	    	 System.out.println("Delete successfully");
		    	    }else {
		    	    	 System.out.println("somenthing wrong");
		    	    }
		    	   
		    	    break;
			case 4:
					System.out.println("Enter Employee Id ");
					empId=sc.nextInt();
					System.out.println("Enter bonus ");
					int bonus = sc.nextInt();
		    	    st1 = methods.giveBonusToEmployee(empId,bonus);
		    	    	System.out.println(st1);
		    	    break;
			}
			
		}while(choice !=0);
		System.out.println("Thank You");
	}
}
