package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.dto.Lawyer;
import com.masai.exception.SomethingWentWrongException;

public class LawyerDAOImpl implements LawyerDAO {
	
	public void saveLawyer(Lawyer law) throws SomethingWentWrongException, ClassNotFoundException{
		
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO lawyer (id, name, email, address, experience) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,law.getId());
			ps.setString(2, law.getName());
			ps.setString(3, law.getEmail());
			ps.setString(4, law.getAddress());
			ps.setInt(5, law.getExperience());
			
			ps.executeUpdate();
			
		}catch(SQLException ex) {
//			System.out.println(ex.getMessage());
		throw new SomethingWentWrongException("Unable to insert the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
	}
}
