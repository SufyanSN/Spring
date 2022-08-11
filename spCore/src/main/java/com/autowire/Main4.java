package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.constructor.Person;

public class Main4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlautoconfig.xml");
		
		Emp object = (Emp) context.getBean("emp1");
		System.out.println(object);
		}

}
