package com.hcl.training;

public class PracticeQuiz {
	public void practice() {
		
		System.out.println("Quiz 1...");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			if(i>2) {continue;}
			System.out.println('p');
		}
		
		System.out.println("Quiz 2...");
		 for(int i=1;i<=10;i++){  
	       if(i==5) {
	    	   continue;
	       }
	       System.out.println(i);
		 }  
		 
		System.out.println("Quiz 3...");
		 int x =10;
		 do {
			 System.out.println(x);
			 x++;
		 }while(x<20);
	}
}
