package com.tnsif.abstractprograms;

public class Alice extends TaxPayer{

	public Alice(double salary) {
		super(salary);
	}
	
	void calculateTax() {
		if(salary == 50000) {
			
			double tax=salary* 0.1;
			display();
			System.out.println("Alice has to pay "+tax);
		}
	}
	
}