package com.hcl.inheritance;

public class Mainclass {
	public static void main(String args[]) {
		// ** Constructor ** //
		ConstructorExample constructorExample = new ConstructorExample(324, "John");
		constructorExample.displayDetails();
		ConstructorExample constructorExampleCopy = new ConstructorExample(constructorExample);
		constructorExampleCopy.displayDetails();
		try {
			ConstructorExample constructorExampleCopyWithClone = constructorExample.clone();
			constructorExampleCopyWithClone.displayDetails();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// ** Inheritance ** //
		MainSchool mainSchool = new MainSchool();
		mainSchool.admissionLKG();
		mainSchool.admission1to5();

		CastingParentClass.di();
	}
}
