package Singleton;

public class UserInput {
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    

		   
		UserInput calc = new UserInput();
		        
		        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
		        System.out.println("Sum of 3 integers: " + calc.add(2, 3, 4));
		        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));
		   
	}

}
