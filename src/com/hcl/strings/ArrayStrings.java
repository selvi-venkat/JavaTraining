package com.hcl.strings;

public class ArrayStrings {
	String greetings = "Welcome to HCL Tech";

	public void displayStringWithSplit() {
		String[] splitString = greetings.split(" ", 3);
		for (String c : splitString) {
			System.out.println(c);
		}
		String str = String.join("*", splitString);
		System.out.println(str);
	}

	public void displaytoCharMethod() {
		char[] chars = greetings.toCharArray();
		System.out.println("Character Array....");
		for (char c : chars) {
			System.out.println(c);
		}
	}
}
