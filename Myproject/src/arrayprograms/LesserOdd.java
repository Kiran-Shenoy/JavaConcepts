package arrayprograms;
import java.util.Scanner;
public class LesserOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);

		        // Input the size of the array
		        System.out.print("Enter the number of elements (n): ");
		        int n = scanner.nextInt();

		        // Initialize the array
		        int[] a = new int[n];
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            a[i] = scanner.nextInt();
		        }

		        // Input the value of k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Variable to count odd numbers less than k
		        int count = 0;

		        // Loop through the array and check the condition
		        for (int i = 0; i < n; i++) {
		            if (a[i] < k && a[i] % 2 != 0) {
		                count++;
		            }
		        }

		        // Output the result
		        System.out.println("Count of odd numbers less than " + k + ": " + count);

		        scanner.close();
		   
	}

}
