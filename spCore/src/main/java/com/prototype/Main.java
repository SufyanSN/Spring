package com.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spel.Demo;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("prototypeconfig.xml");
		
		Demo_ object1 = (Demo_) context.getBean("demo");
		System.out.println(object1);
		System.out.println(object1.hashCode());
		
		Demo_ object2 = (Demo_) context.getBean("demo");
		System.out.println(object2);
		System.out.println(object2.hashCode());
		
	}
}
