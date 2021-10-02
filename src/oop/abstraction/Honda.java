package oop.abstraction;

public class Honda extends ModernCar implements Car, Motor{

	//these methods are coming from car interface
	public void carShape() {
		System.out.println("aerodynamic with 2 people capacity");
	}

	public void start() {
		System.out.println("let's drive");
	}

	public void stop() {
		System.out.println("need brakes");
	}

	//this is a Honda class method
	public void changeGear() {
		System.out.println("3 manual shifts");
	}
	
	public void radio() {
		System.out.println("let's play music");
	}

	//these methods are coming from Motor class
	public void engine() {
		System.out.println("engine with turbo");
	}

	public void fuelType() {
		System.out.println("diesel fuel type");
	}

	public void hydraulicBrake() {
		System.out.println("hydraulic brake system");
	}
	
	

}
