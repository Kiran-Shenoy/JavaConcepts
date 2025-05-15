package polymorphism;
import java.util.Scanner;

class House {
    void displayInfo() {
        System.out.println("This is a house.");
    }
}

class Villas extends House {
    void displayInfo() {
        System.out.println("This is a luxurious villa.");
    }
}

class Apartments extends House {
    void displayInfo() {
        System.out.println("This is an apartment.");
    }
}

class Cottage extends House {
    void displayInfo() {
        System.out.println("This is a cozy cottage.");
    }
}
public class Staying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the type of house (Villa/Apartment/Cottage): ");
		        String houseType = scanner.nextLine();
		        scanner.close();

		        House house;

		        switch (houseType.toLowerCase()) {
		            case "villa":
		                house = new Villas();
		                break;
		            case "apartment":
		                house = new Apartments();
		                break;
		            case "cottage":
		                house = new Cottage();
		                break;
		            default:
		                house = new House();
		                System.out.println("Unknown house type, defaulting to a generic house.");
		        }

		        house.displayInfo();
		   

	}

}
