package arrayprograms;

import java.util.Scanner;
public class InsertIndex {

	public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target == nums[i])
            {
                return i;
            }
            else if(target > nums[i])
            {
                continue;
            }
            else
            {
                return i;
            }
        }
        return nums.length;
        
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        InsertIndex s = new InsertIndex();
        int t = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int res = s.searchInsert(a,t);

        System.out.print(res);
    }

	}

