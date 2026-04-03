package com.hcl.abstraction;

public class MainClass {

	public static void main(String[] args) {
		CurrentAcccount currentAcccount = new CurrentAcccount();
		System.out.println(currentAcccount.greet());
		System.out.println(currentAcccount.interest());
		System.out.println(currentAcccount.withDraw(75000));

		SavingsAccount savingsAccount = new SavingsAccount();
		System.out.println(savingsAccount.interest());
		System.out.println(currentAcccount.withDraw(5000));

		School school = new School();
		System.out.println(school.payment());

		College college = new College();
		System.out.println(college.payment());
	}

}
