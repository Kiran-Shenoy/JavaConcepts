package encapsulation;
import java.util.Scanner;
public class Chess {

public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        int col1 = coordinate1.charAt(0) - 'a' + 1;
        int row1 = coordinate1.charAt(1) - '0';
        int sum1 = col1 +row1;

        int col2 = coordinate2.charAt(0) - 'a' + 1;
        int row2 = coordinate2.charAt(1) - '0';
        int sum2 = col2 + row2;


        return (sum1 % 2) == (sum2 % 2);

    }
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        Chess s = new Chess();

        String st1 = scan.next();
        String st2 = scan.next();

        boolean r = s.checkTwoChessboards(st1,st2);

        System.out.print(r);
    }

}
