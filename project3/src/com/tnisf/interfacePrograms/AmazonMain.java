package com.tnisf.interfacePrograms;

public class AmazonMain {

	public static void main(String[] args) {
		Amazon.aboutUs();
		
		Amazon obPrime = new PrimeAccount();
		obPrime.welcome();
		obPrime.thankYou();
		
		Amazon obNonPrime = new NonPrimeAccount();
		obNonPrime.welcome();
		obNonPrime.securitycharge();
		obNonPrime.thankYou();
	}

}
