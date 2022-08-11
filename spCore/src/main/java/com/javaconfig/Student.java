package com.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private College college;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(College college) {
		super();
		this.college = college;
	}


	public College getCollege() {
		return college;
	}



	public void setCollege(College college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Student [college=" + college + "]";
	}


	public void studying() {
		college.display();
		System.out.println("Student is reading the book.");
	}

}
