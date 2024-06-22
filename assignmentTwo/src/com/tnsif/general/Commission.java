package com.tnsif.general;

import java.util.Scanner;

public class Commission {
	
	public String name, address;
	public int phone;
	public int sales;
	double commission = 0;
	public void details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter your address:");
		address = sc.nextLine();
		System.out.println("Enter your phone:");
		phone = sc.nextInt();
		System.out.println("Enter your Sales Amount:");
		sales = sc.nextInt();
	}
	public void calculate() {
		if(sales >= 100000) {
			commission = 0.10 * sales;
		}else if(sales < 100000 && sales >= 50000) {
			commission = 0.05 * sales;
		}else if(sales < 50000 && sales >= 30000) {
			commission = 0.03 * sales;
		}else {
			commission = 0;
		}
		System.out.println("Commission is " + commission);
	}
}
