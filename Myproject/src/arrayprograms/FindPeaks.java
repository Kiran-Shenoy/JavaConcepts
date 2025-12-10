package arrayprograms;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FindPeaks {

	 public List<Integer> findPeaks(int[] mountain) {
	        List<Integer> list = new ArrayList<>();
	        for(int i=1;i<mountain.length-1;i++)
	            {
	               if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
	               {
	                  list.add(i);
	               }
	            }
	        
	        return list;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        FindPeaks s = new FindPeaks();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        List<Integer> r = s.findPeaks(a);

	        System.out.print(r);
	    }

}
