package com.tnsif.location;

public class LocationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State sm = new State("Asia", 44579000,"India","New Delhi", "Maharashtra", "Marathi");
		State st = new State("Asia", 44579000,"India","New Delhi", "Telangana", "Telugu");
		
		Country cn = new Country("Europe", 10180000, "UK", "London");
		
		System.out.println(sm);
		System.out.println(st);
		System.out.println(cn);
	}

}
