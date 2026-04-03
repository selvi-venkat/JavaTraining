package com.hcl.training;

public class Variables {

	int count = 10000;// instance variable
	static float price = 20.05f; // static variable
	boolean flag = true;
	protected int aa = 9;

	public void print() {
		char code = 'A'; // local variable
		if (flag) {
			System.out.println("Code: " + code);
			System.out.println("Count: " + count);
			System.out.println("Price: " + price);
		}
	}

}
