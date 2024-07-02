//Program to demonstrate nested try and catch block
package com.tnisf.Nested;

public class NestedDemo {

	public static void main(String[] args) {
		try {
			//outer try block
			int a = 4;
			System.out.println(a);
			try {
				//inner try block
				System.out.println(NestedTryCatch.name.charAt(4));
			}
			catch(NullPointerException e){
				//inner catch block
				System.out.println("This index is not found - "+e.getMessage());
			}
			String berry = NestedTryCatch.fruits[4];
			System.out.println(berry);
		}
		catch(Exception e) {
			// Outer catch block 
			System.out.println("Exception caught - "+e.getMessage());
		}
	}
}
