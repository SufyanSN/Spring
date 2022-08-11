package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reference.First;

public class Main04 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("component_config.xml");
		
		Student object = (Student) context.getBean("student");
		System.out.println(object);
		
		System.out.println(object.getAddress());
		System.out.println(object.getAddress().getClass().getName());
	}
}
