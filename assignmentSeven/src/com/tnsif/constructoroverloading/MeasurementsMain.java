package com.tnsif.constructoroverloading;

public class MeasurementsMain {

	public static void main(String[] args) {
		Measurements med = new Measurements();
		Measurements me = new Measurements(10, 20);
		Measurements meaf = new Measurements(10, 20.0F);
		Measurements mev = new Measurements(10.2F, 20.1F, 30.4F);
		Measurements mevf = new Measurements(10.2F, 20, 20.1F);
	}

}
