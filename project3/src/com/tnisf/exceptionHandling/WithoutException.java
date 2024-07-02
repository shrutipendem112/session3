package com.tnisf.exceptionHandling;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		try {
			int a = 42/d;
			String name= "Shruti";
			System.out.println("My name is "+name);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught"+e.getMessage());
			System.exit(0); //stop all the executions after this
		}
		catch(NullPointerException e){
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Will not be printed");
		}
		finally {
			System.out.println("Will execute anyway");
		}
	}

}
