package arrayprograms;
import java.util.Arrays;
public class Merge {
	


	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = m - 1;       // last element in nums1's initial part
	        int j = n - 1;       // last element in nums2
	        int k = m + n - 1;   // last position in nums1

	        while (i >= 0 && j >= 0) {
	            if (nums1[i] > nums2[j]) {
	                nums1[k--] = nums1[i--];
	            } else {
	                nums1[k--] = nums2[j--];
	            }
	        }

	        // if nums2 still has elements, copy them
	        while (j >= 0) {
	            nums1[k--] = nums2[j--];
	        }
	    }

	    public static void main(String[] args) {
	        Merge s = new Merge();

	        int[] nums1 = {1,2,3,0,0,0};
	        int m = 3;
	        int[] nums2 = {2,5,6};
	        int n = 3;

	        s.merge(nums1, m, nums2, n);

	        System.out.println(Arrays.toString(nums1));
	   

	}

}
