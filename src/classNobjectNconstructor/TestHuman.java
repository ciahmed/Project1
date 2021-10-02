package classNobjectNconstructor;

public class TestHuman {

	public static void main(String[] args) {
		//with object(instance) I can call both static and non static variables 
		Human american = new Human();
		System.out.println(american.width);//width id static
		System.out.println(american.depth);//depth is non static
		american.smile();
		
		System.out.println(Human.width);//static variables can be accessed by class name 
		Human.cry();

	}

}
