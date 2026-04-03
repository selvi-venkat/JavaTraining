package com.hcl.polymorphism;

public class CreditCardPaymentService extends PaymentService {
	@Override
	public int pay(int p) {
		return p * 9;
	}
}
