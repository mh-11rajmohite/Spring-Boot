package com.pack.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VillageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(VillageConfig.class);
 
		District d = ac.getBean(District.class);
		d.setId(1000);
		d.setName("Satara");
		
		Village v = ac.getBean(Village.class);
		v.setId(100);
		v.setName("Talbid");
		v.setPopulation(100000);
		v.setDistrict(d);
		
	
		System.out.println(v.toString());
		v.getDistrict().riverName();
		
		
	}

}
