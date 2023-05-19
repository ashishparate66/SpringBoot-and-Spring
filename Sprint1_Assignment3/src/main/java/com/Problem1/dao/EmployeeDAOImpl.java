package com.Problem1.dao;

import javax.persistence.EntityManager;

import com.Problem1.exception.EmployeeExpection;
import com.Problem1.model.Employee;
import com.Problem1.util.EMutils;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public String save(Employee emp) throws EmployeeExpection {
		
		String s = "Something is wrong";
		EntityManager em = EMutils.getConnection();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		s = "Saved Successfully";
		em.close();
		return s;		
	}
	
	@Override
	public String getAddressOfEmployee(int empId) throws EmployeeExpection {		
		EntityManager em = EMutils.getConnection();
		Employee emp = em.find(Employee.class, empId);
		if(emp==null) throw new EmployeeExpection("record not found");		
		String s = emp.getAddress();
		em.close();
		return s;		
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String s = "Something is wrong";
		EntityManager em = EMutils.getConnection();
		Employee e = em.find(Employee.class, empId);
		if(e != null) {
			em.getTransaction().begin();
			e.setSalary(e.getSalary()+bonus);
			em.getTransaction().commit();
			s="Bonus added successfully";
			em.close();
		}
		return s;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean s = false;
		EntityManager em = EMutils.getConnection();
		Employee e = em.find(Employee.class, empId);
		if(e != null) {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			s=true;
			em.close();
		}
		return s;
	}
	
	
}
