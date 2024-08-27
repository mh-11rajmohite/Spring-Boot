package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
	
		
		// Testing Scopes(Singleton,Prototype) 
		Employee emp1 = (Employee) context.getBean("emp");
		Employee emp2 = (Employee) context.getBean("emp");
		Employee emp3 = (Employee) context.getBean("emp");
		Employee emp4 = (Employee) context.getBean("emp");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
	}
	
}
