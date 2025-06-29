package interfaces;
// Define the interface
interface Vehicle1 {
    void start();
    void fuelType();
}

// Implementing the interface in the Car class
class Sedan implements Vehicle1 {
    public void start() {
        System.out.println("Sedan starts with a button.");
    }

    public void fuelType() {
        System.out.println("Sedan uses petrol.");
    }
}

// Implementing the interface in the Bike class
class Cruiser implements Vehicle1 {
    public void start() {
        System.out.println("Cruiser starts with a kick.");
    }

    public void fuelType() {
        System.out.println("Cruiser uses diesel.");
    }
}


public class VehicleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Main class to test the implementation
		        Vehicle1 mySedan = new Sedan();
		        Vehicle1 myCruiser = new Cruiser();

		        mySedan.start();
		        mySedan.fuelType();

		        myCruiser.start();
		        myCruiser.fuelType();
		   

	}

}
