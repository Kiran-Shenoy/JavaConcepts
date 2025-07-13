package polymorphism;
// TODO Auto-generated method stub
import java.util.Scanner;

// Base class
class Party {
    void agenda() {
        System.out.println("General party agenda.");
    }
}

// Subclasses
class PartyA extends Party {
    void agenda() {
        System.out.println("Party A focuses on economic reforms.");
    }
}

class PartyB extends Party {
    void agenda() {
        System.out.println("Party B emphasizes environmental policies.");
    }
}

class PartyC extends Party {
    void agenda() {
        System.out.println("Party C promotes social welfare programs.");
    }
}
public class Election {

	public static void main(String[] args) {
	

	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter party name (A, B, C): ");
		        String input = scanner.nextLine().toUpperCase();

		        Party party;

		        switch (input) {
		            case "A":
		                party = new PartyA();
		                break;
		            case "B":
		                party = new PartyB();
		                break;
		            case "C":
		                party = new PartyC();
		                break;
		            default:
		                party = new Party();
		                break;
		        }

		        party.agenda(); // Polymorphic call
		        scanner.close();
		   

	}

}
