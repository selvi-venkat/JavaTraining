package com.hcl.training;

public class Training {

	public static void main(String[] args) {
		// ** Variables ** //
		System.out.println("VARIABLES");
		Variables variables = new Variables(); // class object created
		variables.count = 20000;
		Variables.price = 50.50f; // access static variables through class name
		variables.print();

		Variables newVariables = new Variables();
		newVariables.count = 30000;
		Variables.price = 100.50f;
		newVariables.print();

		// ** Loop ** //
		System.out.println("LOOPS");
		Loop loop = new Loop();
		loop.printForLoop();
		loop.printDoWhileLoop();
		loop.printwhileLoop();

		// ** Control Statements **/
		System.out.println("Control Statements");
		DecisionMaking decisionMaking = new DecisionMaking();
		decisionMaking.printSwitch();
		decisionMaking.printIf();
		decisionMaking.printContinue();

		// ** Practice quiz ** //
		PracticeQuiz practiceQuiz = new PracticeQuiz();
		practiceQuiz.practice();
	}

}
