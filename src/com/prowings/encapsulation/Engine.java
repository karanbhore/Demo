package com.prowings.encapsulation;

public class Engine {

	String type;
	float capacity;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String type, float capacity) {
		super();
		this.type = type;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + "]";
	}

}
