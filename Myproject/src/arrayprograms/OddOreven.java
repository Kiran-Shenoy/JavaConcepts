package arrayprograms;
import java.util.Scanner;
public class OddOreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        
		        // Get number of elements
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        
		        int[] numbers = new int[n];
		        
		        // Get user input
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }
		        
		        System.out.println("\nEven elements:");
		        for (int num : numbers) {
		            if (num % 2 == 0) {
		                System.out.print(num + " ");
		            }
		        }

		        System.out.println("\nOdd elements:");
		        for (int num : numbers) {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");
		            }
		        }

		        scanner.close();
		    

	}

}
