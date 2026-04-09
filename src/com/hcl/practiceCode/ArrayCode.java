package com.hcl.practiceCode;

import java.util.HashSet;
import java.util.Set;

public class ArrayCode {
	public int secondLargestNumberArray(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (arr.length < 2) {
			throw new IllegalArgumentException("Must contain at least 2 array elements");
		}
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

	public int largestNumber(int[] arr) {
		int largest = arr[0];
		for (int num : arr) {
			if (num > largest) {
				largest = num;
			}
		}
		return largest;
	}

	public int maxPositiveInteger(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int a : arr) {
			set.add(a);
		}
		int max = -1;
		for (int num : arr) {
			if (num > 0 && set.contains(-num)) {
				max = Math.max(max, num);
			}
		}
		return max;
	}

}
