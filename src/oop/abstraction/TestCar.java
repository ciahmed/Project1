package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car accord = new Honda();
		accord.carShape();
		accord.start();
		accord.stop();
		
		System.out.println("----------------------------------");
		Honda civic = new Honda();
		civic.carShape();
		civic.start();
		civic.stop();
		civic.changeGear();
		civic.radio();
		civic.engine();
		civic.fuelType();

	}

}
