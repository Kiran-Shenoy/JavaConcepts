package interfaces;


//Define an interface
interface Vehicle {
 void start();  // Abstract method
 void stop();   // Abstract method
}

//Implement the interface in the Car class
class Cars implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Car has stopped.");
 }
}

//Implement the interface in the Bike class
class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Bike has stopped.");
 }
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Vehicle car = new Cars();  // Polymorphism
		     car.start();
		     car.stop();

		     Vehicle bike = new Bike();  // Polymorphism
		     bike.start();
		     bike.stop();
	}

}
