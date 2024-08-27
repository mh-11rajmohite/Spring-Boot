package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new FileSystemResource("student.xml");
	//	BeanFactory factory = new XmlBeanFactory(res);
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student st = (Student)context.getBean("stud");
		
		System.out.println(st.toString());
				
				
	}

}
