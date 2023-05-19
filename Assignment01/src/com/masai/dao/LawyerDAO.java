package com.masai.dao;

import com.masai.dto.Lawyer;
import com.masai.exception.SomethingWentWrongException;

public interface LawyerDAO {

	public void saveLawyer(Lawyer law) throws SomethingWentWrongException, ClassNotFoundException;
}
