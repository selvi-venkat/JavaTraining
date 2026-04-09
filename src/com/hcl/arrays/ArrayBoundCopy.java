package com.hcl.arrays;

import java.util.Arrays;

public class ArrayBoundCopy {
	public void display() {
		int[] a;
		a = new int[3];
		int[] arr = new int[5];
		arr = new int[10];
		System.out.println(arr.length);
	}

	public void copy() {
		int[] source = { 1, 2, 3 };
		int[] dest = new int[10];
		System.arraycopy(source, 0, dest, 1, source.length);
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(dest));
	}
}
