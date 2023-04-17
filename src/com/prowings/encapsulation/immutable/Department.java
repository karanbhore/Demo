package com.prowings.encapsulation.immutable;

public class Department {
	
	int noOfEmployee;
	String name;
	String companyName;
	
	public Department() {
		super();
	}

	public Department(int noOfEmployee, String name, String companyName) {
		super();
		this.noOfEmployee = noOfEmployee;
		this.name = name;
		this.companyName = companyName;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Department [noOfEmployee=" + noOfEmployee + ", name=" + name + ", companyName=" + companyName + "]";
	}
	
	
	
	
	
	

}