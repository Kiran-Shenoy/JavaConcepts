package methodOverload;
import java.util.Scanner;
public class UserEXample {
	


	    void display(int num) {
	        System.out.println("You entered integer: " + num);
	    }

	    void display(String text) {
	        System.out.println("You entered string: " + text);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        UserEXample obj = new UserEXample();

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        scanner.nextLine();  // Consume newline

	        System.out.print("Enter a string: ");
	        String text = scanner.nextLine();

	        obj.display(number);
	        obj.display(text);

	        scanner.close();
	    }
	}

	