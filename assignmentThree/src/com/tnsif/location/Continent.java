package com.tnsif.location;

public class Continent {

	private String name;
	private int area;
	
	public Continent(String name, int area) {
		this.name = name;
		this.area = area;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Continent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Continent [name=" + name + ", area=" + area + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
