package arrayprograms;
import java.util.Scanner;
public class Dupp {

	public int[] findErrorNums(int[] nums) {

        int count[] = new int[nums.length+1];
        for(int num : nums)
        {
            count[num]++;
        }
        int miss=-1,dup=-1;
        for(int i=0;i<count.length;i++)
        {
            if(count[i] == 2)
            {
                dup = i;
            }
            else if(count[i]==0)
            {
                miss = i;
            }
        }
        return new int[] {dup,miss};

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Dupp s = new Dupp();

        int n = scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }


        int[] r = s.findErrorNums(a);

        for(int j=0;j<r.length;j++)
        {
            System.out.print(r[j]+" ");
        }
    }

}
