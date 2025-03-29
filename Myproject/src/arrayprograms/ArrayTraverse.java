package arrayprograms;

public class ArrayTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Define the input values
		        int[] array = {10, 5, 20, 7, 12};
		        int threshold = 15;
		        
		        // Initialize the count variable
		        int oddCountBelowThreshold = 0;

		        // Traverse the array and apply the conditions
		        for (int number : array) {
		            if (number < threshold && number % 2 != 0) {
		                oddCountBelowThreshold++;
		            }
		        }

		        // Output the result
		        System.out.println("Number of odd elements less than " + threshold + ": " + oddCountBelowThreshold);
		   


	}

}
