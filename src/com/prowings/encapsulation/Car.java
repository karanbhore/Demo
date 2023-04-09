package com.prowings.encapsulation;

public final class Car {

	private final String name;
	private final String colour;
	private final Engine engine;
	
	

	public Car() {
	this.name="";
	this.colour="";
	this.engine=new Engine(); 
	
	}

	public Car(String name, String colour, Engine engine) {
		super();
		this.name = name;
		this.colour = colour;

//		this.engine = engine;

		Engine dummyEngine = new Engine();
		dummyEngine.type = engine.type;
		dummyEngine.capacity = engine.capacity;
		this.engine = dummyEngine;

	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	public Engine getEngine() {
		
		Engine copyEngine=new Engine();
		copyEngine.setCapacity(this.engine.getCapacity());
		copyEngine.setType(this.engine.getType());
		return copyEngine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", engine=" + engine + "]";
	}

	public static void main(String[] args) {
		Engine engine = new Engine("Air cooled", 4.2f);
		Car car = new Car("Alto", "white", engine);

		System.out.println(car);

		car.engine.setCapacity(5.2f);

		System.out.println(car);

	}

}
