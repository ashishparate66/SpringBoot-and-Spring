package com.Problem1.usecases;

import com.Problem1.Dao.CollegeDao;
import com.Problem1.Dao.CollegeDaoImple;
import com.Problem1.excpection.StudentNotFoundException;
import com.Problem1.model.Student;

public class getStudentById1 {

	public static void main(String[] args) throws StudentNotFoundException {
		
		CollegeDao collegeDao = new CollegeDaoImple();
		Student student1 = collegeDao.getStudent(1);
		System.out.println(student1.getStudentName()+" "+student1.getCourse()+" "+student1.getLocation());
		
		
	}
}
