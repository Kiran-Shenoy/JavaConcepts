
package abstractClass;
import java.util.Scanner;
public class Palin {

	
	public static boolean IsPalin(String s , int i,int j)
	{
		if(s.charAt(i) != s.charAt(j))
		{
			return false;
		}
		if(j<=i)
		{
			return true;
		}
		return IsPalin(s,i+1,j-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		System.out.print(IsPalin(s,0,s.length()-1));
	}

}
