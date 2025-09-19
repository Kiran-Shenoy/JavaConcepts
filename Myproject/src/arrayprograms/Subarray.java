package arrayprograms;
import java.util.Scanner;
public class Subarray {
	public double findMaxAverage(int[] nums, int k)
	{
		int max = Integer.MIN_VALUE;
	 for(int i=0;i<=nums.length-k;i++)
	 {
		 int sum=0;
		 for(int j=0;j< k;j++)
		 {
			 sum = sum + nums[i+j];
		}
		 if(sum >max)
		 {
			 max = sum;
			 }
		 }
	  return (double)max/k;
	  }
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Subarray s = new Subarray();
		int k = scan.nextInt();
		int n = scan.nextInt(); 
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{ 
			a[i] = scan.nextInt();
}
		double r = s.findMaxAverage(a,k);
		System.out.print(r); }

}
