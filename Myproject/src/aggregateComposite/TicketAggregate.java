package aggregateComposite;
//TODO Auto-generated method stub
		import java.util.*;

		class Ticket {
		    String eventName;
		    double price;

		    public Ticket(String eventName, double price) {
		        this.eventName = eventName;
		        this.price = price;
		    }

		    public double getPrice() {
		        return price;
		    }

		    public String getEventName() {
		        return eventName;
		    }
		}

public class TicketAggregate {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        List<Ticket> tickets = new ArrayList<>();

		        System.out.print("Enter number of tickets: ");
		        int n = scanner.nextInt();
		        scanner.nextLine(); // consume newline

		        for (int i = 0; i < n; i++) {
		            System.out.println("Enter details for ticket " + (i + 1));
		            System.out.print("Event name: ");
		            String eventName = scanner.nextLine();
		            System.out.print("Price: ");
		            double price = scanner.nextDouble();
		            scanner.nextLine(); // consume newline

		            tickets.add(new Ticket(eventName, price));
		        }

		        // Aggregate calculations
		        double total = 0;
		        double max = Double.MIN_VALUE;
		        double min = Double.MAX_VALUE;

		        for (Ticket ticket : tickets) {
		            double price = ticket.getPrice();
		            total += price;
		            if (price > max) max = price;
		            if (price < min) min = price;
		        }

		        double average = (n > 0) ? total / n : 0;

		        System.out.println("\n--- Aggregate Results ---");
		        System.out.printf("Total Price: ₹%.2f\n", total);
		        System.out.printf("Average Price: ₹%.2f\n", average);
		        System.out.printf("Highest Price: ₹%.2f\n", max);
		        System.out.printf("Lowest Price: ₹%.2f\n", min);
		 

	}

}
