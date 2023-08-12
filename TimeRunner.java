package Capter5;

import java.util.Scanner;

public class TimeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour1,minute1,hour2,minute2;
        System.out.println("Enter time1 : ");
        hour1 = scanner.nextInt();
        minute1 = scanner.nextInt();
        System.out.println("Enter Time2 : ");
        hour2 = scanner.nextInt();
        minute2 = scanner.nextInt();
        Time time = new Time(hour1,minute1,hour2,minute2);
        int returnvalue = time.CompareTo();
        if(returnvalue==0)
            System.out.println("Time1 = "+hour1+" "+minute1+"\n"+"time2 = "+hour2+" "+minute2);
        else if(returnvalue<0)
            System.out.println("Time1 = "+hour1+" "+minute1+"\n"+"time2 = "+hour2+" "+minute2);
        else
            System.out.println("Time2 = "+hour2+" "+minute2+"\n"+"time1 = "+hour1+" "+minute1);
    }


}
