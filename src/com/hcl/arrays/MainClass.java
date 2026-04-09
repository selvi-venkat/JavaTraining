package com.hcl.arrays;

public class MainClass {

	public static void main(String[] args) {
		BasicMethods basicMethods = new BasicMethods();
		basicMethods.display();
		basicMethods.displaywithEnhancedLoop();

		TwoDimensionArray twoDimensionArray = new TwoDimensionArray();
		twoDimensionArray.display();

		ArrayBoundCopy arrayBoundCopy = new ArrayBoundCopy();
		arrayBoundCopy.display();
		arrayBoundCopy.copy();
	}

}
