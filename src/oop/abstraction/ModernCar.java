package oop.abstraction;

public abstract class ModernCar {
	
	//def: abstract is superclass that cannot be instantiated and is used to state or define general characteristics 
	public abstract void hydraulicBrake();
	
	public void autoLock() {
		System.out.println("auto lock system");
	}
	public void navigation() {
		System.out.println("navigation available");
	}

}
