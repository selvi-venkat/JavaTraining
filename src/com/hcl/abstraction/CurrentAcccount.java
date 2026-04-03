package com.hcl.abstraction;

public class CurrentAcccount extends Accounts {

	@Override
	public double interest() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String withDraw(double amount) {
		// TODO Auto-generated method stub
		return amount > 50000 ? withdrawWarning : withDrawMsg;
	}

}
