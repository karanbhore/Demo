package com.prowings.abstractionDemos;

class Employee extends Person{

	public Employee(String name, int age, float height) {
		super(name, age, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean isValidAge() {
		if(age>=18) {
			return true;
		}
		else 
			return false;

	}
	public String eatingFoods() {
		return "vegeterian";
	}
	public static void main(String[] args) {
		Employee emp=new Employee("Ram", 20, 6.5f);
		boolean res=emp.isValidAge();
		System.out.println("Employee has valid age :"+res);
		emp.printPersonInfo();
	}

	
}
