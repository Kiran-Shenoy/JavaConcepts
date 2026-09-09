package encapsulation;
import java.util.*;
public class BuyTickets {

	public int timeRequiredToBuy(int[] tickets, int k) {
        int totaltime = 0;
        int targetTickets = tickets[k];

        for(int i=0;i < tickets.length;i++)
        {
           if(i<=k)
           {
              totaltime += Math.min(tickets[i],targetTickets);
           }
           else
           {
              totaltime += Math.min(tickets[i],targetTickets -1);
           }

        }

        return totaltime;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BuyTickets s = new BuyTickets();

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        int r = s.timeRequiredToBuy(a,k);

        System.out.print(r);
    }

}
