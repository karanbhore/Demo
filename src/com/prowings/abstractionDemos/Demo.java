package com.prowings.abstractionDemos;

public class Demo {

	public static void m1(Number s) {
		System.out.println("inside integer method");
	}
	public static void m1(Long n) {
		System.out.println("inside number method");
	}
	public static void main(String[] args) {
		m1(null);
	}
			
}
