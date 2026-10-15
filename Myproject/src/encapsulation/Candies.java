package encapsulation;
import java.util.Scanner;
public class Candies {

public int[] distributeCandies(int candies, int num_people) {
        
        int[] a = new int[num_people];
        int i=0;
        int given =1;

        while(candies > 0)
        {
            int candiesToGive = Math.min(candies, given);

            a[i % num_people] += candiesToGive;
            candies -= candiesToGive;

            given++;
            i++;
        }

        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Candies s = new Candies();

        int can = scan.nextInt();
        int num = scan.nextInt();

        int[] r = s.distributeCandies(can,num);

        for(int i=0;i<r.length;i++)
        {
            System.out.print(r[i]+" ");
        }
    }
}
