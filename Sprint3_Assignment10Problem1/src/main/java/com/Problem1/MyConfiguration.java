package com.Problem1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.Problem1"})
public class MyConfiguration {


	@Bean
	public List<String> geArrayList(){
		List<String> cities = new ArrayList<>();
		cities.add("Nagpur");
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Goa");
		cities.add("Banglore");
		
		return cities;
		
	}	
	@Bean
	@Primary
	public List<Student> getStudent(){
		List<Student> std = new ArrayList<>();
		
		std.add(new Student(1, "Ashish", 650));
		std.add(new Student(2, "Pratik", 700));
		std.add(new Student(3, "Ruhansh", 520));
		std.add(new Student(4, "Dipesh", 310));
		std.add(new Student(5, "Bhavesh", 450));
		return std;
	}	
}
