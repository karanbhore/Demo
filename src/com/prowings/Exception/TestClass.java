package com.prowings.Exception;

public class TestClass {

	public static void main(String[] args) throws Exception {
		try(Myresources mr=new Myresources()){
			System.out.println("inside try block");
			mr.doSomething();
			System.out.println("try ended");
			
		}
		catch(Exception e) {
			System.out.println("inside catch");
			System.out.println(e.getMessage());
//			throw e;
		throw new Exception("cannot divide with zero",e);	
		}
	}
}
