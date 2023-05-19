package com.Problem1.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Problem1.Utils.Emutils;
import com.Problem1.model.College;

public class getCollegeDetailsByStudentRoll {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll no");
		int roll = sc.nextInt();
		
		EntityManager em = Emutils.getConnection();
		
		Query q = em.createQuery("select s.college from Student s where s.studentRoll=?1 ");
		
		q.setParameter(1, roll);
		
		College college = (College) q.getSingleResult();
		System.out.println("College Name: "+college.getCollageName()+" "+" college Address: "+college.getCollageAddress());
		
	}
}
