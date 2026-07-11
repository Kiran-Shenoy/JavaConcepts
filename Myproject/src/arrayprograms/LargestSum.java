package arrayprograms;
import java.util.*;
public class LargestSum {

public boolean isHappy(int n) {
        
        Set<Integer> seenNumbers = new HashSet<>();

        while(n != 1 && !seenNumbers.contains(n))
        {
            seenNumbers.add(n);
            n = getNextNumber(n);
        }
        return n ==1;
    }
    private int getNextNumber(int n)
    {
        int total = 0;
        while(n > 0 )
        {
            int digit = n % 10;
            total += digit * digit;
            n = n /10;
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        LargestSum s = new LargestSum();

        int n = scan.nextInt();

        boolean r = s.isHappy(n);

        System.out.println(r);
    }

}
