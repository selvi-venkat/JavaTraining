package com.hcl.arrays;

public class TwoDimensionArray {
	int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
	int[][] arr1 = new int[][] { { 20, 30, 40 }, { 50, 60, 70 } };

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println("");
		}
		System.out.println(arr[0][2]);
		System.out.println(arr[2][0]);
	}
}
