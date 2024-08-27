package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new FileSystemXmlApplicationContext("player.xml");
		
		Person p = (Person)ctx.getBean("person");
		System.out.println(p.toString());
		
	}

}
