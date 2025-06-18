package collections;
// TODO Auto-generated method stub
import java.util.*;

class Mansion {
    String name;
    int rooms;
    boolean hasSwimmingPool;
    int windows;

    Mansion(String name, int rooms, boolean hasSwimmingPool, int windows) {
        this.name = name;
        this.rooms = rooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Mansion{Name='" + name + "', Rooms=" + rooms + ", Has Swimming Pool=" + hasSwimmingPool + ", Windows=" + windows + "}";
    }
}

class Apartment {
    String name;
    int floors;
    int windows;

    Apartment(String name, int floors, int windows) {
        this.name = name;
        this.floors = floors;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Apartment{Name='" + name + "', Floors=" + floors + ", Windows=" + windows + "}";
    }
}

class Villa {
    String name;
    boolean hasGarden;
    int windows;

    Villa(String name, boolean hasGarden, int windows) {
        this.name = name;
        this.hasGarden = hasGarden;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Villa{Name='" + name + "', Has Garden=" + hasGarden + ", Windows=" + windows + "}";
    }
}

class Cottage {
    String name;
    String location;
    int windows;

    Cottage(String name, String location, int windows) {
        this.name = name;
        this.location = location;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Cottage{Name='" + name + "', Location='" + location + "', Windows=" + windows + "}";
    }
}

public class HouseCollections {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);
		        List<Object> houses = new ArrayList<>();

		        System.out.println("Enter 'Mansion', 'Apartment', 'Villa', or 'Cottage' to add a house (or 'exit' to finish):");

		        while (true) {
		            System.out.print("Enter house type: ");
		            String type = scanner.nextLine();

		            if (type.equalsIgnoreCase("exit")) {
		                break;
		            }

		            System.out.print("Enter name: ");
		            String name = scanner.nextLine();
		            System.out.print("Enter number of windows: ");
		            int windows = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            if (type.equalsIgnoreCase("Mansion")) {
		                System.out.print("Enter number of rooms: ");
		                int rooms = scanner.nextInt();
		                System.out.print("Does it have a swimming pool? (true/false): ");
		                boolean hasSwimmingPool = scanner.nextBoolean();
		                scanner.nextLine(); // Consume newline
		                houses.add(new Mansion(name, rooms, hasSwimmingPool, windows));
		            } else if (type.equalsIgnoreCase("Apartment")) {
		                System.out.print("Enter number of floors: ");
		                int floors = scanner.nextInt();
		                scanner.nextLine(); // Consume newline
		                houses.add(new Apartment(name, floors, windows));
		            } else if (type.equalsIgnoreCase("Villa")) {
		                System.out.print("Does it have a garden? (true/false): ");
		                boolean hasGarden = scanner.nextBoolean();
		                scanner.nextLine(); // Consume newline
		                houses.add(new Villa(name, hasGarden, windows));
		            } else if (type.equalsIgnoreCase("Cottage")) {
		                System.out.print("Enter location: ");
		                String location = scanner.nextLine();
		                houses.add(new Cottage(name, location, windows));
		            } else {
		                System.out.println("Invalid input! Try again.");
		            }
		        }

		        System.out.println("\nStored Houses:");
		        for (Object house : houses) {
		            System.out.println(house);
		        }

		        scanner.close();
		   
	}

}
