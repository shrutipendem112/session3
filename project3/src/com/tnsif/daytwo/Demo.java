package com.tnsif.daytwo;
//program to demonstrate scanner class
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob = new Customer();
//		ob.setCustomerId(23);
//		ob.setCustomerName("Shruti");
//		ob.setCustomerCity("Mumbai");
//		System.out.println(ob);
		
		
		Scanner sc = new Scanner(System.in);
		String name, city;
		int id = 0;
		System.out.println("Enter the id:");
		if(sc.hasNextInt()) {
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("true");
		}else {
			sc.next();
		}
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter the city :");
		city = sc.nextLine();
		System.out.println("print all " + id + " " + name +" "+ city);
		}

}
