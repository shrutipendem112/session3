package com.tnsif.abstractprograms;

import java.util.Scanner;

public class TaxMain {
	public static void main(String[] args) {
		double inputsalary;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary for John: ");
		inputsalary = sc.nextDouble();
		TaxPayer ob;
		ob = new John(inputsalary);
		ob.calculateTax();
		
		System.out.println("Enter salary for Alice:");
		inputsalary = sc.nextDouble();
		ob = new Alice(inputsalary);
		ob.calculateTax();
	}
}
