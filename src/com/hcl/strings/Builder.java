package com.hcl.strings;

public class Builder {
	// StringBuilder is not synchronized. Not Thread Safe.
	StringBuilder greetings = new StringBuilder("Welcome to HCL");

	public void builderDisplay() {
		System.out.println(greetings.length());
		System.out.println(greetings.append(" Tech"));
		System.out.println(greetings.insert(8, "here "));
		System.out.println(greetings.replace(8, 12, "dear"));
		System.out.println(greetings.delete(8, 13));
		System.out.println(greetings.capacity());
		System.out.println(greetings.reverse());

	}
}
