package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain1 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Car1 c = ctx.getBean(Car1.class);
		System.out.println(ctx);
		System.out.println(ctx.hashCode());
	
		
		c.drive();
		c.getEngine().start();
		
	}
}
