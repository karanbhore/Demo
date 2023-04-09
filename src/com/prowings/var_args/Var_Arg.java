package com.prowings.var_args;

public class Var_Arg {

	public void m1(int[] nums) {
		System.out.println("inside int[]");
	}
	public void m1(char...num) {
		System.out.println("inside char Var_arg");
		
	}
	public static void main(String[] args) {
		Var_Arg obj=new Var_Arg();
		obj.m1('a');
		int[] val= {1,2,3,4};
			obj.m1(val);
	}
}
