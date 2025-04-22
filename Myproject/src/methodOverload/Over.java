package methodOverload;
import java.util.Scanner;

class Parent {
    void showMessage() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
   
    void showMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String userMessage = scanner.nextLine();
        System.out.println("Child class method says: " + userMessage);
        scanner.close();
    }
}

public class Over {

	
		    public static void main(String[] args) {
		        Parent obj = new Child(); // Upcasting
		        obj.showMessage();
		   
	}

}
