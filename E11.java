package Capter5;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree1,degree;

        degree1 = scanner.nextInt();
        if(degree1>360)
          degree = degree1%360;
        else
            degree = degree1;
        if(degree == 0 || degree ==360)
            System.out.println("N");
        else if (degree>0 && degree<90)
            System.out.println("NW");
        else if (degree ==90)
            System.out.println("W");
        else if(degree >90 && degree <180)
            System.out.println("WS");
        else if(degree==180)
            System.out.println("S");
        else if(degree>180 && degree<270)
            System.out.println("SW");
        else if(degree == 270 )
            System.out.println("E");
        else if(degree>270 && degree<360)
            System.out.println("NW");


    }
}
