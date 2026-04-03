package com.hcl.abstraction;

public abstract class Accounts {

	public String greet() {
		return "Welcome !!";
	}

	public final String withdrawWarning = "Withdraw amount is beyond limit";
	public final String withDrawMsg = "Amount withdrawn";

	public abstract double interest();

	public abstract String withDraw(double amount);

}
