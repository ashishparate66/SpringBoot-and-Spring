package com.Problem1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutils {

	private static final EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("persistenceUnit");
	}
	public static EntityManager getConnection() {
		
		return emf.createEntityManager();
	}
}
