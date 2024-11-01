package interfaces;


//Define the Appliance interface
interface Appliance {
 void turnOn();
}

//Fan class implements Appliance interface
class Fan implements Appliance {
 public void turnOn() {
     System.out.println("The fan is now on.");
 }
}

//Light class implements Appliance interface
class Light implements Appliance {
 public void turnOn() {
     System.out.println("The light is now on.");
 
    
 }
}

public class ApplianceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Appliance fan = new Fan();
	     Appliance light = new Light();
	     
	     fan.turnOn();
	     light.turnOn();
	}

}
