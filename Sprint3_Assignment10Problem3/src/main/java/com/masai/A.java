package com.masai;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class A {

	private String driverName;
	private String url;
	private String userName;
	private String password;
	
	public Connection conn; 
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void init () {
		System.out.println("inside init method");
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertStudentRecord() {
		System.out.println("connection object is ready.......");
		getStudent();
	}
	public void getStudent(){
		List<String> std =new ArrayList<>();
		
		std.add("Ashish");
		std.add("Dipesh");
		std.add("Pratik");
		System.out.println(std);
	}
	
}
