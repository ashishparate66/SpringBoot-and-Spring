package com.Problem1.dao;

import com.Problem1.exception.EmployeeExpection;
import com.Problem1.model.Employee;

public interface EmployeeDAO {
	
	public String save(Employee emp) throws EmployeeExpection;
	public String getAddressOfEmployee(int empId)throws EmployeeExpection;
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);
}
