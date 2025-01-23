package aggregateComposite;

public class Aggr {
	  public static int sum(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        return sum;
	    }

	    public static double average(int[] numbers) {
	        int sum = sum(numbers);
	        return (double) sum / numbers.length;
	    }

	    public static int min(int[] numbers) {
	        int min = numbers[0];
	        for (int num : numbers) {
	            if (num < min) {
	                min = num;
	            }
	        }
	        return min;
	    }

	    public static int max(int[] numbers) {
	        int max = numbers[0];
	        for (int num : numbers) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {
	
		        int[] numbers = {34, 32, 12, 56, 67, 54};

		        System.out.println("Sum: " + sum(numbers));
		        System.out.println("Average: " + average(numbers));
		        System.out.println("Minimum: " + min(numbers));
		        System.out.println("Maximum: " + max(numbers));
		    }
	


	}


