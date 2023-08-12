package Capter5;

import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MonthNum;
        System.out.println("enter the month number: ");
         MonthNum = scanner.nextInt();
         if(MonthNum == 2)
             System.out.println("28");
         else if(MonthNum<8)
         {
             if(MonthNum%2==0)
                 System.out.println("30");
             else
                 System.out.println("31");
         }
         else
         {
             if(MonthNum%2==0)
                 System.out.println("31");
             else
                 System.out.println("30");
         }

    }
}
