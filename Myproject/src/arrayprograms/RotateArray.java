package arrayprograms;
import java.util.Scanner;
public class RotateArray {

	 public void rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k%n;
	         reverse(nums, 0, n-1);

	         reverse(nums, 0,k-1);

	         reverse(nums, k, n-1);
	    }
	       private void reverse(int[] nums, int left,int right)
	       {
	          while(left<right)
	          {
	            int temp = nums[left];
	            nums[left] = nums[right];
	            nums[right] = temp;
	            left++;
	            right--;
	          }

	       }
	    
	    
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        RotateArray s = new RotateArray();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }
	        int k = scan.nextInt();

	        s.rotate(a,k);

	        for(int p=0;p<a.length;p++)
	        {
	            System.out.print(a[p]+" ");
	        }

	        
	    }
}
