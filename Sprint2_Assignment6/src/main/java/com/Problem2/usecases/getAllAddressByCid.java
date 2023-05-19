package com.Problem2.usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.Problem2.Utils.Emutils;
import com.Problem2.model.Customer;

public class getAllAddressByCid {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Id");
		int cid = sc.nextInt();
		
		EntityManager em =Emutils.getConnection();
		
		Query q = em.createQuery("select c from Customer c where c.cid = ?1 ");
		q.setParameter(1, cid);
		
		Customer list = (Customer) q.getSingleResult();
		
		System.out.println(list);
		em.close();
		
	}

}
