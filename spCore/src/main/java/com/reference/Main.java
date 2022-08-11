package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		
		First object = (First) context.getBean("firstref");
		System.out.println(object.getA());
		
		System.out.println(object.getObj().getB());
	}

}
