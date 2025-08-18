package encapsulation;
import java.util.Scanner;

class Developer {
    // Private fields (Encapsulation)
    private String name;
    private int age;
    private String language;

    // Public setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Public getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        Developer dev = new Developer();

		        // Taking user input
		        System.out.print("Enter developer's name: ");
		        String name = scanner.nextLine();
		        dev.setName(name);

		        System.out.print("Enter developer's age: ");
		        int age = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        dev.setAge(age);

		        System.out.print("Enter developer's favorite programming language: ");
		        String language = scanner.nextLine();
		        dev.setLanguage(language);

		        // Displaying the data using getters
		        System.out.println("\n--- Developer Details ---");
		        System.out.println("Name: " + dev.getName());
		        System.out.println("Age: " + dev.getAge());
		        System.out.println("Language: " + dev.getLanguage());

		        scanner.close();
	}

}
