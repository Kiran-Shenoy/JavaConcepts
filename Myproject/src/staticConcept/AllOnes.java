package staticConcept;
import java.util.Scanner;
public class AllOnes {

	public int minAllOneMultiple(int k)
	{
		if(k%2==0 || k%5==0)
		{
			return -1;
	    }
		
		int rem =1;
		int count=1;
		
		while(rem >0)
		{
		   rem = (rem *10 + 1) % k ;
		   count++;
		
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 AllOnes s = new AllOnes();

	        int n = scan.nextInt();

	        int r = s.minAllOneMultiple(n);

	        System.out.print(r);
	}

}
