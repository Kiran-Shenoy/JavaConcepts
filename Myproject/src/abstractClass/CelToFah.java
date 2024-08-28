package abstractClass;

import java.util.Scanner;

public class CelToFah {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int cel= scan.nextInt();
		
		
		double F = (cel * (9.0/5)) + 32;
		
		System.out.println(F);

	}

}
