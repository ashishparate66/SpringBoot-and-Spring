package com.Problem3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Problem3.dto.Lawyer;
import com.Problem3.dto.LawyerImpl;

public class LawyerDAOImpl implements LawyerDAO {
	
	public void saveLawyer(Lawyer law){
		
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
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
	}
	
	public Lawyer findLawyerById(int id) {
		Lawyer law = null;
        try (Connection conn = DBUtils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("select * from lawyer where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery() ;
            if(rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                int experience = rs.getInt("experience");
                law = new LawyerImpl(id,name,email,address,experience);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return law;
	}
	
	public String deleteLawyerById(int id) {
		String res = "Something is wrong";
        try (Connection conn = DBUtils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM lawyer WHERE id = ?");
            ps.setInt(1,id);
            if(ps.executeUpdate()>0) {
                res = "Deleted Successfully";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
	}
	public String updateLawyerExperience(int id, int experience) {
		 String res = "";
	        try (Connection conn = DBUtils.getConnectionTodatabase()) {
	            PreparedStatement ps = conn.prepareStatement("UPDATE lawyer " +
	                    "SET experience = ? " +
	                    "WHERE  id = ?");
	            ps.setInt(1,experience);
	            ps.setInt(2,id);
	            if(ps.executeUpdate()>0) {
	                res = "Updated successfully";
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return res;
	}
	
}
