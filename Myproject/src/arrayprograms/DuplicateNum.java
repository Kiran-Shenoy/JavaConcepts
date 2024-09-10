package arrayprograms;

import java.util.Scanner;

public class DuplicateNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int duplicate = -1; // To store the duplicate value

     
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
        }
        
      
        if (duplicate != -1) {
            System.out.println("Duplicate number is: " + duplicate);
        } else {
            System.out.println("No duplicate found.");
        }

	}

}
