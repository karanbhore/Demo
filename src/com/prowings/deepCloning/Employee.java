package com.prowings.deepCloning;

public class Employee implements Cloneable {

	String name;
	int empId;
	Family family;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int empId, Family family) {
		super();
		this.name = name;
		this.empId = empId;
		this.family = family;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee clonedEmployee = (Employee) super.clone();
		clonedEmployee.family = (Family) family.clone();
		return clonedEmployee;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", family=" + family + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Family family = new Family("Shivaji", "Surabhi");
		Employee emp1 = new Employee("Rajesh", 123, family);
		System.out.println(emp1);
		System.out.println();

		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2);
		System.out.println();

		System.out.println(emp1 == emp2);
		System.out.println();

		emp1.name = "Sham";
		System.out.println(emp1);
		System.out.println();

//		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2);
		System.out.println();

		System.out.println(emp1 == emp2);
		System.out.println();

		emp1.family.fatherName = "Madhav";
		System.out.println(emp1);
		System.out.println();

//		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp2);
		System.out.println();

		System.out.println(emp1 == emp2);
		System.out.println();

	}
}
