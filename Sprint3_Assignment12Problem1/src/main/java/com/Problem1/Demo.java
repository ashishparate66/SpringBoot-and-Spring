package com.Problem1;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}

	
	public void myInit(){
		System.out.println("inside myInit method");
	}

	public void cleanUp(){
		System.out.println("inside cleanUp method");
	}

	public void showDetails(){
		System.out.println("inside showDetails of Demo class");
		
		for(Map.Entry<Department, Employee> entry: theMap.entrySet()) {
			System.out.println("DepartMent : "+entry.getKey() +" Employee : "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo dm = ctx.getBean("D" , Demo.class);
		dm.showDetails();
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
	}
}
