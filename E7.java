package Capter5;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a<b && b <c)
            System.out.println("increasing order");
        else if(a>b && b>c)
            System.out.println("Decresng order");
        else System.out.println("neither");

    }
}
