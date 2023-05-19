package com.Problem1.usecases;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.Problem1.dao.EmployeeDAO;
import com.Problem1.dao.EmployeeDAOImpl;
import com.Problem1.dto.Employee;
import com.Problem1.dto.EmployeeImpl;
import com.Problem1.exception.EmployeeException;

public class UiMain {

	public static void registerEmployeUI(Scanner sc) {
		System.out.print("Enter Employee id ");
		int empId = sc.nextInt();
		
		System.out.print("Enter Employee Name ");
		String name = sc.next();
		
		System.out.print("Enter address ");
		String address = sc.next();
		
		System.out.print("Enter salary ");
		int salary = sc.nextInt();
		
		//Create an object of DTO
		Employee emp = new EmployeeImpl(empId, name, address, salary);
		
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		
		empDAO.registerEmployee(emp);	
		System.out.println("Employee Details added successfully");
	}
	
	public static void getEmployeeByIdUI(Scanner sc) throws EmployeeException {
		System.out.println("Enter Employee Id ");
	    int empId=sc.nextInt();
		EmployeeDAO empDAO = new EmployeeDAOImpl();
	    Employee emp = empDAO.getEmployeeById(empId);
    	if(emp==null) {
    		System.out.println("No record Found");
    		System.out.println();
    	}else {
    		System.out.println(emp);
    	}
	}
	public static void deleteEmployeeByIdUI(Scanner sc) throws EmployeeException  {
		System.out.println("Enter Employee Id ");
	    int empID=sc.nextInt();
	    EmployeeDAO empDAO = new EmployeeDAOImpl();
	    String emp = empDAO.deleteEmployeeById(empID);
	   
	    System.out.println(emp);
	}
	
	public static void giveBonusToEmployeeUI(Scanner sc) throws EmployeeException {
		    System.out.println("Enter Employee Id ");
		    int empID=sc.nextInt();
		    System.out.println("Enter amount");
		    int salary= sc.nextInt();
		    EmployeeDAO empDAO = new EmployeeDAOImpl();
		    String emp = empDAO.giveBonusToEmployee(empID, salary);
	    	System.out.println(emp);
	}
	
	public static void getAllEmployeeUI() {
		//take an object of DAO
		EmployeeDAO empDAO = new EmployeeDAOImpl();
		try {
			List<Employee> empList = empDAO.getAllEmployee();
			Consumer<Employee> con = new Consumer<Employee>() {
				@Override
				public void accept(Employee e) {
					System.out.println("empID " + e.getEmpID() + " name " + e.getName() 
					+ " address " + e.getAddress() + " salary " + e.getSalary());
				}
			};
			empList.forEach(con);
		}catch(EmployeeException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
