package staticConcept;
import java.util.Scanner;

class Shoe {
    static int totalShoes = 0; // Static variable to track total shoes
    String brand;
    String type;
    double price;

    Shoe(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        totalShoes++;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Type: " + type + ", Price: ₹" + price);
    }

    static void displayTotalShoes() {
        System.out.println("Total Shoes in Inventory: " + totalShoes);
    }
}
public class ShoeStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner sc = new Scanner(System.in);

		        System.out.print("How many shoes do you want to add? ");
		        int count = sc.nextInt();
		        sc.nextLine(); // Clear buffer

		        Shoe[] inventory = new Shoe[count];

		        for (int i = 0; i < count; i++) {
		            System.out.println("\nEnter details for Shoe " + (i + 1));
		            System.out.print("Brand: ");
		            String brand = sc.nextLine();

		            System.out.print("Type (e.g. Sneaker, Boot): ");
		            String type = sc.nextLine();

		            System.out.print("Price: ₹");
		            double price = sc.nextDouble();
		            sc.nextLine(); // Clear buffer

		            inventory[i] = new Shoe(brand, type, price);
		        }

		        System.out.println("\n🧾 Shoe Inventory:");
		        for (Shoe s : inventory) {
		            s.displayInfo();
		        }

		        System.out.println();
		        Shoe.displayTotalShoes(); // Static method called using class name

		        sc.close();
		    
	}

}
