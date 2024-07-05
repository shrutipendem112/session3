package com.tnsif.threadstwo;

public class ChildThread extends Thread{
	int n;
	String name;
	
	public ChildThread(int n, String name) {
		super();
		this.n = n;
		this.name = name;
	}
	public void run() {
		for(int i=1; i<=n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("i: "+i+ " n:"+n+ "name: "+name);
		}
	}
	
}
