package interfaces;
import java.util.Scanner;

// Define the interface
interface Divine {
    void enter(String name);
}

// Implement the interface in the Heaven class
class Heaven implements Divine {
    public void enter(String name) {
        System.out.println("Welcome to Heaven, " + name + "!");
    }
}

public class Devine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Main class to take user input
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String userName = scanner.nextLine();

		        Divine place = new Heaven();
		        place.enter(userName);
		  

	}

}
