package com.prowings.demo;

class Vehicle {
    int numWheels;

    Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(int numWheels, int numDoors) {
        super(numWheels);
        this.numDoors = numDoors;
    }
}
