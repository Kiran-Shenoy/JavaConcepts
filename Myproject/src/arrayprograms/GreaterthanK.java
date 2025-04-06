package arrayprograms;
import java.util.Scanner;
public class GreaterthanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Get array size
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        int[] arr = new int[n];

		        // Get array elements
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Get the threshold value k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Count elements greater than k
		        int count = 0;
		        for (int num : arr) {
		            if (num > k) {
		                count++;
		            }
		        }

		        // Display the result
		        System.out.println("Number of elements greater than " + k + ": " + count);
		        
		        scanner.close();
		   

	}

}
