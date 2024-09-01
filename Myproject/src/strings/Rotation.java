package strings;

import java.util.Scanner;

public class Rotation {

    
		
   public static boolean areRotations(String str1, String str2) {
  
    return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
}

   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

    if (areRotations(str1, str2)) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }


	}

}
