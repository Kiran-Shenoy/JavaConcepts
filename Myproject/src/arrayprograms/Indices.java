package arrayprograms;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Indices {

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target)
            {
               list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Indices s  = new Indices();

        int n = scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int t = scan.nextInt();

        List<Integer> r = s.targetIndices(a,t);

      
            System.out.print(r);
        
    }
}
