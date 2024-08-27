package com.pack;

public class Person {

	private Integer id;
	private String name;
	private Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
