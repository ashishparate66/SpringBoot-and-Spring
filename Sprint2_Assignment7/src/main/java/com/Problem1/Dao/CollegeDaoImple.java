package com.Problem1.Dao;

import javax.persistence.EntityManager;

import com.Problem1.Utils.Emutils;
import com.Problem1.excpection.StudentException;
import com.Problem1.excpection.StudentNotFoundException;
import com.Problem1.excpection.TeacherNotFoundException;
import com.Problem1.model.Student;
import com.Problem1.model.Teacher;

public class CollegeDaoImple implements CollegeDao {

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		EntityManager em=Emutils.getConnection();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Student getStudent(int studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		EntityManager em=Emutils.getConnection();
		Student student=em.find(Student.class, studentId);
		if(student==null) {
			throw new StudentNotFoundException("Student not present in this id please pass correct studentId");
		}
		return student;
	}

	@Override
	public void registerTeacher(Teacher teacher, int studentId) throws StudentException {
		// TODO Auto-generated method stub
		EntityManager em=Emutils.getConnection();
		Student student=em.find(Student.class, studentId);
		if(student==null) {
			throw new StudentException("Student not present in this id");
		}
		student.getTeacherList().add(teacher);
		teacher.getStudentList().add(student);
		
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Teacher getTeacher(int teacherId) throws TeacherNotFoundException {
		EntityManager em=Emutils.getConnection();
		Teacher teacher=em.find(Teacher.class, teacherId);
		if(teacher==null) {
			throw new TeacherNotFoundException("Teacher  not present in this id please pass correct teacherId");
		}
		return teacher;
	}

	@Override
	public void registerTeacherWithDiffStudents(int teacherId, int studentId)
			throws TeacherNotFoundException, StudentNotFoundException {
		// TODO Auto-generated method stub
		
		EntityManager em=Emutils.getConnection();
		Student student=em.find(Student.class, studentId);
		Teacher teacher=em.find(Teacher.class, teacherId);
		if(student==null) {
			throw new StudentNotFoundException("Student not present in this id");
		}
		if(teacher==null) {
			throw new TeacherNotFoundException("Teacher Not Present in this id");
		}
		student.getTeacherList().add(teacher);
		teacher.getStudentList().add(student);
		
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		em.close();
		
	}

}
