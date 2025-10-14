package arrayprograms;
import java.util.Scanner;
public class Sortthis {
	 public void sortColors(int[] nums) {
	        int low =0;
	        int mid = 0;
	        int high = nums.length-1;
	       while(mid <= high)
	       {
	         if(nums[mid] == 0)
	         {
	            int temp = nums[low];
	            nums[low] = nums[mid];
	            nums[mid] = temp;
	            low++;
	            mid++;
	         }
	         else if(nums[mid] == 1)
	         {
	            mid++;
	         }
	         else if(nums[mid] == 2)
	         {
	            int temp1 = nums[mid];
	            nums[mid] = nums[high];
	            nums[high] = temp1;
	            high--;
	         }
	       }
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Sortthis s = new Sortthis();

	        int n = scan.nextInt();
	        int a[]  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        s.sortColors(a);
	       
	        for(int j=0;j<a.length;j++)
	        {
	           System.out.print(a[j]+" ");
	        }

	    }}
