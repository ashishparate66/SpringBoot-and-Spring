package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/dipesh")
	@ResponseBody
	public String sayHello() {
		return "Welcom Dipesh";
	}
	
	@RequestMapping("/student")
	@ResponseBody
	public Student getStudent() {
		Student student = new Student(10,"Dipesh",780);
		return student;
	}
	@RequestMapping("/students")
	@ResponseBody
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"dipesh",100));
		students.add(new Student(11,"ashish",200));
		students.add(new Student(12,"pratik",300));
		students.add(new Student(13,"bhavesh",400));
		return students;
	}
	
	
	
}
