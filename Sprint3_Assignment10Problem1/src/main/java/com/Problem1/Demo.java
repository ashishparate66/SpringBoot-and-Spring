package com.Problem1;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demo {
	
	@Autowired
	private List<String> cities;
	
	@Autowired
	private List<Student> stdList;
	
	public void fun() {
		
		System.out.println("Cities Present in arrayList");
		cities.forEach(System.out::println);
		
		System.out.println("\n\nStudent Present in Array List");
		stdList.forEach(System.out::println);
	}
	
	@PostConstruct
	public void postConstructmethod() {
		System.out.println("Spring Bean Object Created Succefully.....");
	}
	
	@PreDestroy
	public void preDestroymethod() {
		System.out.println("Spring Bean Object Destroy....");
	}
	
}
