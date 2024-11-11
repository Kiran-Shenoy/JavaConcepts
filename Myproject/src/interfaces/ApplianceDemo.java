package interfaces;

//Interface definition
interface Appliances {
 void turnOn();
 void turnOff();
}

//Class implementing the interface
class WashingMachine implements Appliances {
 @Override
 public void turnOn() {
     System.out.println("Washing Machine is now ON.");
 }
 
 @Override
 public void turnOff() {
     System.out.println("Washing Machine is now OFF.");
 }
}

//Another class implementing the interface
class Refrigerator implements Appliances {
 @Override
 public void turnOn() {
     System.out.println("Refrigerator is now ON.");
 }
 
 @Override
 public void turnOff() {
     System.out.println("Refrigerator is now OFF.");
 }
}


  

public class ApplianceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Appliances myWasher = new WashingMachine();
		     Appliances myFridge = new Refrigerator();
		     
		     // Turning on and off the appliances
		     myWasher.turnOn();
		     myWasher.turnOff();
		     
		     myFridge.turnOn();
		     myFridge.turnOff();
		 
	}

}
