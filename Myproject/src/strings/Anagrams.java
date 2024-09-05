package strings;

import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	    String str1 = scan.next();
        String str2 = scan.next();
        
        System.out.println(isAnagram(str1, str2) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

	}


