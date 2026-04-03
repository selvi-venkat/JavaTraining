package com.hcl.training;

public class Loop {
	public void printForLoop() {
		System.out.println("For Loop...");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public void printDoWhileLoop() {
		System.out.println("Do While Loop...");
		int i =0;
		do {
			i++;
			System.out.println(i);			
		}
		while(i<5);
	}
	public void printwhileLoop() {
		System.out.println("While Loop...");
		int i =0;
		while(i<5) {
			i++;
			System.out.println(i);
		}
	}
}
