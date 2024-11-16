package inheritance;


//Base class
class Appliance {
 String brand;
 int power;

 public Appliance(String brand, int power) {
     this.brand = brand;
     this.power = power;
 }

 public void showDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Power: " + power + " watts");
 }

 public void turnOn() {
     System.out.println("The appliance is now on.");
 }
}

//Derived class
class WashingMachine extends Appliance {
 int loadCapacity;

 public WashingMachine(String brand, int power, int loadCapacity) {
     super(brand, power); // Calls the constructor of the base class
     this.loadCapacity = loadCapacity;
 }

 public void showDetails() {
     super.showDetails(); // Calls the method from the base class
     System.out.println("Load Capacity: " + loadCapacity + " kg");
 }

 @Override
 public void turnOn() {
     System.out.println("The washing machine is now running.");
 }
}

//Another derived class
class Refrigerator extends Appliance {
 double volume;

 public Refrigerator(String brand, int power, double volume) {
     super(brand, power);
     this.volume = volume;
 }

 public void showDetails() {
     super.showDetails();
     System.out.println("Volume: " + volume + " liters");
 
     }
}

public class ApplianceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine wm = new WashingMachine("Samsung", 1500, 7);
	     wm.turnOn();
	     wm.showDetails();

	     System.out.println();

	     Refrigerator fridge = new Refrigerator("LG", 200, 300.5);
	     fridge.turnOn();
	     fridge.showDetails();
	 
	}

}
