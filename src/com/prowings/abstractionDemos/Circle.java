package com.prowings.abstractionDemos;

public class Circle extends Shape{

	public void draw(Number n) {
		System.out.println("in circle class");
	}
	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw(4);
	}
}
