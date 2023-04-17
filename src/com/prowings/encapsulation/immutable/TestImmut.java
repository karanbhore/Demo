package com.prowings.encapsulation.immutable;

public class TestImmut {

	public static void main(String[] args) {
		Family family =new Family("Shiv", "Sumati");
		Student std1=new Student("Ram", 123, family);
		System.out.println(std1);
		System.out.println();
		
//		std1.family.setFatherName("Raj");
		System.out.println(std1);
		
	}
	
}
