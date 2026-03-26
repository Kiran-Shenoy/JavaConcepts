package encapsulation;
import java.util.Scanner;
public class Stock {

	  public int maxProfit(int[] prices) {
	        
	        int minprice = prices[0];
	        int maxprofit = 0;
	        for(int i=1;i<prices.length;i++)
	        {
	            if(prices[i] < minprice)
	            {
	                minprice = prices[i];
	                
	            } 
	            else
	            {
	                int profit = prices[i] - minprice;
	                if(profit > maxprofit)
	                {
	                    maxprofit = profit;
	                }
	            }
	        }

	        return maxprofit;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Stock s = new Stock();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	           a[i] = scan.nextInt();
	        }

	        int r = s.maxProfit(a);

	        System.out.print(r);
	    }

}
