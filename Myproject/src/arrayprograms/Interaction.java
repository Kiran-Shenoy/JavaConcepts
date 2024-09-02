package arrayprograms;

import java.util.Scanner;
import java.util.ArrayList;

public class Interaction {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int[] arr1 = {1, 2, 3, 4};
	        int[] arr2 = {3, 4, 5, 6};

	        ArrayList intersection = new ArrayList();

	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    intersection.add(arr1[i]);
	                    break; // Stop searching once a match is found
	                }
	            }
	        }

	        // Print the intersection
	        System.out.println("Intersection: " + intersection);
	    }
	}


