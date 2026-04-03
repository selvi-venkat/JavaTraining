package com.hcl.abstraction;

public class School implements Admission {

	@Override
	public double payment() {
		return 100000;
	}

	@Override
	public byte gradeAdmission() {
		return 1;
	}

}
