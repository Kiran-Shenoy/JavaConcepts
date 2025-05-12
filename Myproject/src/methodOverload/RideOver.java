package methodOverload;
import java.util.Scanner;

// Parent class
class Vehicle {
    void startEngine() {
        System.out.println("The vehicle's engine is starting...");
    }
}

// Child class overriding the method
class Car extends Vehicle {
  
    void startEngine() {
        System.out.println("Car engine starts: Vroom vroom!");
    }
}

// Another child class
class Bike extends Vehicle {
 
    void startEngine() {
        System.out.println("Bike engine starts: Brrr brrr!");
    }
}

public class RideOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter 'car' or 'bike' to start its engine: ");
		        String input = scanner.nextLine();
	}

}
