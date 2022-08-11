package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	//@Value("#{500}")
	@Value("#{50}")
	private int a;
	
	@Value("#{2<3 ? 1:0}")
	private int b;
	
	@Value("#{ T(java.lang.Math).PI}") //For variables of a class
	private double c;
	
	@Value("#{ T(java.lang.Math).sqrt(100)}") //For methods of a class
	private double square_root;
	
	@Value("#{ 20 < 100}")
	private boolean isAvailable;
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public double getSquare_root() {
		return square_root;
	}
	public void setSquare_root(double square_root) {
		this.square_root = square_root;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + ", square_root=" + square_root + ", isAvailable="
				+ isAvailable + "]";
	}
	
	
}
