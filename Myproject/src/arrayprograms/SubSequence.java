package arrayprograms;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n1=scan.nextInt();
		int arr1[]=new int[n1];
		for(int j=0;j<arr1.length;j++)
		{
			arr1[j]=scan.nextInt();		
		}
		
		int n2=scan.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=scan.nextInt();		
		}
		
		 boolean isSubsequence = isSubsequence(arr1, arr2);
	        
	       
	        if (isSubsequence) {
	            System.out.println("The first array is a subsequence of the second array.");
	        } else {
	            System.out.println("The first array is NOT a subsequence of the second array.");
	        }
	    }
	    
	  
	    public static boolean isSubsequence(int[] arr1, int[] arr2) {
	        int j = 0;
	        
	        // Traverse arr2
	        for (int i = 0; i < arr2.length; i++) {
	            if (j < arr1.length && arr2[i] == arr1[j]) {
	                j++;
	            }
	        }
	        
	        // If all elements of arr1 are found in arr2 in the correct order
	        return j == arr1.length;
	    }
}
