package com.tnisf.daythree;

public class Citizen {
	protected String name;
	protected long adhaarNo;
	protected String address;
	protected long phone;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Citizen(String name, long adhaarNo, String address, long phone) {
		super();
		this.name = name;
		this.adhaarNo = adhaarNo;
		this.address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNo=" + adhaarNo + ", address=" + address + ", phone=" + phone
				+ ", getName()=" + getName() + ", getAdhaarNo()=" + getAdhaarNo() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
