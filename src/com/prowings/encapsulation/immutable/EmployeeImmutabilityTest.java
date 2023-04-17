package com.prowings.encapsulation.immutable;

public class EmployeeImmutabilityTest {
	
	public static void main(String[] args) {
		
		Department department = new Department(1200,"Production Department","CITI BANK");
		
		Employee emp = new Employee(1234,"RAM",department);
		
		
		System.out.println("befor change :--"+ emp);
		
		department.setNoOfEmployee(1500);
		
		emp.department.setCompanyName("INFOSYS");
		
		System.out.println("after change :--"+emp);
	}

}