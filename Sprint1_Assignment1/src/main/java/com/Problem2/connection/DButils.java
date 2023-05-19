package com.Problem2.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Problem3.dao.DBUtils;


public class DButils {
	static String url = "jdbc:mysql://localhost:3306/db1";
	static String username = "root" ;
	static String password = "Root";
	   
	   static {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver class not found, check jar file");
			}
	   }
	   
	   public static Connection getConnectionTodatabase() throws SQLException{
		   return DriverManager.getConnection(url,username,password);
	   }
	   
	   public static void closeConnection(Connection connection) throws SQLException{
		   if(connection != null) {
			   connection.close();
		   }
	   }
	   public static void main(String[] args) throws SQLException {
		   Connection conn = DBUtils.getConnectionTodatabase();
		   System.out.println("Hi");
		
		   DBUtils.closeConnection(conn);
		   System.out.println("closed");
	  }
}