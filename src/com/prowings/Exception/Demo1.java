package com.prowings.Exception;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("hello");
		try{int a=10,b=0;
		int res=a/b;
		System.out.println(res);}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		finally {
			System.out.println("cannot divide with zero");
		}
		System.out.println("hi");
		String s="hello";
		
		Demo1 obj=new Demo1();
		System.out.println(s instanceof String);
	}
}
