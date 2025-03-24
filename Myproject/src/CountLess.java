
public class CountLess {
	   public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }


		    // Method to check if a number is prime
		 

		    public static void main(String[] args) {
		        // Define the array and value of k
		        int[] array = {12, 3, 5, 7, 18, 29, 14, 4};
		        int k = 10;

		        // Counting numbers less than k and prime
		        int count = 0;
		        for (int num : array) {
		            if (num < k && isPrime(num)) {
		                count++;
		            }
		        }

		        // Displaying the result
		        System.out.println("Number of elements less than " + k + " and prime: " + count);
		   
	}

}
