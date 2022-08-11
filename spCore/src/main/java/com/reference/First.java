package com.reference;

public class First {
	private int a;
	private Second obj;
	
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public First(int a, Second obj) {
		super();
		this.a = a;
		this.obj = obj;
	}

	public int getA() {
		System.out.println("From first class");
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Second getObj() {
		return obj;
	}
	public void setObj(Second obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "First [a=" + a + ", obj=" + obj + "]";
	}
	
	
}
