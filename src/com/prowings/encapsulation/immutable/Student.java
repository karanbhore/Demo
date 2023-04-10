package com.prowings.encapsulation.immutable;

private final class Student {

	String name;
	int id;
	Family family;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, Family family) {
		super();
		this.name = name;
		this.id = id;
//		this.family = family;
		Family clonedfamily=new Family();
		clonedfamily.fatherName=
		
		
		
		
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Family getFamily() {
		return family;
	}
	
	
	
	
	
	
	
	
}
