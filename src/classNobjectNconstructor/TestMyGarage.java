package classNobjectNconstructor;

public class TestMyGarage {

	public static void main(String[] args) {
		
		Garage myGarage = new Garage();
		
		myGarage.setDriveWaySize(12);
		System.out.println(myGarage.getDriveWaySize());
		
		Garage neighborGarage = new Garage();
		neighborGarage.setDriveWaySize(14);
		System.out.println(neighborGarage.getDriveWaySize());
		
		System.out.println(myGarage.getDriveWaySize());

	}

}
