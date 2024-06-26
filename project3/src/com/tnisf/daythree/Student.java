package com.tnisf.daythree;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	public Student(String name, long adhaarNo, String address, long phone, int rollN, String collegeName) {
		super(name, adhaarNo, address, phone);
		// TODO Auto-generated constructor stub
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdhaarNo()=" + getAdhaarNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
