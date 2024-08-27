package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("collections.xml");
		
		InjectCollection ic = (InjectCollection)cxt.getBean("collections");
		
		System.out.println(ic.getList());
		System.out.println(ic.getSet());
		System.out.println(ic.getMap());
		System.out.println(ic.getProps());
	}

}
