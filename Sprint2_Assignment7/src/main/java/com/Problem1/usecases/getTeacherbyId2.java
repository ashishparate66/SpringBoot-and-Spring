package com.Problem1.usecases;

import com.Problem1.Dao.CollegeDao;
import com.Problem1.Dao.CollegeDaoImple;
import com.Problem1.excpection.TeacherNotFoundException;
import com.Problem1.model.Teacher;

public class getTeacherbyId2 {

	public static void main(String[] args) throws TeacherNotFoundException {
		CollegeDao collegeDao = new CollegeDaoImple();
		Teacher teacher1 = collegeDao.getTeacher(1);
		System.out.println(teacher1);
	}
}
