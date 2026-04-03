package com.hcl.inheritance;

public class ConstructorExample implements Cloneable {
	public ConstructorExample(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ConstructorExample(ConstructorExample constructorExample) {
		this.id = constructorExample.getId();
		this.name = constructorExample.getName();
	}

	public ConstructorExample clone() throws CloneNotSupportedException {
		return (ConstructorExample) super.clone();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long id;
	public String name;

	public void displayDetails() {
		System.out.println("My id is " + id + " and my name is " + name);
	}

}
