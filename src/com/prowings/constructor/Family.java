package com.prowings.constructor;

public class Family {

	String fatherName;
	String motherName;
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Family(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Family [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	
	
}
