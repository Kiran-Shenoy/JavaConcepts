package arrayprograms;

public class Repeasted {
	
	    public static int repeatedNTimes(int[] nums) {
	        int n = nums.length / 2;

	        for (int i = 0; i < nums.length; i++) {
	            int count = 1; // Count nums[i] itself
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                    count++;
	                }
	                if (count == n) {
	                    return nums[i];
	                }
	            }
	        }
	        return -1; // Should never reach here if input is valid
	    }

	    public static void main(String[] args) {
	        System.out.println(repeatedNTimes(new int[]{1, 2, 3, 3}));        // Output: 3
	        System.out.println(repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));  // Output: 2
	        System.out.println(repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4})); // Output: 5
	   
	}

}
