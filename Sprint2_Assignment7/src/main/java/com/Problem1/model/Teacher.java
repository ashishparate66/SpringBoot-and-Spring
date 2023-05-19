package com.Problem1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TeacherDay7")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String teacherName;
	private String subject;
	
	@ManyToMany(mappedBy ="teacherList",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	
	private List<Student> studentList = new ArrayList<>();

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teacherName, String subject, List<Student> studentList) {
		super();
		this.teacherName = teacherName;
		this.subject = subject;
		this.studentList = studentList;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject
				+ ", studentList=" + studentList + "]";
	}	
	
	

}
