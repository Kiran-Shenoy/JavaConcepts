package strings;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Input the sentence
		        System.out.print("Enter the sentence: ");
		        String sentence = scanner.nextLine();

		        // Split the sentence into words using a regular expression that handles multiple spaces
		        String[] wordsArray = sentence.split("\\s+");

		        // Filter out any empty strings and collect words into a list
		        List<String> words = new ArrayList<>();
		        for (String word : wordsArray) {
		            if (!word.isEmpty()) {
		                words.add(word);
		            }
		        }

		        // Print the words
		        System.out.println("Words in the sentence:");
		        for (String word : words) {
		            System.out.println(word);
		        }

		        scanner.close();
		   

	}

}
