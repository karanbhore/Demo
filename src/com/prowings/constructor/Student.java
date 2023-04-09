package com.prowings.constructor;

public class Student {

	int rollNo;
	String name;
	String address;
	Family family;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		this(rollNo, name, "Mumbai");
		System.out.println("Student(int rollNo, String name)");
		System.out.println();
	}

	public Student(Student obj) {
		this.rollNo = obj.rollNo;
		this.address = obj.address;
		this.name = obj.name;

//		this.family=obj.family;
		Family copyFamily = new Family();
		copyFamily.fatherName = obj.family.fatherName;
		copyFamily.motherName = obj.family.motherName;

		this.family = copyFamily;
	}

	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public Student(int rollNo, String name, String address, Family family) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.family = family;
	}	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", family=" + family + "]";
	}

	public static void main(String[] args) {
		Family family=new Family("Rajesh", "Rebbecca");
		Student std1=new Student(20, "Ram", "Mumbai", family);
		System.out.println(std1);
		System.out.println();
		
		Student std2=new Student(std1);
		System.out.println(std2);
		System.out.println();
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		System.out.println();
		
		std1.family.fatherName="Shivaji";
		System.out.println(std1);
		System.out.println();
		
//		Student std2=new Student(std1);
		System.out.println(std2);
		System.out.println();
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		System.out.println();
		
		

	}

}
