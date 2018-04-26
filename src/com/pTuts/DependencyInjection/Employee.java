package com.pTuts.DependencyInjection;

public class Employee {

	String age;
	String name;
	Address address;
	
	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Employee(String age,String name,Address address) {
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	
	
	
	
}
