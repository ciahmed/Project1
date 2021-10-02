package classNobjectNconstructor;

public class Human {
	
	//static keyword 
	static int height;
	static int width = 10;
	int depth = 5;
	
	//non static method
	public void smile() {
		depth = 6;//accessing non static variable from non static method is fine
		height = 15;//accessing static variable from non static method is fine
		System.out.println("human can smile");
	}
	
	//static method
	public static void cry() {
		//depth = 58;//accessing non static variable from static method is NOT fine
		height = 20;//accessing static variable from static method is fine
		System.out.println("human can cry");
	}

}
