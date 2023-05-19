package com.Problem1.usecases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.Problem1.Dao.CollegeDao;
import com.Problem1.Dao.CollegeDaoImple;
import com.Problem1.Utils.Emutils;
import com.Problem1.excpection.StudentNotFoundException;
import com.Problem1.model.Student;
import com.Problem1.model.Teacher;

public class AddStudent {

	public static void main(String[] args) {
		EntityManager em = Emutils.getConnection();
//		
//		CollegeDao collegeDao = new CollegeDaoImple();
//		try {
//			Student std=collegeDao.getStudent(3);
//			System.out.println(std);
//			std.getTeacherList().forEach(System.out::println);
//		} catch (StudentNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
		Teacher teacher1 = new Teacher();
		teacher1.setSubject("Java");
		teacher1.setTeacherName("Varun");
		
		
		Teacher teacher2 = new Teacher();
		teacher2.setSubject("HTML");
		teacher2.setTeacherName("Harshal");
		
		Student student1 = new Student();
		student1.setStudentName("Ashish");
		student1.setCourse("Java");
		student1.setLocation("Nagpur");
		
		
		Student student2 = new Student();
		student2.setStudentName("dipesh");
		student2.setCourse("Java");
		student2.setLocation("Mumbai");
		
		
		Student student3 = new Student();
		student3.setStudentName("pratik");
		student3.setCourse("HTML");
		student3.setLocation("Goa");
		
		
		List<Teacher> teacherList1 = new ArrayList<>();
		List<Teacher> teacherList2 = new ArrayList<>();
		
		List<Student> studentList1 = new ArrayList<>();
		List<Student> studentList2 = new ArrayList<>();
		
		teacherList1.add(teacher1);
		teacherList1.add(teacher2);
		teacherList2.add(teacher2);
		student1.setTeacherList(teacherList1);
		student2.setTeacherList(teacherList1);
		student3.setTeacherList(teacherList2);
		
		
		studentList1.add(student1);
		studentList1.add(student2);
		studentList2.add(student1);
		studentList2.add(student2);
		studentList2.add(student3);
		teacher1.setStudentList(studentList1);
		teacher2.setStudentList(studentList2);
		
		
		em.getTransaction().begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		em.persist(teacher1);
		em.persist(teacher2);
		em.getTransaction().commit();
		System.out.println("Done.");
		em.close();
	}
}
