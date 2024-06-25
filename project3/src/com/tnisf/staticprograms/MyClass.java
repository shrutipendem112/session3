package com.tnisf.staticprograms;

public class MyClass {
	private int section; // instance variable
	private static int srNo; //static variable
	
	static  {
		System.out.println("Staic Block");
		srNo = 100;
	}
	
	MyClass{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
