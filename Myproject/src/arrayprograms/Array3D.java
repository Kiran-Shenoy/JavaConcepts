package arrayprograms;
import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
		int[][][] a=new int[2][2][4];
		
	
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
					a[i][j][k]=scan.nextInt();	
				}
			}
			
		}
		
	    for(int i=0;i<=a.length-1;i++)
			{
	    	for(int j=0;j<=a[i].length-1;j++)
			{
	    	  for(int k=0;k<=a[i][j].length-1;k++)
	    	  {
                  System.out.print(a[i][j][k]+" ");
			}
	    	  System.out.println();
			}
	    	System.out.println();
			}
	}

}
