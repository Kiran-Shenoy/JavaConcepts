package arrayprograms;
import java.util.Scanner;
public class CountGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        // Get user input for the size of the array
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        // Get user input for the array elements
		        int[] numbers = new int[n];
		        System.out.println("Enter the numbers: ");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        // Get the value of k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Count primes greater than k
		        int count = 0;
		        for (int num : numbers) {
		            if (num > k && isPrime(num)) {
		                count++;
		            }
		        }

		        // Output the result
		        System.out.println("Count of prime numbers greater than " + k + ": " + count);
		    }

		    // Method to check if a number is prime
		    private static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		   
	}

}
