package com.tnisf.interfacePrograms;

public class PrimeAccount implements Amazon{

	@Override
	public void welcome() {
		System.out.println("Welcome to Prime Account");
	}

	@Override
	public void thankYou() {
		System.out.println("Thank you using Prime Account");
	}
}
