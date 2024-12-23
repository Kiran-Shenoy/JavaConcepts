package inheritance;

//Base class
class Appliances {
 String brand;
 int power;

 public void turnOn() {
     System.out.println("The appliance is now ON.");
 }

 public void turnOff() {
     System.out.println("The appliance is now OFF.");
 }
}

//Derived class
class WashingMachines extends Appliances {
 int capacity; // in kilograms

 public void startWashCycle() {
     System.out.println("The washing cycle has started.");
  }
}

public class Applicant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Create an object of the derived class
	     WashingMachines myMachine = new WashingMachines();
	     myMachine.brand = "LG";
	     myMachine.power = 1500; // in watts
	     myMachine.capacity = 7; // in kilograms

	     // Access methods and properties
	     System.out.println("Brand: " + myMachine.brand);
	     System.out.println("Power: " + myMachine.power + "W");
	     System.out.println("Capacity: " + myMachine.capacity + "kg");
	     myMachine.turnOn();
	     myMachine.startWashCycle();
	     myMachine.turnOff();

	}

}
