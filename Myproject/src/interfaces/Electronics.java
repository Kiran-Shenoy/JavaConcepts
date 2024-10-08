package interfaces;

//Define the interface
interface Device {
 void turnOn();
 void turnOff();
}

//Class that implements the Device interface
class Laptop implements Device {
 public void turnOn() {
     System.out.println("Laptop is turned ON.");
 }

 public void turnOff() {
     System.out.println("Laptop is turned OFF.");
 }
}

//Another class that implements the Device interface
class Smartphone implements Device {
 public void turnOn() {
     System.out.println("Smartphone is turned ON.");
 }

 public void turnOff() {
     System.out.println("Smartphone is turned OFF.");
 }
}

  

public class Electronics {

	public static void main(String[] args) {
		   Device laptop = new Laptop();
		     Device smartphone = new Smartphone();

		     // Call the methods
		     laptop.turnOn();
		     laptop.turnOff();

		     smartphone.turnOn();
		     smartphone.turnOff();
		 }
		}
