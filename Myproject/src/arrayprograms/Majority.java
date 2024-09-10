package arrayprograms;

import java.util.Scanner;

public class Majority {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		 System.out.println("Enter the size of the array:");
	        int n = scan.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }
	        
	        int majorityElement = findMajorityElement(arr, n);
	        
	        if (majorityElement != -1) {
	            System.out.println("The majority element is: " + majorityElement);
	        } else {
	            System.out.println("No majority element found.");
	        }
	    }
	    
	    // Function to find the majority element
	    public static int findMajorityElement(int[] arr, int n) {
	        int count = 0, candidate = -1;
	        
	        // Phase 1: Find a candidate for majority element
	        for (int i = 0; i < n; i++) {
	            if (count == 0) {
	                candidate = arr[i];
	                count = 1;
	            } else if (arr[i] == candidate) {
	                count++;
	            } else {
	                count--;
	            }
	        }
	        
	        // Phase 2: Verify if the candidate is a majority element
	        count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == candidate) {
	                count++;
	            }
	        }
	        
	        if (count > n / 2) {
	            return candidate;
	        } else {
	            return -1; // No majority element found
	        }
	    }

	}
