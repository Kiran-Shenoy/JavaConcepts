package polymorphism;
import java.util.Scanner;

// Base class
class Ceremony {
    void perform() {
        System.out.println("A generic ceremony is being performed.");
    }
}

// Derived class 1
class Wedding extends Ceremony {
    void perform() {
        System.out.println("Performing a beautiful wedding ceremony.");
    }
}

// Derived class 2
class Birthday extends Ceremony {
    void perform() {
        System.out.println("Celebrating a joyful birthday ceremony.");
    }
}

// Derived class 3
class Graduation extends Ceremony {
    void perform() {
        System.out.println("Honoring achievements in a graduation ceremony.");
    }
}

public class CeremonyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the type of ceremony (wedding, birthday, graduation):");
		        String input = scanner.nextLine().toLowerCase();

		        Ceremony ceremony;

		        switch (input) {
		            case "wedding":
		                ceremony = new Wedding();
		                break;
		            case "birthday":
		                ceremony = new Birthday();
		                break;
		            case "graduation":
		                ceremony = new Graduation();
		                break;
		            default:
		                ceremony = new Ceremony();
		                break;
		        }

		        // Polymorphic call
		        ceremony.perform();

		        scanner.close();
		 

	}

}
