package encapsulation;
import java.util.Scanner;
public class StringManipulat {

	public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char c : stones.toCharArray())
        {
            if(jewels.contains(String.valueOf(c)))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        StringManipulat s = new StringManipulat();

        String s1 = scan.next();
        String s2 = scan.next();

        int r = s.numJewelsInStones(s1,s2);

        System.out.print(r);
    }

}
