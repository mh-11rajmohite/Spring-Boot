package com.pack;

public class Employee {

	private Integer id;
	private String name;
	private String desg;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	
	
	
	
}
