import java.util.Scanner;

public class AlphaD {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(j==1 || i==1 && j>1 && j<n  || i==n &&j>1 && j<n ||  j==n && (i>1 &&i<n))
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
