package arrayprograms;
import java.util.*;
public class Common {

	
	    public int getCommon(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        for (int num : nums1) {
	            set.add(num);
	        }
	        for (int num : nums2) {
	            if (set.contains(num)) {
	                return num;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Common s = new Common();

	        int n1 = scan.nextInt();
	        int[] a1 = new int[n1];
	        for (int i = 0; i < n1; i++) {
	            a1[i] = scan.nextInt();
	        }

	        int n2 = scan.nextInt();
	        int[] a2 = new int[n2];
	        for (int j = 0; j < n2; j++) {
	            a2[j] = scan.nextInt();
	        }

	        int r = s.getCommon(a1, a2);
	        System.out.println(r);
	    }
	}


