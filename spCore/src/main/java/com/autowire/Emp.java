package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	/*
	@Autowired
	@Qualifier("address01")
	*/
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside Setter");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
