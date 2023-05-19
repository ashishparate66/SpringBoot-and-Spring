package com.Problem1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="StudentDay7")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String course;
	private String location;
	
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Teacher", joinColumns = {@JoinColumn(name="student_id")}, inverseJoinColumns = {@JoinColumn(name="teacher_id")})
	private List<Teacher> teacherList = new ArrayList<>();


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String studentName, String course, String location, List<Teacher> teacherList) {
		super();
		this.studentName = studentName;
		this.course = course;
		this.location = location;
		this.teacherList = teacherList;
	}


	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Teacher> getTeacherList() {
		return teacherList;
	}


	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", location="
				+ location + ", teacherList=" + teacherList + "]";
	}


	
	
}
