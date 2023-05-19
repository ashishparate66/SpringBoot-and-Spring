package com.masai.Problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			HolidayPackage  hp = ctx.getBean(HolidayPackage.class,"h");
			hp.showDetails();
//		Date d = Date.valueOf("2012-12-04");
		
	}
}
