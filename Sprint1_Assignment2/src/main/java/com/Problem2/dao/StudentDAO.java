package com.Problem2.dao;

import com.Problem2.dto.Student;

public interface StudentDAO {
	
	Student findStudentById(int id);
	String saveStudent(Student student);
	String deleteStudentById(int id);
	String updateStudentLevel(int id, int level);
}
