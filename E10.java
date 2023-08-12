package Capter5;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if(a==b && c==d || a==c && b==d || a==d && b==c)
            System.out.println("two pair");
        else
            System.out.println("not two pair");

    }
}
