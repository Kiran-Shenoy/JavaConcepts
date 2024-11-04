package inheritance;

//Superclass
class Vehicle {
 // Vehicle attributes
 String brand;
 int speed;

 // Vehicle constructor
 public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 // Method to display vehicle information
 public void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

//Subclass inheriting from Vehicle
class Car extends Vehicle {
 int doors;

 // Constructor for Car
 public Car(String brand, int speed, int doors) {
     super(brand, speed); // Calling superclass (Vehicle) constructor
     this.doors = doors;
 }

 // Method to display car information
 public void displayCarInfo() {
     displayInfo(); // Call superclass method
     System.out.println("Number of Doors: " + doors);

     Car car = new Car("Toyota", 120, 4);
     car.displayCarInfo(); // Display information about the car
 }
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota", 120, 4);
	     car.displayCarInfo(); // Display information about the car
	 
	}

}
