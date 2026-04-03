package com.hcl.training;

public class DecisionMaking {	
	public void printSwitch() {		
		char code = 'A';
		System.out.println("Switch Statement");
		switch(code) {
			case 'A': {
				System.out.println('A');
				int count = 12;
				System.out.println(count);
				break;
			}
			case 'B': {
				System.out.println('B');
				int count = 123;
				System.out.println(count);
				break;
			}
			default: 
				System.out.println("I am default");
		}
	}
	
	public void printIf() {
		System.out.println("IF Block");
		int i = 1;
		if(i<10) {
			i = 5;
			if(i<20 && i>0) {
				System.out.println("Printing i..."+i);
			}
		}
	}
	
	public void printContinue() {
		System.out.println("Continue Statement");
		int rate = 2;
		while(rate < 5) {			
			rate++;
			if(rate ==3) {continue;}
			System.out.println(rate);
		}
	}

}
