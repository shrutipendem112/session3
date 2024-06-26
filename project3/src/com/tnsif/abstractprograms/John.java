package com.tnsif.abstractprograms;

public class John extends TaxPayer{
	
	public John(double salary) {
		super(salary);
	}

	void calculateTax() {
		if(salary == 100000) {
			double tax=salary * 0.3;
			display();
			System.out.println("John has to pay "+ tax);
		}
	}
}
