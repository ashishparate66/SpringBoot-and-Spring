package com.Problem2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Problem1.connection.DButils;
import com.Problem1.exception.EmployeeException;
import com.Problem2.dto.Student;
import com.Problem2.dto.StudentImpl;
import com.Problem2.exception.StudentException;
import com.Problem3.dao.DBUtils;

public class StudentDAOImpl implements StudentDAO {

	
	public Student getStudentByRollNo(int rollNo)throws StudentException{
		Student st = null;
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("select * from student where rollNo = ?");
            ps.setInt(1, rollNo);
            ResultSet rs = ps.executeQuery() ;
            if(rs.next()) { 	
                String studentName = rs.getString("studentName");
                String address = rs.getString("address");
                int marks = rs.getInt("marks");
                st = new StudentImpl(rollNo,studentName,address, marks);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return st;
	}
	
	public List<Student> getAllStudent(){
		Connection conn = null;
		List<Student> list = new ArrayList<>();
		try {
			conn = DButils.getConnectionTodatabase();
			String query = "SELECT * FROM student";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new StudentImpl(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4) ));
			}
			
		}catch(SQLException ex) {
			System.out.println(ex);
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
		return list;
	}

	public String saveStudentDetails(Student student) {
		String res = "Failed to save";
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("insert into student (rollNo,studentName,address,marks) values (?, ?, ?, ?)" );
            ps.setInt(1, student.getRoll());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getAddress());
            ps.setInt(4, student.getMarks());
            if(ps.executeUpdate()>0) {
                res = "=Student Registered Successfully";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
		
	}

	public boolean deleteStudentByRollNo(int rollNo)throws StudentException{
		boolean res = false;
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM student WHERE rollNo = ?");
            ps.setInt(1,rollNo);
            if(ps.executeUpdate()>0) {
                res = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
		
	}

	public String graceStudentMarks(int rollNo, int marks)throws StudentException{
			 String res = "";
		        try (Connection conn = DButils.getConnectionTodatabase()) {
		            PreparedStatement ps = conn.prepareStatement("UPDATE student " +
		                    "SET marks = ? " +
		                    "WHERE  rollNo = ?");
		            ps.setInt(1, marks);
		            ps.setInt(2,rollNo);
		            if(ps.executeUpdate()>0) {
		                res = "Updated successfully";
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return res;
		
	}

	public Student getStudentsByName(String studentName)throws StudentException{
		Student st = null;
        try (Connection conn = DButils.getConnectionTodatabase()) {
            PreparedStatement ps = conn.prepareStatement("select * from student where studentName = ?");
            ps.setString(1, studentName);
            ResultSet rs = ps.executeQuery() ;
            if(rs.next()) { 	
                int roll = rs.getInt("rollNo");
                String address = rs.getString("address");
                int marks = rs.getInt("marks");
                st = new StudentImpl(roll,studentName,address, marks);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return st;
	}
}
