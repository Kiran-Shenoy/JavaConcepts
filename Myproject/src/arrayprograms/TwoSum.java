package arrayprograms;
import java.util.Scanner;
public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        int sum=0;
        while(left < right)
        {
           sum = numbers[left] + numbers[right];
           if(sum == target)
           {
               return new int[] {left+1, right+1};
           }
           else if(sum < target)
           {
               left++;
           }
           else if(sum > target)
           {
               right--;
           }
        }
        return new int[]{-1,-1};
     
   }
     public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       TwoSum s = new TwoSum();

       int n = scan.nextInt();
       int[] b = new int[n];
       for(int j=0;j<n;j++)
       {
           b[j] = scan.nextInt();
       }
       int target = scan.nextInt();
       int[] r = s.twoSum(b,target);

       for(int k=0;k< r.length;k++)
       {
           System.out.print(r[k]+" ");
       }
   }

}
