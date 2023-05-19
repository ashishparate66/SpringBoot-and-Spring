package com.Problem1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CollegeDay6")
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	@OneToMany(mappedBy ="college", cascade = CascadeType.ALL)
	private List<Student> studentList = new ArrayList<>();

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collageName, String collageAddress, List<Student> studentList) {
		super();
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.studentList = studentList;
	}

	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getCollageAddress() {
		return collageAddress;
	}

	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "College [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", studentList=" + studentList + "]";
	}
	
	
}
