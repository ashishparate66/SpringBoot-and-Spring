package com.Problem3.dao;

import com.Problem3.dto.Lawyer;

public interface LawyerDAO {

	public void saveLawyer(Lawyer law) ;
	
	public Lawyer findLawyerById(int id);
	public String deleteLawyerById(int id);
	public String updateLawyerExperience(int id, int experience); 
}
