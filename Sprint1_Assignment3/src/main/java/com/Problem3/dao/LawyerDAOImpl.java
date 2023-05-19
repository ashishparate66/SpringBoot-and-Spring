package com.Problem3.dao;

import javax.persistence.EntityManager;

import com.Problem3.model.Lawyer;
import com.Problem3.util.EMutils;

public class LawyerDAOImpl implements LawyerDAO{

	@Override
	public Lawyer findLawyerById(int id) {
		Lawyer s = null;
		EntityManager em = EMutils.getConnection();
		s = em.find(Lawyer.class, id);
		return s;
		
	}

	@Override
	public String saveLawyer(Lawyer lawyer) {
		String s = "Something went wrong";
		EntityManager em = EMutils.getConnection();
		em.getTransaction().begin();
		em.persist(lawyer);
		em.getTransaction().commit();
		s="add succefully";
		em.close();
		return s;
		
	}

	@Override
	public String deleteLawyerById(int id) {
		String s = "Something went wrong";
		EntityManager em = EMutils.getConnection();
		Lawyer l = em.find(Lawyer.class, id);
		em.getTransaction().begin();
		em.remove(l);
		em.getTransaction().commit();
		s = "delect succefully";
		em.close();
		return s;
	}

	@Override
	public String updateLawyerExperience(int id, int experience) {
		String s = "Something went wrong";
		EntityManager em = EMutils.getConnection();
		Lawyer l = em.find(Lawyer.class, id);
		em.getTransaction().begin();
		l.setExperience(experience);
		em.getTransaction().commit();
		s = "update succefully";
		em.close();
		return s;	
	}	
}
