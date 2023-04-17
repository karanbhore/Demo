package com.prowings.encapsulation.immutable;

final class Student {

	private final String name;
	private final int id;
	private final Family family;

	public Student() {
		super();
		this.id = 0;
		this.name="";
		this.family = new Family();
	}

	public Student(String name, int id, Family family) {
		super();
		this.name = name;
		this.id = id;
//		this.family = family;
		Family clonedfamily = new Family();
		clonedfamily.fatherName = family.getFatherName();
		clonedfamily.motherName = family.getMotherName();

		this.family = clonedfamily;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Family getFamily() {
		Family dummyfamily = new Family();
		dummyfamily.setFatherName(this.family.getFatherName());
		dummyfamily.setMotherName(this.family.getMotherName());

		return dummyfamily;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", family=" + family + "]";
	}
	
	

}
