package com.prowings.encapsulation.immutable;

public final class Employee {
	
	private final int id;
	private final String name;
	final Department department;
	
	public Employee() {
		super();
		this.id = 0;
		this.name = "";
		this.department = new Department();
	}

	public Employee(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		
		Department cloneDepartment = new Department();
		
		cloneDepartment.noOfEmployee = department.getNoOfEmployee();
		cloneDepartment.name = department.getName();
		cloneDepartment.companyName = department.getCompanyName();
		
		
//		this.department = department;
		
		this.department = cloneDepartment;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Department getDepartment() {
		
		Department dummyDepartment = new Department();
		
		dummyDepartment.setNoOfEmployee(this.department.getNoOfEmployee());
		dummyDepartment.setName(this.department.getName());
		dummyDepartment.setCompanyName(this.department.getCompanyName());
		
		return dummyDepartment;
	}


//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
	

}