package com.Problem2.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutils {
	 private static EntityManagerFactory emf;
	   
	   static {
		 emf = Persistence.createEntityManagerFactory("PersistenceUnit");  
	   }
	   
	   public static EntityManager getConnection() {
		   return emf.createEntityManager();
	   }
	
}
