package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class First{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void _init() {
		System.out.println("Inside Init");
	}
	
	@PreDestroy
	public void _destroy() {
		System.out.println("Inside Destroy");
	}
	
}
