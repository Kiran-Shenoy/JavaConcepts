package encapsulation;
import java.util.Scanner;

// Encapsulated class
class Copilot {
    // Private fields
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class CopilptMain {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        Copilot copilot = new Copilot();

		        // Taking user input
		        System.out.print("Enter name: ");
		        String name = scanner.nextLine();
		        copilot.setName(name);

		        System.out.print("Enter age: ");
		        int age = scanner.nextInt();
		        copilot.setAge(age);

		        // Displaying the data
		        System.out.println("\n--- Copilot Info ---");
		        System.out.println("Name: " + copilot.getName());
		        System.out.println("Age: " + copilot.getAge());

		        scanner.close();
		

	}

}
