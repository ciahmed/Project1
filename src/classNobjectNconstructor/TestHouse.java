package classNobjectNconstructor;

public class TestHouse {

	public static void main(String[] args) {
		//what is object? object is an instance of a class
		House obectName = new House();
		House house1 = new House("450 Redone ave", "Red");
		
		house1.kitchen();
		house1.livingBedroom();
		house1.bathroom();
		house1.masterBedroom();
		System.out.println("the address is: "+house1.getAddress());
		
		System.out.println("----------------------------------------------");
		House house2 = new House("85 1st st", "white");
		house2.kitchen();
		house2.livingBedroom();
		house2.bathroom();
		house2.masterBedroom();
		house2.childrenBedroom();
		house2.guestBedroom();

		System.out.println("----------------------------------------------");
		House house3 = new House("7 skillman", "grey");
		house3.kitchen();
		house3.livingBedroom();
		house3.bathroom();
		house3.masterBedroom();
		house3.childrenBedroom();
		house3.guestBedroom();
		house3.garage();


	}

}
