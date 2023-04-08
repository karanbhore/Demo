package com.prowings.abstractionDemos;

public class A implements I,I2 {

	@Override
	public void m1() {
    System.out.println("hello inside m1 in class A");		
	}
	
	public static void main(String[] args) {
		A obj=new A();
		obj.m1();
		obj.m1(10);
	}

	@Override
	public void m1(int a) {
     System.out.println("inside m1 in A accepting integer");		
	}

}
