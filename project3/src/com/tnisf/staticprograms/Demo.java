package com.tnisf.staticprograms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob = new Employee("Shruti", 21); //Calling instance variable using constructor
		System.out.println("Company" + Employee.companyName);
		System.out.println(ob);
		
		System.out.println();
		System.out.println("FLOW OF EXECUTION");
		MyClass mc = new MyClass();
		MyClass.display();
		System.out.println("Section is " + mc.getSection());
	}
}
