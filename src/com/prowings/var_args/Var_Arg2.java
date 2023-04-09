package com.prowings.var_args;

public class Var_Arg2 {

	
	public static void main(String[] args) {
		String s="ram";
		int i=10;
		int[] val= {1,2,3,4};
		String t="sham";
		
		Object[] mixObjects= {s,i,val,t};
			
		for(Object item : mixObjects) {
			System.out.println(item);
			int[] valitem=(int[])mixObjects[2];
			for(int digits:valitem) {
				System.out.print(digits);
			}

		}
		
		
	
	
	}
			
	
	
	
}
