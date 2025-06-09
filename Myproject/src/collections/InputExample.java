package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<String> names = new ArrayList<>();

		        System.out.println("Enter 5 names:");

		        for (int i = 0; i < 5; i++) {
		            System.out.print("Enter name " + (i + 1) + ": ");
		            String name = scanner.nextLine();
		            names.add(name);
		        }

		        System.out.println("\nYou entered:");
		        for (String name : names) {
		            System.out.println(name);
		        }

		        scanner.close();
	

	}

}
