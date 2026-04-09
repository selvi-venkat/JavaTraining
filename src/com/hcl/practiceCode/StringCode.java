package com.hcl.practiceCode;

public class StringCode {

	public String reverseStringWithFor(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}

	public String reverseStringRecurssion(String string) {
		if (string.isEmpty()) {
			return string;
		}
		return (reverseStringRecurssion(string.substring(1))) + string.charAt(0);
	}

	public String reverseStringtoCharArrray(String string) {
		char[] c = string.toCharArray();
		String reverseStr = "";
		for (int i = c.length - 1; i >= 0; i--) {
			reverseStr += c[i];
		}
		return reverseStr;
	}

	public String reverseStringwithBuffer(String string) {
		StringBuffer str = new StringBuffer(string);
		return str.reverse().toString();
	}
}
