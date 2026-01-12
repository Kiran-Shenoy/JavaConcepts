package staticConcept;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class SmallestInteger {
	 public int missingMultiple(int[] nums, int k) {
	 
		 Set<Integer> set = new HashSet<>();
		 
		 for(int num: nums)
		 {
			 set.add(num);
		 }
		 
		 int mul = k;
		 while(true)
		 {
			 if(!set.contains(mul))
			 {
				 return mul;
			 }
			 mul = mul +k;
		 }
	 }
	 
	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 SmallestInteger s = new SmallestInteger();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }
	        
	        int k = scan.nextInt();
	        int r = s.missingMultiple(a,k);

	        System.out.print(r);
	}

}
