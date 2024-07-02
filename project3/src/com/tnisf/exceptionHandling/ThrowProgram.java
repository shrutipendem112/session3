package com.tnisf.exceptionHandling;

public class ThrowProgram {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}
		else {
			System.out.println("You can vote");
		}
	}
}
