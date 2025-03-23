package arrayprograms;
import java.util.Scanner;
public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner sc = new Scanner(System.in);

		        // Taking input for array size
		        System.out.println("Enter the size of the array:");
		        int size = sc.nextInt();

		        // Initializing array
		        int[] arr = new int[size];
		        System.out.println("Enter " + size + " elements of the array:");

		        // Reading array elements
		        for (int i = 0; i < size; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Calling the method to find the missing number
		        int missingNumber = findMissingNumber(arr, size);
		        System.out.println("The missing number is: " + missingNumber);

		        sc.close();
		    }

		    // Method to find the missing number
		    public static int findMissingNumber(int[] arr, int size) {
		        int sumArray = 0;
		        for (int num : arr) {
		            sumArray += num;
		        }

		        int n = size + 1; // Including the missing number
		        int expectedSum = n * (n + 1) / 2;

		        return expectedSum - sumArray;
		   

	}

}
