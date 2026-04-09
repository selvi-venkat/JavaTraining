package com.hcl.practiceCode;

public class MainClass {

	public static void main(String[] args) {
		StringCode stringCode = new StringCode();
		System.out.println(stringCode.reverseStringWithFor("hello welcome to hcl"));
		System.out.println(stringCode.reverseStringRecurssion("hello welcome to hcl"));
		System.out.println(stringCode.reverseStringtoCharArrray("hello welcome to hcl"));
		System.out.println(stringCode.reverseStringwithBuffer("hello welcome to hcl"));

		ArrayCode arrayCode = new ArrayCode();
		System.out.println(arrayCode.secondLargestNumberArray(new int[] { 3, 5, 11, 4, 2 }));
		System.out.println(arrayCode.largestNumber(new int[] { 3, 5, 001, 4, 2 }));
		System.out.println(arrayCode.maxPositiveInteger(new int[] { 1, 2, 3, -3 }));
	}

}
