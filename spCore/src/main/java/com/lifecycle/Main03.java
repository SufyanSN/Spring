package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.constructor.Person;

public class Main03{
	
	public static void main(String[] arg) { 
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("lc_config.xml");
	
	First object = (First) context.getBean("f1");
	System.out.println(object);
	
	context.registerShutdownHook();
	}
	
}
