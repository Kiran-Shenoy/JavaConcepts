package polymorphism;
import java.util.Scanner;

class Aircraft {
    void fly() {
        System.out.println("The aircraft is flying.");
    }
}

class Jet extends Aircraft {
    @Override
    void fly() {
        System.out.println("The jet accelerates and breaks the sound barrier!");
    }
}

class CommercialPlane extends Aircraft {
    @Override
    void fly() {
        System.out.println("The commercial plane cruises smoothly at high altitude.");
    }
}


public class Jetsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter aircraft type (jet/commercial): ");
		        String aircraftType = scanner.nextLine();

		        Aircraft myAircraft;
		        if (aircraftType.equalsIgnoreCase("jet")) {
		            myAircraft = new Jet();
		        } else if (aircraftType.equalsIgnoreCase("commercial")) {
		            myAircraft = new CommercialPlane();
		        } else {
		            myAircraft = new Aircraft();
		        }

		        myAircraft.fly();  // Calls the overridden method based on runtime object type
		        scanner.close();
		    
	}

}
