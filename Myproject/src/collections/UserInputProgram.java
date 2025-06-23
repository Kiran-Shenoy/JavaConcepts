package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<String> items = new ArrayList<>();

		        System.out.println("Enter items (type 'exit' to stop):");
		        while (true) {
		            String input = scanner.nextLine();
		            if (input.equalsIgnoreCase("exit")) {
		                break;
		            }
		            items.add(input);
		        }

		        System.out.println("You entered:");
		        for (String item : items) {
		            System.out.println(item);
		        }

		        scanner.close();
		    

	}

}
