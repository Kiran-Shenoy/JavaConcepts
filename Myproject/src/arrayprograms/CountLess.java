package arrayprograms;

import java.util.Scanner;

public class CountLess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner scanner = new Scanner(System.in);

        // Take input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Take input for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Take input for k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Count elements less than k
        int count = 0;
        for (int num : arr) {
            if (num < k) {
                count++;
            }
        }

        // Display the result
        System.out.println("Number of elements less than " + k + " is: " + count);

        scanner.close();
    
	}

}
