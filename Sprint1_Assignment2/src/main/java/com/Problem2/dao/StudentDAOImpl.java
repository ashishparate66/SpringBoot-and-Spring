package com.Problem2.dao;

import javax.persistence.EntityManager;

import com.Problem2.dto.Student;
import com.Problem2.dto.StudentImpl;
import com.problem1.connection.EMutils;

public class StudentDAOImpl implements StudentDAO {
	
	public Student findStudentById(int studentCode) {
		Student s = null;
		EntityManager em = EMutils.getConnection();
		s = em.find(StudentImpl.class, studentCode);
		em.close();
		return s;
		
	}
	
	public String saveStudent(Student student) {
		String s = "Something is wrong";
		EntityManager em = EMutils.getConnection();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		s = "Saved Successfully";
		em.close();
		return s;
		
	}
	
	public String deleteStudentById(int id) {
		String s = "Something is wrong";
		EntityManager em = EMutils.getConnection();
		Student p = em.find(StudentImpl.class, id);
		if(p!=null) {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			s = "Deleted Successfully";
			em.close();
		}
		return s;
		
	}
	
	public String updateStudentLevel(int id, int level) {
		String s = "Something is wrong";
		EntityManager em = EMutils.getConnection();
		Student p = em.find(StudentImpl.class, id);
		if(p!=null) {
			em.getTransaction().begin();
			p.setLevel(p.getLevel()+level);
			em.getTransaction().commit();
			s = "Updated Successfully";
			em.close();
		}
		return s;
		
	}

}
