package staticConcept;
import java.util.Scanner;
public class PowerOf2 {
	
	public boolean isPowerOfTwo(int n)
	{
		if(n <=0) return false;
		while(n%2==0)
		{
			n /= 2;
		}
		
		return n == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PowerOf2 s = new PowerOf2();

        int n = scan.nextInt();

        boolean r = s.isPowerOfTwo(n);

        System.out.print(r);
	}

}
