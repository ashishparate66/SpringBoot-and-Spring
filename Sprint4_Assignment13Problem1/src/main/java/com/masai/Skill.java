package com.masai;

public class Skill {

	private int id;
	private String name;
	private int yearsOfExperience;
	public Skill(int id, String name, int yearsOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	
}
