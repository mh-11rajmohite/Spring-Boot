package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Engine e = ctx.getBean(Engine.class);
		System.out.println(ctx.hashCode());
		System.out.println(e.hashCode());

		e.start();
		
	}

}
