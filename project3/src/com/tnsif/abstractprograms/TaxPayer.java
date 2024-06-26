//Program to demonstrate abstract keyword
package com.tnsif.abstractprograms;

public abstract class TaxPayer {
	protected double salary;
	abstract void calculateTax(); //abstract variable
	
	public TaxPayer(double salary) {
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Salary is " + this.salary);
	}
}
