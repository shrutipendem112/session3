package com.tnsif.constructoroverloading;

public class Measurements {
	private float len;
	private float breadth;
	private float height;
	
	
	//constructor with no parameters
	public Measurements() {
		System.out.println("Calculation of measurements");
	}

	//Constructor with two parameters and different data types of parameters
	public Measurements(int len, int breadth) {
		this.len = len;
		this.breadth = breadth;
		int area = (int) (this.len*this.breadth);
		System.out.println("Area of rectangle is "+area);
	}
	
	
	//constructor with different parameters
	public Measurements(int len, float breadth) {
		this.len = len;
		this.breadth = breadth;
		float area = this.len*this.breadth;
		System.out.println("Area of rectangle is "+area);
	}
	
	//Constructor with three parameters
	public Measurements(float len, float breadth, float height) {
		this.len = len;
		this.breadth = breadth;
		this.height = height;
		float vol = this.len*this.breadth*this.height;
		System.out.println("Volume of cuboid is "+vol);
	}
	
	//Constructor with three parameters but different order
		public Measurements(float len, float height, int breadth) {
			this.len = len;
			this.breadth = breadth;
			this.height = height;
			float vol = this.len*this.breadth*this.height;
			System.out.println("Volume of cuboid is "+vol);
		}
	
	
}
