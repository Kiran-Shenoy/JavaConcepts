package alphabetPatterns;
import java.util.Scanner;

public class AlphaU {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1&&  i<n || j==n && i<n|| i==n &&(j>1 && j<n))
				{
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
		}

	}

}
