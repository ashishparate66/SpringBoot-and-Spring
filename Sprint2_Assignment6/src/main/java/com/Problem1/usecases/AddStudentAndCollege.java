package com.Problem1.usecases;

import javax.persistence.EntityManager;

import com.Problem1.Utils.Emutils;
import com.Problem1.model.College;
import com.Problem1.model.Student;

public class AddStudentAndCollege {
	
	public static void main(String[] args) {	
		EntityManager em = Emutils.getConnection();
		
		College college1 = new College();
		college1.setCollageName("Shivaji");
		college1.setCollageAddress("Mumbai");
		
		College college2 = new College();
		college2.setCollageName("Maharana");
		college2.setCollageAddress("Nagpur");
		
		Student student1 = new Student();
		student1.setStudentName("Ashish");
		student1.setMobileNumber("987456123");
		student1.setEmail("ap@gmail.com");
		student1.setCollege(college1);
			
		Student student2 = new Student();
		student2.setStudentName("Pratik");
		student2.setMobileNumber("887456123");
		student2.setEmail("pn@gmail.com");
		student2.setCollege(college1);
		
		Student student3 = new Student();
		student3.setStudentName("Dipesh");
		student3.setMobileNumber("687456123");
		student3.setEmail("dn@gmail.com");
		student3.setCollege(college1);
		
		Student student4 = new Student();
		student4.setStudentName("Dilip");
		student4.setMobileNumber("587456123");
		student4.setEmail("db@gmail.com");
		student4.setCollege(college1);
		
		Student student5 = new Student();
		student5.setStudentName("sahil");
		student5.setMobileNumber("487456123");
		student5.setEmail("ss@gmail.com");
		student5.setCollege(college2);
		
		Student student6 = new Student();
		student6.setStudentName("ritesh");
		student6.setMobileNumber("387456123");
		student6.setEmail("rr@gmail.com");
		student6.setCollege(college2);
		
		Student student7 = new Student();
		student7.setStudentName("yash");
		student7.setMobileNumber("287456123");
		student7.setEmail("yy@gmail.com");
		student7.setCollege(college2);
		
		Student student8 = new Student();
		student8.setStudentName("sanket");
		student8.setMobileNumber("187456123");
		student8.setEmail("s@gmail.com");
		student8.setCollege(college2);
		
		college1.getStudentList().add(student1);
		college1.getStudentList().add(student2);
		college1.getStudentList().add(student3);
		college1.getStudentList().add(student4);
		college2.getStudentList().add(student5);
		college2.getStudentList().add(student6);
		college2.getStudentList().add(student7);
		college2.getStudentList().add(student8);
		
		em.getTransaction().begin();
		em.persist(college1);
		em.persist(college2);
		em.getTransaction().commit();
		System.out.println("done");
		em.close();	
	}
}
