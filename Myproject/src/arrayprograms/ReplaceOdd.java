package arrayprograms;
import java.util.Scanner;
public class ReplaceOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Asking user for array size
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        int[] arr = new int[n];

		        // Taking user input for array elements
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Replacing odd numbers with -1
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 != 0) {
		                arr[i] = -1;
		            }
		        }

		        // Displaying modified array
		        System.out.println("Modified array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }

		        // Closing scanner
		        scanner.close();
		  

	}

}
