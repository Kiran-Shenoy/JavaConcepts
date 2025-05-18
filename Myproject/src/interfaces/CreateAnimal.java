package interfaces;
import java.util.Scanner;

// Define an interface
interface Creature {
    void uniqueTrait();
}

// Implement the interface in a class with a rare name
class Axolotl implements Creature {
    public void uniqueTrait() {
        System.out.println("Axolotl can regenerate limbs and stay in their larval form forever!");
    }
}

class Narwhal implements Creature {
    public void uniqueTrait() {
        System.out.println("Narwhals have long spiral tusks—almost mythical in appearance!");
    }
}

public class CreateAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Get user input
		        System.out.println("Choose a rare creature (axolotl/narwhal): ");
		        String choice = scanner.nextLine().toLowerCase();

		        Creature creature;
		        if (choice.equals("axolotl")) {
		            creature = new Axolotl();
		        } else if (choice.equals("narwhal")) {
		            creature = new Narwhal();
		        } else {
		            System.out.println("Unknown choice! Defaulting to Axolotl.");
		            creature = new Axolotl();
		        }

		        // Call the interface method
		        creature.uniqueTrait();

		        scanner.close();
		   

	}

}
