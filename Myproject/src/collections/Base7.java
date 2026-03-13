package collections;
import java.util.Scanner;;
public class Base7 {

	 public String convertToBase7(int num) {
	        
	        if(num==0) return "0";
	        boolean negative = num <0;
	        num  =Math.abs(num);
	        StringBuilder sb = new StringBuilder();

	        while(num>0)
	        {
	            int rem = num % 7;
	            sb.append(rem);
	            num /= 7;
	        }
	        sb.reverse();

	        if(negative)
	        {
	            sb.insert(0,"-");
	        }
	        return sb.toString();
	    }
	     public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);

	        Base7 s = new Base7();
	        int st = scan.nextInt();

	        String r = s.convertToBase7(st);

	        System.out.print(r);
	    }

}
