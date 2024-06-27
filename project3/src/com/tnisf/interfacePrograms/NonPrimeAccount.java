package com.tnisf.interfacePrograms;

public class NonPrimeAccount implements Amazon{

	@Override
	public void welcome() {
		System.out.println("Welcome to Non Prime Account");
	}

	@Override
	public void thankYou() {
		System.out.println("Thank you using Non Prime Account");
	}

}
