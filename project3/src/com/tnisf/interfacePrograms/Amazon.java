package com.tnisf.interfacePrograms;

public interface Amazon {
	void welcome();
	void thankYou();
	
	default void securitycharge() {
		int charge = 100;
		System.out.println("You have to pay security charge of amount rs " +charge);
	}
	
	static void aboutUs() {
		System.out.println("Welcome to Amazon");
	}
}
