package com.springCore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reference.First;

public class Main2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_config.xml");
		
		Person object = (Person) context.getBean("person_");
		System.out.println(object);
		}

}
