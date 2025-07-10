package polymorphism;
import java.util.Scanner;

// Base class
class Marriage {
    public void marriageDetails() {
        System.out.println("General details about marriage.");
    }
}

// Derived class 1
class ArrangeMarriage extends Marriage {
    public void marriageDetails() {
        System.out.println("This is an arranged marriage with family involvement.");
    }
}

// Derived class 2
class LoveMarriage extends Marriage {
    public void marriageDetails() {
        System.out.println("This is a love marriage based on personal choice.");
    }
}


public class MarriageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter type of marriage (arrange/love): ");
		        String input = scanner.nextLine().toLowerCase();

		        Marriage marriage;

		        switch (input) {
		            case "arrange":
		                marriage = new ArrangeMarriage();
		                break;
		            case "love":
		                marriage = new LoveMarriage();
		                break;
		            default:
		                marriage = new Marriage();
		                System.out.println("Unknown type, showing general details.");
		        }

		        marriage.marriageDetails(); // Polymorphic call
		   

	}

}
