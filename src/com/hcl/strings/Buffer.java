package com.hcl.strings;

public class Buffer {
	// StringBuffer is synchronized. Thread Safe.
	StringBuffer greetings = new StringBuffer("Welcome to HCL");

	public void bufferDisplay() {
		System.out.println(greetings.length());
		System.out.println(greetings.append(" Tech"));
		System.out.println(greetings.insert(8, "here "));
		System.out.println(greetings.replace(8, 12, "dear"));
		System.out.println(greetings.delete(8, 13));
		System.out.println(greetings.capacity());
		System.out.println(greetings.reverse());
	}

}
