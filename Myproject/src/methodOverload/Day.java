package methodOverload;
import java.util.Scanner;
public class Day {

public String dayOfTheWeek(int day, int month, int year) {
        
        String[] weekDays = {
            "Sunday","Monday","Tuesday","Wednesday",
             "Thursday" ,"Friday","Saturday"
        };

        int[] daysInMonth = {
            31, 28, 31,30,31,30,
            31,31,30, 31 ,30 ,31
        };

        int totalDays = 0;
        for(int y = 1971; y < year;y++)
        {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        for(int m=1;m<month;m++)
        {
            totalDays += daysInMonth[m-1];

            if(m==2 && isLeapYear(year))
            {
                totalDays++;
            }
        }
        totalDays += day-1;

        return weekDays[(5+totalDays) % 7];
    }
    private boolean isLeapYear(int year)
    {
        return year % 400 == 0 || 
               (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Day s = new Day();

        int d = scan.nextInt();
        int m = scan.nextInt();
        int y = scan.nextInt();

        String r = s.dayOfTheWeek(d,m,y);

        System.out.print(r);
    }

}
