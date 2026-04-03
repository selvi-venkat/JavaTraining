package com.hcl.polymorphism;

public class LoginService {
	// Method Overloading
	public void login(String username, String password) {
		System.out.println("Your username is " + username + " and " + password);
	}

	public void login(String email) {
		System.out.println("Your username is " + email);
	}

	public void login(int otp) {
		System.out.println("Your username is " + otp);
	}
}
