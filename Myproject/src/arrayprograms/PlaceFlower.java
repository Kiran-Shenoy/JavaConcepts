package arrayprograms;
import java.util.Scanner;
public class PlaceFlower {

	  public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int count=0;
	        for(int i=0;i<flowerbed.length;i++)
	        {
	            if(flowerbed[i] == 0 &&
	              (i == 0 || flowerbed[i - 1] == 0) &&
	              (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) 
	            {
	              flowerbed[i]=1;
	              n--;
	            }
	        }
	        if(n<=0)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        PlaceFlower s = new PlaceFlower();
	        int n = scan.nextInt();
	        int k = scan.nextInt();
	        int a[] = new int[k];
	        for(int i=0;i<k;i++)
	        {
	            a[i]= scan.nextInt();

	        }


	        boolean res = s.canPlaceFlowers(a,n);

	        System.out.print(res);
	    }
	}

