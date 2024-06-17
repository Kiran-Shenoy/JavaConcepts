package arrayprograms;
import java.util.Scanner;

public class Jagged2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		int[][] a=new int[2][];
		a[0]=new int[2];
		a[1]=new int[4];
		
	
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=scan.nextInt();	
			}
			
		}
		
	    for(int i=0;i<=a.length-1;i++)
			{
	    	for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
	    	System.out.println();
			}
	}

}
