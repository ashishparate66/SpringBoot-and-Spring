package com.Problem1.dao;

import java.util.List;

import com.Problem1.dto.Employee;
import com.Problem1.exception.EmployeeException;


	public interface EmployeeDAO {
		
		public String registerEmployee(Employee employee);
		public Employee getEmployeeById(int empID)throws EmployeeException;
		public List<Employee> getAllEmployee() throws EmployeeException;
		public String deleteEmployeeById(int empID)throws EmployeeException;
		public String giveBonusToEmployee(int empID, int amount)throws EmployeeException;
		
	}
