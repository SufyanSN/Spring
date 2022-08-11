package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Emp;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		
		Student std = (Student) context.getBean("getStudent");
		System.out.println(std);
		std.studying();
		
		Student std1 = (Student) context.getBean("student");
		System.out.println(std1);
		std1.studying();
		
	}
}
