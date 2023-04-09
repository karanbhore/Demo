package com.prowings.Exception;

public class Myresources implements AutoCloseable{

	@Override
	public void close() throws Exception {
    System.out.println("my resources closed successfully");		
	}
	public void doSomething() {
		int a=10,b=0;
		int res=a/b;
		System.out.println(res);
	}

	
}
