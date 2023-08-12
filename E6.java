package Capter5;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a==b && b ==c)
            System.out.println("All  are same");
        else if(a!=b && b!= c)
            System.out.println("All are Different");
        else
            System.out.println("Neither");
    }
}
