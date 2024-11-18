package staticConcept;



public class MAthOperations {
	 // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum = MAthOperations.add(5, 3);
	        int difference = MAthOperations.subtract(10, 4);

	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	   
	}

}
