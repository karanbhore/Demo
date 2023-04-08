package com.prowings.abstractionDemos;

public abstract class Person {
	String name;
	int age;
	float height;
	
//		public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Person(String name, int age, float height) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
		}
	public abstract boolean isValidAge();
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	public void printPersonInfo() {
	System.out.println(toString());	
	}

	
}
