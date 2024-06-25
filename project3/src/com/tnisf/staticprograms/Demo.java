package com.tnisf.staticprograms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee.companyName; //calling static variable
		Employee ob = new Employee("Shruti", 21); //Calling instance variable using constructor
		System.out.println("Company" + Employee.companyName);
		System.out.println(ob);
	}
}
