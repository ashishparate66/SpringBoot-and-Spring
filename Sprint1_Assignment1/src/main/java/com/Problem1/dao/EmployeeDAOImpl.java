package com.Problem1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Problem1.connection.DButils;
import com.Problem1.dto.Employee;
import com.Problem1.dto.EmployeeImpl;
import com.Problem1.exception.EmployeeException;
import com.Problem3.dao.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {

	public String registerEmployee(Employee employee) {
		String res = "Failed to save";
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("insert into employee (empID,name,address,salary) values (?, ?, ?, ?)" );
            ps.setInt(1, employee.getEmpID());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getAddress());
            ps.setInt(4, employee.getSalary());
            if(ps.executeUpdate()>0) {
                res = "Employee Registered Successfully";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
		
	}
	public Employee getEmployeeById(int empID)throws EmployeeException{
		Employee emp = null;
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("select * from employee where empID = ?");
            ps.setInt(1, empID);
            ResultSet rs = ps.executeQuery() ;
            if(rs.next()) { 	
                String name = rs.getString("name");
                String address = rs.getString("address");
                int salary = rs.getInt("salary");
                emp = new EmployeeImpl(empID,name,address,salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
		
	}
	public List<Employee> getAllEmployee() throws EmployeeException{
		Connection conn = null;
		List<Employee> list = new ArrayList<>();
		try {
			conn = DButils.getConnectionTodatabase();
			String query = "SELECT * FROM employee";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new EmployeeImpl(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4) ));
			}
			
		}catch(SQLException ex) {
			throw new EmployeeException("Unable to update the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
		return list;
		
	}
	public String deleteEmployeeById(int empID)throws EmployeeException{
		String res = "Something is wrong";
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM employee WHERE empID = ?");
            ps.setInt(1,empID);
            if(ps.executeUpdate()>0) {
                res = "Deleted Successfully";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
		
	}
	public String giveBonusToEmployee(int empID, int salary)throws EmployeeException{
		 String res = "";
	        try (Connection conn = DButils.getConnectionTodatabase()) {
	            PreparedStatement ps = conn.prepareStatement("UPDATE employee " +
	                    "SET salary = ? " +
	                    "WHERE  empID = ?");
	            ps.setInt(1, salary);
	            ps.setInt(2,empID);
	            if(ps.executeUpdate()>0) {
	                res = "Updated successfully";
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return res;
		
	}
}
