package arrayprograms;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Vishakari {

	 public List<Integer> stableMountains(int[] height, int threshold) {
	        List<Integer> list = new ArrayList<>();

	        for(int i=0;i<height.length-1;i++)
	        {
	            if(height[i] > threshold)
	            {
	                list.add(i+1);
	            }
	        }
	        return list;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Vishakari s = new Vishakari();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }

	        int t = scan.nextInt();

	        List<Integer> r = s.stableMountains(a,t);

	        System.out.print(r);
	    }

}
