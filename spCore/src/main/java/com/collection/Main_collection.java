package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reference.First;

public class Main_collection {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection_config.xml");
		
		Customers object = (Customers) context.getBean("customer");
		System.out.println(object);
		
		System.out.println(object.getName());
		System.out.println(object.getContacts());
		System.out.println(object.getAddresses());
		System.out.println(object.getProducts());
		System.out.println(object.getProperties());
		
		System.out.println(object.getProperties().getClass().getName());
	
	}

}
