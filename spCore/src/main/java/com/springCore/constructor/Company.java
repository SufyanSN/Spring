package com.springCore.constructor;

public class Company {

	private String companyName;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}
	
	
}
