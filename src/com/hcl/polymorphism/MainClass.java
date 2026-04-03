package com.hcl.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		loginService.login(8012789);
		loginService.login("Selvi", "***");
		loginService.login("selvi@gmail.com");

		CreditCardPaymentService creditCardPaymentService = new CreditCardPaymentService();
		int creditPayment = creditCardPaymentService.pay(2000);
		System.out.println(creditPayment);

		PaymentService paymentService = new PaymentService();
		int payment = paymentService.pay(2000);
		System.out.println(payment);

		PaymentService payments = new CreditCardPaymentService();
		System.out.println(payments.pay(3000));
	}

}
