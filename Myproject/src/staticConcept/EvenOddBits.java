package staticConcept;
import java.util.Scanner;
public class EvenOddBits {
    public int[] evenOddbit(int n)
    {
	int odd=0;
	int even=0;
	 
	int pos=0;
	String bi = Integer.toBinaryString(n);
    for(int i=bi.length()-1;i>=0;i--)
    {
    	if(bi.charAt(i) == '1')
    	{
    	if(pos % 2==0)
    	{
    		even++;
    	}
    	else
    	{
    		odd++;
    	}
    	}
    pos++;
    }
    
    return new int[] {even,odd};
    
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 EvenOddBits s = new EvenOddBits();

	        int n = scan.nextInt();

	        int r[] = s.evenOddbit(n);

	        for(int i=0;i<r.length;i++)
	        {
	            System.out.print(r[i]+" ");
	        }
	}

}
