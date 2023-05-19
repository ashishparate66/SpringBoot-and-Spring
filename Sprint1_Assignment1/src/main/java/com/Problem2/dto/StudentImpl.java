package com.Problem2.dto;

public class StudentImpl implements Student {

	private int roll;
	private String studentName;
	private String address;
	private int marks;
	
	public StudentImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentImpl(int roll, String studentName, String address, int marks) {
		super();
		this.roll = roll;
		this.studentName = studentName;
		this.address = address;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentImpl [roll=" + roll + ", studentName=" + studentName + ", address=" + address + ", marks="
				+ marks + "]";
	}
	
	
}
