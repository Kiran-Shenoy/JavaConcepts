package alphabetPatterns;
import java.util.Scanner;

public class ALphaV {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 && i<=n/2 || j==n && i<=n/2 || i-j == n/2 || i+ j== n+n/2+ 1 )
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
