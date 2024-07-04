package com.tnisf.threads;

public class Mythreadtwo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreadtwo t = new Mythreadtwo();
		Thread tone = new Thread(t); // pass the object of your class into thread class as start() to execute the method
		tone.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Using runnable interface I am creating a thread");
	}

}
