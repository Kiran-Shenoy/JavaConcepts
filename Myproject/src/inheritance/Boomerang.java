package inheritance;
import java.util.*;
public class Boomerang {

public boolean isBoomerang(int[][] points) {
        
        int x1 = points[0][0] , y1 = points[0][1];
        int x2 = points[1][0] , y2 = points[1][1];
        int x3 = points[2][0] , y3 = points[2][1];

        return (x1 - x2) * (y2 - y3) != (x2-x3) * (y1-y2);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Boomerang s = new Boomerang();

        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] ar = new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                ar[i][j] = scan.nextInt();
            }
        }

        boolean r  = s.isBoomerang(ar);

        System.out.print(r);
    }

}
