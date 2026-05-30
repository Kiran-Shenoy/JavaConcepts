package encapsulation;
import java.util.*;
public class Acronym {

	public boolean isAcronym(List<String> words, String s) {
        String res = "";
      for(String word : words)
      {
          res = res + word.charAt(0);
      }

      if(res.equals(s))
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
        Acronym s = new Acronym();

        int n = scan.nextInt();
        List<String> words = new ArrayList<>();
        for(int i=0;i< n;i++)
        {
            words.add(scan.nextLine());
        }

        String ss = scan.next();

        boolean r = s.isAcronym(words,ss);

        System.out.print(r); 
    }

}
