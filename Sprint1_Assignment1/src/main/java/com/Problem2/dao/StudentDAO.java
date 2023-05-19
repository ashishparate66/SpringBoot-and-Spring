package com.Problem2.dao;

import java.util.List;

import com.Problem2.dto.Student;
import com.Problem2.exception.StudentException;


public interface StudentDAO {

	public Student getStudentByRollNo(int rollNo)throws StudentException;
	
	public List<Student> getAllStudent();

	public String saveStudentDetails(Student student);

	public boolean deleteStudentByRollNo(int rollNo)throws StudentException;

	public String graceStudentMarks(int rollNo, int marks)throws StudentException;

	public Student getStudentsByName(String name)throws StudentException;

	

	
}
