package staticConcept;
import java.util.Scanner;
public class EvenOdddigits {

	public int evenNumberBitwiseORs(int[] nums)
	{
		int n=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] % 2==0)
			{
				n = n| nums[i];
			}
		}
		
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 EvenOdddigits s = new EvenOdddigits();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r = s.evenNumberBitwiseORs(a);

	        System.out.print(r);
	}

}
