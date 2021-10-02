package oop.polymorophism;

public class TestLandCalculator {
	
	public static void main(String[] args) {
		
		LandCalculator lc = new LandCalculator();
		System.out.println(lc.areaOfLand(10, 5));
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.areaOfLand(10, 5));
		
	}

}
