package com.tnsif.threadstwo;

public class ChildThreadMain {

	public static void main(String[] args) {
		ChildThread tone =new ChildThread(5,"First");
		ChildThread ttwo =new ChildThread(10,"Second");
		tone.start();
		ttwo.start();
		System.out.println("End of main thread");
	}
}
