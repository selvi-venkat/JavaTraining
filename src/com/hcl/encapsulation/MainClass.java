package com.hcl.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setEmpName("Adhithi");
		employee.displayDetails();

		Employee employee1 = new Employee();
		employee1.setId(102);
		employee1.setEmpName("Adhvik");
		employee1.displayDetails();

	}

}
