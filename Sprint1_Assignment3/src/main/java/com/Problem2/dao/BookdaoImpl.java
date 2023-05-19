package com.Problem2.dao;

import javax.persistence.EntityManager;

import com.Problem2.model.Book;

public class BookdaoImpl implements Bookdao {

	@Override
	public Book findBookById(int id) {
		Book p = null;
		EntityManager em = com.Problem2.Util.EMutils.getConnection();
		p = em.find(Book.class, id);
		em.close();
		return p;
	}

	@Override
	public String saveBook(Book book) {
		String s =" somthing wrong";
		EntityManager em = com.Problem2.Util.EMutils.getConnection();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
		s = "added successfully";
		em.close();
	   return s;
	}

	@Override
	public String deleteBookById(int id) {
		String s =" somthing wrong";
		EntityManager em = com.Problem2.Util.EMutils.getConnection();
		Book b = em.find(Book.class, id);
		if(b != null) {
			em.getTransaction().begin();
			em.remove(b);
			em.getTransaction();
			s = "delete successfully";
			em.close();
		}
		return s;
	}

	@Override
	public String updateBookPrice(int id) {
		String s =" somthing wrong";
		EntityManager em = com.Problem2.Util.EMutils.getConnection();
		Book b = em.find(Book.class, id);
		if(b != null) {
			em.getTransaction().begin();
			b.setPrice(b.getPrice()*2);
			em.getTransaction().commit();
			s="update successfully";
			em.close();			
		}
		return s;
	}

	
}
