//Program to demonstrate static variable
package com.tnisf.staticprograms;

public class Employee {
	//instance variable
	private String name;
	private int id;
	
	static String companyName = "TNISF";

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
}
