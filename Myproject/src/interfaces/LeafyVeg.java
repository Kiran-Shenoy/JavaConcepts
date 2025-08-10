package interfaces;
// TODO Auto-generated method stub
import java.util.Scanner;

// Interface
interface Leafy {
    void speak();
    void funFact();
}

// Maple class implementing Leafy
class Maple implements Leafy {
    public void speak() {
        System.out.println("Rustle rustle! 🍁");
    }

    public void funFact() {
        System.out.println("Maple trees produce the sap used to make maple syrup!");
    }
}

// Fern class implementing Leafy
class Fern implements Leafy {
    public void speak() {
        System.out.println("Whisper whisper! 🌿");
    }

    public void funFact() {
        System.out.println("Ferns are among the oldest plants on Earth, dating back over 360 million years!");
    }
}
public class LeafyVeg {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose a leafy plant (maple/fern): ");
		        String choice = scanner.nextLine().trim().toLowerCase();

		        Leafy plant;

		        switch (choice) {
		            case "maple":
		                plant = new Maple();
		                break;
		            case "fern":
		                plant = new Fern();
		                break;
		            default:
		                System.out.println("Unknown plant. Defaulting to maple.");
		                plant = new Maple();
		        }

		        System.out.println("Class used: " + plant.getClass().getSimpleName());
		        plant.speak();
		        plant.funFact();

		        scanner.close();
		   

	}

}
