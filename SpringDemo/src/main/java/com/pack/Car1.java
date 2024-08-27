package com.pack;


public class Car1 {

	public Engine1 engine;
	
	public Engine1 getEngine() {
		return engine;
	}

	public void setEngine(Engine1 engine) {
		this.engine = engine;
	}

	public Car1() {
		System.out.println("Car Constructor executed");
	}

	public void drive() {
		
		int status = engine.start();
		
		if(status==1) {
			
			System.out.println("Journey Starts");
			
		}
		else {
			System.out.println("Engine Problem");
			
		}
		
	}
	
}
