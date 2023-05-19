package com.Problem2.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutils {

	public static final EntityManagerFactory emf;
	static {
		emf = Persistence.createEntityManagerFactory("persistenceUnit");
	}
	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}
}
