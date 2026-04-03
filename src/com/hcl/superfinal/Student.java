package com.hcl.superfinal;

public class Student extends School {
	Student() {
		super(10);
		System.out.println("Child Constructor");
	}

	public void facility() {
		super.store();
		System.out.println("Welcome to the school facility");
	}

}
