package arrayprograms;
import java.util.Scanner;
public class UniqueSum {
	public int sumOfUnique(int[] nums) {
	    
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
          int count=0;
          for(int j=0;j<nums.length;j++)
          {
             if(nums[i] == nums[j])
             {
                count++;
             }
          }
            if(count == 1)
          {
            sum += nums[i];
            }
        }
return sum;
      
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        UniqueSum s = new UniqueSum();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]  = scan.nextInt();
        }

        int r = s.sumOfUnique(a);

        System.out.print(r);
    }

}
