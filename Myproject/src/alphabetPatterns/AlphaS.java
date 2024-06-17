package alphabetPatterns;
import java.util.Scanner;

public class AlphaS {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==1 && (j>1 && j<n ) || i==n/2 && (j>1 && j<n ) || i==n && (j>1 && j<n ) || j==1 && (i>1 && i<n/2) || j==n && (i>n/2 && i<n) )
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
