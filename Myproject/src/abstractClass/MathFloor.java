package abstractClass;

import java.util.Scanner;

public class MathFloor {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int E1=scan.nextInt();
		int T1=scan.nextInt();
	    int E2=scan.nextInt();
	    
	    int T2=scan.nextInt();
	    
	    
	    double p1=Math.floor(E1/T1);
	    double p2=Math.floor(E2/T2);
	    
	    System.out.println(p1+p2);
	}

}
