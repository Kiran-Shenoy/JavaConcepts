package staticConcept;
import java.util.Scanner;
public class SumMultiples {

	public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SumMultiples s = new SumMultiples();

        int n =scan.nextInt();

        int r = s.sumOfMultiples(n);

        System.out.print(r);
    }

}
