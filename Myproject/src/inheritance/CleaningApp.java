package inheritance;
import java.util.Scanner;

// Base class
class CleaningService {
    String serviceType;

    public void getServiceDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of cleaning service (e.g., Deep Clean, Regular Clean): ");
        serviceType = scanner.nextLine();
    }

    public void displayService() {
        System.out.println("Cleaning Service Type: " + serviceType);
    }
}

// Derived class
class HomeCleaning extends CleaningService {
    int numberOfRooms;

    public void getHomeDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rooms to clean: ");
        numberOfRooms = scanner.nextInt();
    }

    public void displayHomeCleaningDetails() {
        displayService();
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

public class CleaningApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Main class
		        HomeCleaning homeCleaning = new HomeCleaning();
		        homeCleaning.getServiceDetails();
		        homeCleaning.getHomeDetails();
		        System.out.println("\n--- Cleaning Summary ---");
		        homeCleaning.displayHomeCleaningDetails();
		
	}

}
