package polymorphism;
import java.util.Scanner;


class Home {
    void displayInfo() {
        System.out.println("This is a generic home.");
    }
}

class Apartment extends Home {
    void displayInfo() {
        System.out.println("This is an apartment.");
    }
}

class Villa extends Home {
    void displayInfo() {
        System.out.println("This is a villa.");
    }
}

public class HomePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter home type (Apartment/Villa): ");
		        String homeType = scanner.nextLine();

		        Home home;

		        if ("Apartment".equalsIgnoreCase(homeType)) {
		            home = new Apartment();
		        } else if ("Villa".equalsIgnoreCase(homeType)) {
		            home = new Villa();
		        } else {
		            home = new Home();
		        }

		        home.displayInfo();

		        scanner.close();
		    
	}

}
