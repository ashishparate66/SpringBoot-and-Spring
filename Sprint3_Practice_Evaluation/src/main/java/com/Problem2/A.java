package com.Problem2;

import org.springframework.stereotype.Component;

@Component
public class A {

	public void inject() {
		System.out.println("Dependency injectction");
	}
}
