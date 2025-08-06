package aggregateComposite;
import java.util.*;

class Battery {
    String model;
    int capacity; // in mAh

    Battery(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }
}

public class BatteryStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        List<Battery> batteries = new ArrayList<>();

		        System.out.print("Enter number of batteries: ");
		        int n = scanner.nextInt();
		        scanner.nextLine(); // consume newline

		        for (int i = 0; i < n; i++) {
		            System.out.println("Battery " + (i + 1) + ":");
		            System.out.print("Model name: ");
		            String model = scanner.nextLine();
		            System.out.print("Capacity (mAh): ");
		            int capacity = scanner.nextInt();
		            scanner.nextLine(); // consume newline

		            batteries.add(new Battery(model, capacity));
		        }

		        // Aggregate functions
		        int totalCapacity = 0;
		        int maxCapacity = Integer.MIN_VALUE;
		        int minCapacity = Integer.MAX_VALUE;

		        for (Battery b : batteries) {
		            totalCapacity += b.capacity;
		            if (b.capacity > maxCapacity) maxCapacity = b.capacity;
		            if (b.capacity < minCapacity) minCapacity = b.capacity;
		        }

		        double averageCapacity = (n > 0) ? (double) totalCapacity / n : 0;

		        System.out.println("\n🔋 Battery Statistics:");
		        System.out.println("Total Capacity: " + totalCapacity + " mAh");
		        System.out.println("Average Capacity: " + averageCapacity + " mAh");
		        System.out.println("Maximum Capacity: " + maxCapacity + " mAh");
		        System.out.println("Minimum Capacity: " + minCapacity + " mAh");
		   
	}

}
