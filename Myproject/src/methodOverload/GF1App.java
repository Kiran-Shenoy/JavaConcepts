package methodOverload;
import java.util.Scanner;

class GF1 {
    // Overloaded method: sum of two integers
    void calculate(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    // Overloaded method: sum of two floats
    void calculate(float a, float b) {
        System.out.println("Sum (float): " + (a + b));
    }

    // Overloaded method: concatenating two strings
    void calculate(String a, String b) {
        System.out.println("Concatenated String: " + a + b);
    }

    // Overloaded method: sum of three integers
    void calculate(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}

public class GF1App {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        GF1 gf = new GF1();

		        System.out.print("Enter two integers: ");
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        gf.calculate(x, y);

		        System.out.print("Enter two floats: ");
		        float fx = sc.nextFloat();
		        float fy = sc.nextFloat();
		        gf.calculate(fx, fy);

		        sc.nextLine(); // consume newline left-over
		        System.out.print("Enter two strings: ");
		        String s1 = sc.nextLine();
		        String s2 = sc.nextLine();
		        gf.calculate(s1, s2);

		        System.out.print("Enter three integers: ");
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = sc.nextInt();
		        gf.calculate(a, b, c);
		    

	}

}
