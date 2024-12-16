package inheritance;

//Base class
class Vehicle {
 String brand;
 int speed;

 public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 public void displayInfo() {
     System.out.println("Vehicle Brand: " + brand);
     System.out.println("Top Speed: " + speed + " km/h");
 }
}

//Derived class
class Car extends Vehicle {
 int doors;

 public Car(String brand, int speed, int doors) {
     super(brand, speed); // Call the parent class constructor
     this.doors = doors;
 }

 @Override
 public void displayInfo() {
     super.displayInfo(); // Call the parent class method
     System.out.println("Number of Doors: " + doors);
 }
}

public class DEmoVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Vehicle vehicle = new Vehicle("Generic Brand", 120);
	     vehicle.displayInfo();

	     System.out.println();

	     Car car = new Car("Toyota", 180, 4);
	     car.displayInfo();

	}

}
