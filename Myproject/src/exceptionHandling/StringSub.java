package exceptionHandling;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StringSub {

public List<String> stringMatching(String[] words) {
        
        List<String> list1 = new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j && words[i].contains(words[j]))
                {
                    if(!list1.contains(words[j]))
                    {
                       list1.add(words[j]);
                    }
                }
            }
        }
        return list1;
    }
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        StringSub s = new StringSub();

        int n = scan.nextInt();
        String st[]  = new String[n];
        for(int i=0;i<n;i++)
        {
            st[i]  = scan.next();
        }

        List<String> list = s.stringMatching(st);

        System.out.print(list);
    }

}
