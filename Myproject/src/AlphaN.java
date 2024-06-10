import java.util.Scanner;

public class AlphaN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n || i==j)
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
