package com.hcl.exception;

public class MainClass {

	public static void main(String[] args) {
		BuiltInException builtInException = new BuiltInException();
		builtInException.handleArithmeticException();
		builtInException.handleArrayIndexOutOfBoundException();
		builtInException.handleNullPointerException();
		builtInException.handleStringOutOfBoundException();
		builtInException.handleFileNotFoundException();
		builtInException.handleNumberFormatException();
		builtInException.displayException();
		builtInException.handleMultipleCatch();
		builtInException.handleMultipleTryBlock();
		builtInException.handleFinally();
	}

}
