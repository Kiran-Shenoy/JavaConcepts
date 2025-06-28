package aggregateComposite;
import java.util.Scanner;
public class CollectiveMatrix {


		    public static void main(String[] args) {
		        ConnectiveMatrix matrix = new ConnectiveMatrix();
		        matrix.collectMarks();
		        matrix.displayResults();
		    }
		}

		class ConnectiveMatrix {
		    private double totalMarks;
		    private int numberOfSubjects;

		    void collectMarks() {
		        Scanner neuronScanner = new Scanner(System.in);

		        System.out.print("Enter number of subjects: ");
		        numberOfSubjects = neuronScanner.nextInt();
		        
		        for (int i = 1; i <= numberOfSubjects; i++) {
		            System.out.print("Enter marks for Subject " + i + ": ");
		            double marks = neuronScanner.nextDouble();
		            totalMarks += marks;
		        }

		        neuronScanner.close();
		    }

		    void displayResults() {
		        double average = totalMarks / numberOfSubjects;
		        System.out.println("Total Marks (Muscle Effort): " + totalMarks);
		        System.out.println("Aggregate (Synaptic Score): " + average);
		    }
		

}
