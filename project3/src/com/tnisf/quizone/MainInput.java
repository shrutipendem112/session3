package com.tnisf.quizone;

import java.util.Scanner;

public class MainInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputNumber =0;
		
		while(Demo.samplesCollected < 30) {
			System.out.println("Enter the number of leaf samples collected: ");
			inputNumber =sc.nextInt();
			Demo.samplesCollected = Demo.samplesCollected + inputNumber;
			Demo.round++;
		}
		Demo.display();
	}

}
