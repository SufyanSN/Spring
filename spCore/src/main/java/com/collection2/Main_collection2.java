package com.collection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Customers;

public class Main_collection2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection2_config.xml");
		
		Customers object = (Customers) context.getBean("customer");
		System.out.println(object);
		
		System.out.println(object.getName());
		System.out.println(object.getName().getClass().getName());
		
		System.out.println(object.getContacts());
		System.out.println(object.getContacts().getClass().getName());
		
		System.out.println(object.getAddresses());
		System.out.println(object.getAddresses().getClass().getName());
		
		System.out.println(object.getProducts());
		System.out.println(object.getProducts().getClass().getName());
		
		System.out.println(object.getProperties());
		System.out.println(object.getProperties().getClass().getName());
	
	}

}
