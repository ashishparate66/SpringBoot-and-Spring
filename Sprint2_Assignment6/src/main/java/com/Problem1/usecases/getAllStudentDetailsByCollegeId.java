package com.Problem1.usecases;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Problem1.Utils.Emutils;
import com.Problem1.model.Student;

public class getAllStudentDetailsByCollegeId {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter College Id");
		int cId = sc.nextInt();
		
		EntityManager em = Emutils.getConnection();
		
		Query q = em.createQuery("select s from Student s where s.college.collageId = ?1");
		 
		
		q.setParameter(1, cId);
		
		List<Student> studentList = q.getResultList();
		studentList.forEach(st -> System.out.println(st.toString()));
			
		em.close();
		
		
	}
	
}
