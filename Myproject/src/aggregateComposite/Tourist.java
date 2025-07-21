package aggregateComposite;
import java.util.Scanner;

class Tourist {
    // Inner method g(x) — for example, g(x) = x + 5
    public int g(int x) {
        return x + 5;
    }

    // Inner method f(x) — for example, f(x) = 2 * x
    public int f(int x) {
        return 2 * x;
    }

    // Composite method f(g(x))
    public int compositeFunction(int x) {
        return f(g(x));
    }

 


		// TODO Auto-generated method stub
		   public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Tourist tourist = new Tourist();

		        System.out.print("Enter a value for x: ");
		        int x = scanner.nextInt();

		        int result = tourist.compositeFunction(x);
		        System.out.println("Result of f(g(x)) is: " + result);
		        
		        scanner.close();
		   

	}

}
