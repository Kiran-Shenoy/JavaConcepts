package inheritance;
import java.util.Scanner;

class Mobile {
    String brand;
    String model;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        brand = scanner.nextLine();
        System.out.print("Enter model: ");
        model = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Smartphone extends Mobile {
    String os;

    public void inputSmartphoneDetails() {
        inputDetails(); // Call base class method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operating system: ");
        os = scanner.nextLine();
    }

    public void displaySmartphoneDetails() {
        displayDetails(); // Call base class method
        System.out.println("Operating System: " + os);
    }
}

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Smartphone phone = new Smartphone();
		        phone.inputSmartphoneDetails();
		        System.out.println("\nSmartphone Details:");
		        phone.displaySmartphoneDetails();
		  

	}

}
