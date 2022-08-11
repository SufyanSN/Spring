package com.reference;

public class Second {
	private int b;

	public int getB() {
		System.out.println("From second class");
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Second [b=" + b + "]";
	}
	

}
