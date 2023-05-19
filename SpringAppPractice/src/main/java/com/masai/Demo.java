package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Demo {

public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//	MyBusinessClass obj = ctx.getBean("mb", MyBusinessClass.class);
//	obj.fun1(); 
	
	A obj = ctx.getBean("a1",A.class);
	obj.funA();
	
	
//	ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
//	ctx2.close();
	
}
}
