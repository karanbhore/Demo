package com.prowings.encapsulation;

final public class Vehicle {

	private  final String colour;
	private final String name;
	
	public final String getColour() {
		return (colour+" :this is vehicle colour");
	}
	
	
public Vehicle(String colour, String name) {
		super();
		this.colour = colour;
		this.name = name;
	}


//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	
	public String getName() {
		return (name+" : this is vehicle name");
	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	public static void main(String[] args) {
		Vehicle obj=new Vehicle("red", "bolero");
//		obj.setName("mercedes");
		System.out.println(obj.getName());
		
//		obj.setColour("red");
		System.out.println(obj.getColour());
		
//		obj.setColour("white");
		System.out.println(obj.getColour());
	}
	
	
	
	
	
	
	
}
