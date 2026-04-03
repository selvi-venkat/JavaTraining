package com.hcl.superfinal;

public class School {
	private int a = 1;

	School(int a) {
		this.a = a;
		System.out.println(a);
		System.out.println("Parent constructor");
	}

	public final void hostel() {
		System.out.println("Welcome to the school hostel...");
	}

	public void store() {
		System.out.println("This is a store");
	}
}
