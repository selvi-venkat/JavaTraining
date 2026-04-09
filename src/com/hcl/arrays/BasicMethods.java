package com.hcl.arrays;

import java.util.Arrays;

public class BasicMethods {

	int[] arr = new int[3];
	int[] arr1 = new int[] { 1, 2, 3 };
	int[] arr2 = { 20, 40, 60, 80 };
	String[] fruits = { "apple", "banana", "orange" };

	public void display() {
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
	}

	public void displaywithEnhancedLoop() {
		for (int num : arr2) {
			System.out.println(num);
		}
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
