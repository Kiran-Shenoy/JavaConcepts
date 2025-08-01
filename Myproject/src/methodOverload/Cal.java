package methodOverload;
import java.util.Scanner;
public class Cal {
	  public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(double a, double b) {
	        return a + b;
	    }


		

		    // Overloaded methods
		  
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Calculator calc = new Calculator();

		        System.out.print("Enter two integers: ");
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        System.out.println("Sum (int): " + calc.add(x, y));

		        System.out.print("Enter two decimals: ");
		        double p = sc.nextDouble();
		        double q = sc.nextDouble();
		        System.out.println("Sum (double): " + calc.add(p, q));
		   

	}

}
