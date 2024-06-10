import java.util.Scanner;

public class AlphaJ {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if( i==1 || j==n/2 || i==n &&  (j>1 &&  j<n/2)|| j==1 && (i>=(3*n)/4))
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
