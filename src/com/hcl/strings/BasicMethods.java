package com.hcl.strings;

import java.util.Date;
import java.util.Locale;

public class BasicMethods {
	String greetings = "Welcome to HCL Tech";
	String greetings1 = "Welcome to HCL Tech";
	String moto = "HCL Tech, an mnc company - HCL Tech";
	String logo = "HCL";

	String joinHcl = new String("This is my first day at HCL");
	String joinHcl1 = new String("This is my first day at HCL");
	String joinHclCase = new String("THIS IS MY FIRST DAY AT HCL");

	int hclIndex = moto.indexOf("HCL");
	double price = 120000.279;

	public void displayStringMethods() {
		System.out.println(greetings.length()); // length
		System.out.println(logo.toLowerCase()); // lowerCase
		System.out.println(greetings.toUpperCase()); // upperCase
		System.out.println(greetings.charAt(2)); // charAt
		System.out.println(greetings.contains(logo)); // contains
		System.out.println(greetings.contains("Tech")); // contains
		System.out.println(greetings.indexOf('T')); // indexOf with character
		System.out.println(greetings.lastIndexOf('e')); // last indexOf with character
		System.out.println(greetings.indexOf("HCL")); // indexOf with String
		System.out.println(moto.indexOf("HCL", hclIndex + 1));
		System.out.println(moto.lastIndexOf("HCL", hclIndex + 1));
		System.out.println(greetings == greetings1); // object comparison
		System.out.println(greetings.equals(greetings1)); // string content comparison
		System.out.println(joinHcl == joinHcl1); // object comparison for new String Creation
		System.out.println(joinHcl.equals(joinHcl1)); // string content comparison
		System.out.println(joinHclCase.equalsIgnoreCase(joinHcl)); // Ignore case while string comparison
		System.out.println(greetings.concat(".").concat(joinHcl)); // concatenation
		System.out.println(("  Welcome to    my   team   ").trim()); // trim
		System.out.println(joinHcl.compareToIgnoreCase(joinHclCase)); // compareTo ignoreCase
		System.out.println("welcome".compareTo("hcl")); // compareTo
		System.out.println(greetings.replace('e', 'M')); // replace character
		System.out.println(greetings.replace("Wel", "Met")); // replace string
		System.out.println(greetings.isEmpty()); // isEmpty
		System.out.println(greetings.substring(2, 6)); // substring
		/** String Format **/
		System.out.println(String.format("my name is %s and age is %d", "Selvi", 34));
		System.out.println(String.format("The price of laptop is %.2f", price));
		System.out.println(String.format("Amount is %04d", 23));
		String s = String.format("Today: %tF", new Date());
		System.out.println(s);
		System.out.printf("Today date is %tF %n", new Date());
		System.out.println(String.format(Locale.US, "%,.2f", 1232323.3432));
	}
}
