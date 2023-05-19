package com.Problem3.dao;

import com.Problem3.model.Lawyer;

public interface LawyerDAO {
		
	Lawyer findLawyerById(int id);
	String saveLawyer(Lawyer lawyer);
	String deleteLawyerById(int id);
	String updateLawyerExperience(int id, int experience);
}
