package com.hcl.strings;

public class MainClass {

	public static void main(String[] args) {
		// Strings are immutable
		BasicMethods basicMethods = new BasicMethods();
		basicMethods.displayStringMethods();

		ArrayStrings arrayStrings = new ArrayStrings();
		arrayStrings.displaytoCharMethod();
		arrayStrings.displayStringWithSplit();

		// stringBuffer and stringBuilder are mutable
		Buffer buffer = new Buffer();
		buffer.bufferDisplay();

		Builder builder = new Builder();
		builder.builderDisplay();

	}

}
