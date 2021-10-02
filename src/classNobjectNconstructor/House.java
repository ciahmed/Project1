package classNobjectNconstructor;

public class House {
	//global variables: belong to the class
	public String address;
	String color;
	private String name;
	final String lastName = "Doe";
	
	//getter and setter
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//constructors
	//default constructor
	public House() {
			
	}
	//built constructor 
	public House(String myAddress, String myColor) {
		this.address = myAddress;
		this.color = myColor;
	}
	public House(String myAddress) {
		this.address = myAddress;
	}
	
	
	
	//methods
	//local variables: belong to the method
//	public void details(String myAddress, String myColor) {
//		this.address = myAddress;
//		this.color = myColor;
//		System.out.println("the address of this house is: "+myAddress);
//		System.out.println("the color of this house is: "+myColor);
//	}
	public void kitchen() {
		System.out.println("let's cook");
	}
	public void bathroom() {
		System.out.println("shower...shower...shower");
	}
	public void livingBedroom() {
		System.out.println("let's watch TV");
	}
	public void masterBedroom() {
		System.out.println("Daddy and Mommy");
	}
	public void childrenBedroom() {
		System.out.println("let's play");
	}
	public void guestBedroom() {
		System.out.println("welcome to our house");
	}
	public void garage() {
		System.out.println("I love my car");
	}
	
}
