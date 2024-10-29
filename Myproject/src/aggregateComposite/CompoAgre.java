package aggregateComposite;


//Engine class (part of Car)
class Engine {
 String type;

 Engine(String type) {
     this.type = type;
 }
}

//Car class contains Engine (Composition)
class Car {
 String model;
 Engine engine;

 Car(String model, String engineType) {
     this.model = model;
     this.engine = new Engine(engineType); // Engine is created with Car
 }

 public void displayDetails() {
     System.out.println("Car Model: " + model);
     System.out.println("Engine Type: " + engine.type);
 
    
 }
}

public class CompoAgre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car("Tesla Model S", "Electric");
	     car.displayDetails();
	}

}
