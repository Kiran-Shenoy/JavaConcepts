package arrayprograms;
import java.util.Scanner;
public class Arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int  n=scan.nextInt();
		int []a= new int[n];
		int []b=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
	           a[i]=scan.nextInt();
		}
		
		for(int j=0;j<b.length;j++)
	    {
				a[j]=scan.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
