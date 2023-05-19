package com.masai.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;

import jakarta.annotation.PostConstruct;

@RestController
public class EmployeeController {

	private Map<Integer, Employee> map = new HashMap<>();
	
	@PostConstruct
	public void init() {
		map.put(20, new Employee(20,"Ashish","Parate","ap@gmail.com","Developer"));
		map.put(21, new Employee(21,"Dipesh","Nimje","dn@gmail.com","Manager"));
		map.put(22, new Employee(22,"Pratik","Singh","p@gmail.com","Accountet"));
		map.put(23, new Employee(23,"Salman","Khan","sk@gmail.com","Team Leader"));
		map.put(24, new Employee(24,"Harshal","Raut","hr@gmail.com","SDE 2"));
		map.put(25, new Employee(25,"Sanchit","Joshi","sj@gmail.com","SDE 3"));
		
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployeeHandler(){
		
		Collection<Employee> collection = map.values();
		
		List<Employee> employees = new ArrayList<>(collection);
		
		return employees;  
	}
 	
	
	
	@PostMapping("/employees")
	public String addEmployeeHandler(@RequestBody Employee employee) {
		map.put(employee.getId(), employee);
		
		return "Employee added Successfully "+employee;
				
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeByIdHandler(@PathVariable Integer id) {
		if(map.containsKey(id)) {
			Employee existingEmployee = map.get(id);
			
			return existingEmployee;
		}
		else
			throw new IllegalArgumentException("Employee does not exit with ID : "+id);
		
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmployeeHandler(@PathVariable Integer id, @RequestBody Employee employee) {
		
		if(map.containsKey(id)) {
			Employee existEmployee = map.get(id);
//			existEmployee.setFirstName(employee.getFirstName());
//			existEmployee.setLastName(employee.getLastName());
						
			map.put(id, employee);
			
			return "Employee Update Succefully";
		}
		else
			throw new IllegalArgumentException("Employee does not exit with ID : "+id);
	}
	
	@PatchMapping("/employees/{id}")
	public String updateEmployeePositionHandler(@PathVariable Integer id, @RequestParam String position) {
		
		if(map.containsKey(id)) {
			Employee exitstEmployee = map.get(id);
	
			
	
			exitstEmployee.setPosition(position);
			map.put(id, exitstEmployee);
			
			return "Employee Position Update Succefully" +position;
		}
		else
			throw new IllegalArgumentException("Employee Does not exist "+id);
	}
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeByIdHandler(@PathVariable Integer id) {
		
		if(map.containsKey(id)) {
			
			map.remove(id);
			return "Employee delete Succefully "+id;
		}else
			throw new IllegalArgumentException("Employee does not exist");
	}
	
}
