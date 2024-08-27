package abstractClass;

import java.util.Scanner;

public class MostFreqChar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = scan.nextLine();

	        int[] freq = new int[256];  // Array to store the frequency of each character
	        for (int i = 0; i < str.length(); i++) {
	            freq[str.charAt(i)]++;  // Increment the frequency of the character
	        }

	        char maxChar = str.charAt(0);
	        int maxFreq = freq[maxChar];

	        for (int i = 1; i < str.length(); i++) {
	            if (freq[str.charAt(i)] > maxFreq) {
	                maxFreq = freq[str.charAt(i)];
	                maxChar = str.charAt(i);
	            }
	        }

	        System.out.println("The most frequent character is: " + maxChar);

	}

}
