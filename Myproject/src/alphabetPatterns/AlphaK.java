package alphabetPatterns;
import java.util.Scanner;

public class AlphaK {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(j==n/2 || i+j==n+1 && j>n/2 || i==j && j>n/2)
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
			}// TODO
	}

}
