package inheritance;
import java.util.Scanner;

class Bus {
    String busNumber;
    int capacity;

    public Bus(String busNumber, int capacity) {
        this.busNumber = busNumber;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Capacity: " + capacity);
    }
}

class LuxuryBus extends Bus {
    String amenities;
    double ticketPrice;

    public LuxuryBus(String busNumber, int capacity, String amenities, double ticketPrice) {
        super(busNumber, capacity);  // Calls Bus constructor
        this.amenities = amenities;
        this.ticketPrice = ticketPrice;
    }

    public void displayLuxuryBusInfo() {
        displayInfo();  // Calls display method from Bus
        System.out.println("Amenities: " + amenities);
        System.out.println("Ticket Price: ₹" + ticketPrice);
    }
}

public class BusInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter Bus Number: ");
		        String busNumber = scanner.nextLine();

		        System.out.print("Enter Capacity: ");
		        int capacity = scanner.nextInt();
		        scanner.nextLine(); // Consume newline

		        System.out.print("Enter Amenities: ");
		        String amenities = scanner.nextLine();

		        System.out.print("Enter Ticket Price: ");
		        double ticketPrice = scanner.nextDouble();

		        //LuxuryBus luxuryBus = new LuxuryBus(busNumber, capacity, amenities, ticket
	}

}
