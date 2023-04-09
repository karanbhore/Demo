package com.prowings.demo;

public class TestCustomException {

	public static void main(String[] args) {
		Citizen obj = new Citizen(123, "Ram", "India", "A50");
		String res = "";
		try {
			res = isValidVoter(obj) ? "Valid Voter" : "Invalid Voter";

		} catch (InvalidAgeException e) {
			System.out.println("<<<<<<<<>>>>>");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("<<<<<<<<>>>>>");

		}

	}

	private static boolean isValidVoter(Citizen obj) throws InvalidAgeException{
        try {
        	int age=Integer.parseInt(obj.getAge());
        	if(age>=18)
        		return true;
        	
        }
		catch(Exception e) {
			throw new InvalidAgeException("age is below 18");
			
		}
		
		return false;
	}

}
