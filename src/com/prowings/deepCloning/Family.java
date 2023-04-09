package com.prowings.deepCloning;

public class Family implements Cloneable{
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
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Family [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}

}
