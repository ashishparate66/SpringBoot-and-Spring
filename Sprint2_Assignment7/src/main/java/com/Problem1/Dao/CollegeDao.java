package com.Problem1.Dao;

import com.Problem1.excpection.StudentException;
import com.Problem1.excpection.StudentNotFoundException;
import com.Problem1.excpection.TeacherNotFoundException;
import com.Problem1.model.Student;
import com.Problem1.model.Teacher;

public interface CollegeDao {
	public void addStudent(Student student);
	public Student getStudent(int studentId) throws StudentNotFoundException;
	public void registerTeacher(Teacher teacher,int studentId) throws StudentException;
	public Teacher getTeacher(int teacherId) throws TeacherNotFoundException;
	public void registerTeacherWithDiffStudents(int teacherId,int studentId) throws TeacherNotFoundException, StudentNotFoundException;

}
