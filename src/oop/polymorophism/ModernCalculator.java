package oop.polymorophism;

public class ModernCalculator extends LandCalculator{

	//overriding: is when use the same method name and same parameters but different body
	//NB: in order to do this we need the annotation @Override and extend to the original class where the method is located
	@Override
	public int areaOfLand(int a, int b) {
		int total = a + b + 10;
		return total;
	}
}
