package collections;
import java.util.ArrayList;
import java.util.Scanner;

class HousingCeremony {
    private String guestName;
    private String relation;
    private int age;

    // Constructor
    public HousingCeremony(String guestName, String relation, int age) {
        this.guestName = guestName;
        this.relation = relation;
        this.age = age;
    }

    // Display method
    public void displayGuest() {
        System.out.println("Name: " + guestName + ", Relation: " + relation + ", Age: " + age);
    }
}
public class CeremonyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<HousingCeremony> guestList = new ArrayList<>();

		        System.out.print("Enter number of guests: ");
		        int numGuests = scanner.nextInt();
		        scanner.nextLine(); // Consume newline

		        for (int i = 0; i < numGuests; i++) {
		            System.out.println("\nEnter details for Guest " + (i + 1) + ":");

		            System.out.print("Name: ");
		            String name = scanner.nextLine();

		            System.out.print("Relation: ");
		            String relation = scanner.nextLine();

		            System.out.print("Age: ");
		            int age = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            HousingCeremony guest = new HousingCeremony(name, relation, age);
		            guestList.add(guest);
		        }

		        System.out.println("\n🎉 Guest List for Housing Ceremony:");
		        for (HousingCeremony guest : guestList) {
		            guest.displayGuest();
		        }

		        scanner.close();
	

	}

}
