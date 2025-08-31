package arrayprograms;
import java.util.Scanner;
public class BitCharacter {
	 public boolean isOneBitCharacter(int[] bits) {
	        int i=0;
	        while(i <bits.length-1)
	        {
	           if(bits[i] == 0)
	           {
	            i++;
	           }
	           else if(bits[i] == 1)
	           {
	            i= i+2;
	           }
	        }
	        if(i == bits.length-1)
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
	        BitCharacter s = new BitCharacter();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        boolean  b = s.isOneBitCharacter(a);

	        System.out.print(b);
	    }
	}


