package aggregateComposite;
import java.util.Scanner;
public class ColorGuess {

public boolean squareIsWhite(String coordinates) {
        
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '0';
        int sum = col + row;

        if(sum % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ColorGuess s = new ColorGuess();

        String st = scan.next();

        boolean r = s.squareIsWhite(st);

        System.out.print(r);
    }

}
