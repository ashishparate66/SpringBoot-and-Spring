package com.Problem2.usecases;

import javax.persistence.EntityManager;

import com.Problem1.Utils.Emutils;
import com.Problem2.model.Address;
import com.Problem2.model.Customer;

public class AddCustomerAndAddress {
	public static void main(String[] args) {
		
		EntityManager em = com.Problem2.Utils.Emutils.getConnection();
		
		Customer customer1 = new Customer();
		customer1.setName("Ashish");
		customer1.setMobileNumber("745612300");
		customer1.setEmail("ap@gmail.com");
		
		Customer customer2 = new Customer();
		customer2.setName("Pratik");
		customer2.setMobileNumber("7945612300");
		customer2.setEmail("pn@gmail.com");
		
		customer1.getAddresses().add(new Address("MH","Nagpur","789456","Home"));
		customer1.getAddresses().add(new Address("MH","Mumbai","456456","Office"));
		
		customer2.getAddresses().add(new Address("UP","Noida","123456","Home"));
		customer2.getAddresses().add(new Address("UP","ayodhya","354456","Office"));
		
		em.getTransaction().begin();
		em.persist(customer1);
		em.persist(customer2);
		em.getTransaction().commit();
		System.out.println("Done.");
		
		em.close();
		
	}

}
