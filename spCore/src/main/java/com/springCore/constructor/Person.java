package com.springCore.constructor;

public class Person {
	private String name;
	private int personId;
	private Company company;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int personId, Company company) {
		super();
		this.name = name;
		this.personId = personId;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", company=" + company + "]";
	}
	
}
