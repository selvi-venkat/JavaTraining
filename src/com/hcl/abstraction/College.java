package com.hcl.abstraction;

public class College implements Admission {

	@Override
	public double payment() {
		return 200000;
	}

	@Override
	public byte gradeAdmission() {
		return 101;
	}

}
