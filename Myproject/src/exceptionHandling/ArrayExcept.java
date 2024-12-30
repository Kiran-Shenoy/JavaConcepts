package exceptionHandling;


public class ArrayExcept {

	public static void main(String[] args) {
		        int[] numbers = {1, 2, 3};

		        try {
		            System.out.println("Accessing element at index 3: " + numbers[3]); // Invalid index
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: Index out of bounds! Please check the array size.");
		        } finally {
		            System.out.println("Array access attempt completed.");
		        }
		  


	}

}
