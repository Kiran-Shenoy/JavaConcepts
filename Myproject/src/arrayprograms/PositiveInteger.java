package arrayprograms;
import java.util.Scanner;
public class PositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]==1)
			{
				count++;
			}
			else
			{
				System.out.println(count);
				count=1;
			}
		}
	
			System.out.print(count);
		}
			
	}

	


