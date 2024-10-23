package aggregateComposite;

public class AggregateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] numbers = {5, 8, 3, 12, 7, 9};

		        // Calculating sum, average, min, and max
		        int sum = 0;
		        int min = numbers[0];
		        int max = numbers[0];

		        for (int num : numbers) {
		            sum += num;  // Sum
		            if (num < min) min = num;  // Min
		            if (num > max) max = num;  // Max
		        }

		        double average = (double) sum / numbers.length;  // Average

		        // Displaying the results
		        System.out.println("Sum: " + sum);
		        System.out.println("Average: " + average);
		        System.out.println("Min: " + min);
		        System.out.println("Max: " + max);
		   


	}

}
