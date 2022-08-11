package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main_SpEL {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spel_config.xml");
		
		Demo object1 = (Demo) context.getBean("demo");
		System.out.println(object1);
		System.out.println("Hashcode = " + object1.hashCode());
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("21 + 1");
		System.out.println("Value =  " + expression.getValue());
		
	}
}
