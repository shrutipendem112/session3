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
				String berry = NestedTryCatch.fruits[4];
				System.out.println(berry);
			}
			catch(ArrayStoreException e) {
				//inner catch block
				System.out.println("Name cannot be displayed "+e.getMessage());
			}
			catch(NullPointerException e){
				//inner catch block
				System.out.println("This index is not found"+e.getMessage());
			}
		}
		catch(Exception e) {
			// Outer catch block 
			System.out.println("Exception caught - "+e.getMessage());
		}
	}
}
