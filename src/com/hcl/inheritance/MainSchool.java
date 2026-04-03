package com.hcl.inheritance;

public class MainSchool extends PreSchool {

	public void admission1to5() {
		admissionUKG();
		System.out.println("Admission 1 to 5");
	}

	public void admission6to12() {
		System.out.println("Admission 6 to 12");
	}

	public int add(int a, long b) {
		return (int) (a + b);
	}

}
