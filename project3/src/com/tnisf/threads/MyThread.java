package com.tnisf.threads;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		MyThread t = new MyThread(); //new new state
		t.start(); //runnable state
//		t.start(); // IllegalStateException
		t.run();//It behaves as if you are calling a normal method
	}
}
