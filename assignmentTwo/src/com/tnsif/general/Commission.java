package com.tnsif.general;

import java.util.Scanner;

public class Commission {
	
	public String name, address;
	public int phone;
	public int sales;
	public Commission() {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sales = sales;
	}
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
			System.out.println("Commission is 10%");
		}else if(sales < 100000 && sales >= 50000) {
			System.out.println("Commission is 5%");
		}else if(sales < 50000 && sales >= 30000) {
			System.out.println("Commission is 3%");
		}else {
			System.out.println("No Commission");
		}
	}
}
