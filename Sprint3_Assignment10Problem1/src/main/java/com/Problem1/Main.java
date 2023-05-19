package com.Problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Demo demo = ctx.getBean(Demo.class,"demo");
		demo.fun();
		
		AnnotationConfigApplicationContext ctx2 = (AnnotationConfigApplicationContext)ctx;
		ctx2.close();
	}
}
