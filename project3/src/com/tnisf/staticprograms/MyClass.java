package com.tnisf.staticprograms;

public class MyClass {
	private int section = 50; // instance variable
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	private static int srNo; //static variable
	
	static  {
		System.out.println("Static Block");
		srNo = 100;
	}
	
	MyClass(){
		System.out.println("------Default Contructor------");
		srNo++;
		section++;
	}
	static void display() {
		System.out.println("Serial No. is " +MyClass.srNo);
	}
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
