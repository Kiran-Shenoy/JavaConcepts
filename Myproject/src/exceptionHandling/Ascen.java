package exceptionHandling;
import java.util.Scanner;
public class Ascen {
	public boolean areNumbersAscending(String s) {
        String[] ar = s.split(" ");
        int prev = -1;
        for(String token : ar)
        {
            
            if(Character.isDigit(token.charAt(0)))
            {
               int num = Integer.parseInt(token);
               if(num <=prev) return false;
               prev = num;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Ascen s = new Ascen();

        String st = scan.nextLine();

        boolean r = s.areNumbersAscending(st);
        
        System.out.print(r);
    }


}
