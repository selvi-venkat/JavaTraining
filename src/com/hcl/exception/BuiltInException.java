package com.hcl.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BuiltInException {
	public void handleArithmeticException() {
		try {
			int a = 10;
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by zero");
		}
		System.out.println("Completed");
	}

	public void handleArrayIndexOutOfBoundException() {
		try {
			String[] techStacks = { "java", "mern", "mang" };
			System.out.println(techStacks[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Not Found");
		}
		System.out.println("Completed");
	}

	public void handleNullPointerException() {
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Cannot operate anything on null");
		}
		System.out.println("Completed");
	}

	public void handleStringOutOfBoundException() {
		try {
			String str = "Welcome to hcl";
			System.out.println(str.charAt(30));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Not Found");
		}
		System.out.println("Completed");
	}

	public void handleFileNotFoundException() {
		try {
			FileReader fr = new FileReader(new File("abc.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		System.out.println("Completed");
	}

	public void handleNumberFormatException() {
		try {
			int a = Integer.parseInt("Hello");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage() + " parse right");
		}
		System.out.println("Completed");
	}

	public void displayException() {
		try {
			for (int i = 4; i >= 0; i--) {
				System.out.println(i / 0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

	public void handleMultipleCatch() {
		try {
			int[] arr = { 1, 2, 3, 4 };
			arr[4] = 3 / 0;
			System.out.println(arr[5] / 0);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index not found");
		}
		System.out.println("Completed");
	}

	public void handleMultipleTryBlock() {
		try {
			try {
				int a = 10 / 0;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index not found");
			}
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by 0");
		}
	}

	public void handleFinally() {
		try {
			int[] arr = new int[2];
			arr[6] = 10;
		} finally {
			System.out.println("Finally executed..");
		}
		System.out.println("completed");
	}

}
