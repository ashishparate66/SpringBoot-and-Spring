package com.masai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DBUtils {
	static String url ;
	static String username ;
	static String password ;
	   
	   static {
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver class not found, check jar file");
			}
		   ResourceBundle bundle = ResourceBundle.getBundle("dbdetails");
		   
		   url = bundle.getString("url");
		   username = bundle.getString("username");
		   password = bundle.getString("password");
	   }
	   
	   public static Connection getConnectionTodatabase() throws SQLException{
		   return DriverManager.getConnection(url,username,password);
	   }
	   
	   public static void closeConnection(Connection connection) throws SQLException{
		   if(connection != null) {
			   connection.close();
		   }
	   }
//	   public static void main(String[] args) throws SQLException {
//		   Connection conn = DBUtils.getConnectionTodatabase();
//		   System.out.println("Hi");
//		
//		   DBUtils.closeConnection(conn);
//		   System.out.println("closed");
//	  }

	
}