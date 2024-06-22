package com.tnisf.daythree;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Student(String name, long adhaarNo, String address, long phone) {
//		super(name, adhaarNo, address, phone);
//		// TODO Auto-generated constructor stub
//	}
	public Student(int rollNo, String collegeName) {
		super(name, adhaarNo, address, phone);// calling the parameterized constructor
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
}
