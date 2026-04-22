package encapsulation;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class IndexSum {

public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
             map.put(list1[i],i);
        }

        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int j=0;j<list2.length;j++)
        {
            if(map.containsKey(list2[j]))
            {
                int sum = j + map.get(list2[j]);
                if(sum < min)
                {
                    result.clear();
                    result.add(list2[j]);
                    min = sum;
                }
                else if(sum == min)
                {
                    result.add(list2[j]);
                }
            }

        }
        return result.toArray(new String[0]);
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        IndexSum s = new IndexSum();

        int n = scan.nextInt();
        String[] s1 = new String[n];
        for(int i=0;i< n;i++)
        {
            s1[i] = scan.nextLine();
        }

        int m = scan.nextInt();
        String[] s2 = new String[m];
        for(int j=0;j<m;j++)
        {
            s2[j] = scan.nextLine();
        }

        String[] r = s.findRestaurant(s1,s2);


    }

}
