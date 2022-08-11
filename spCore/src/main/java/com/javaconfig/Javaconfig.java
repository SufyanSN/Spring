package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.javaconfig")
public class Javaconfig {
	public College getCollege() {
		College college = new College();
		return college;
	}
	
	@Bean(name= {"student", "student_01", "getStudent"})
	public Student getStudent() {
		//Creating a new student-object
		Student student = new Student(getCollege());
		return student;
	}
}
