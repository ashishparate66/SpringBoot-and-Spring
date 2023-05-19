package com.Problem1.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Emutils {

	private static final EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("persistenceUnit");
	}
	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}
}
