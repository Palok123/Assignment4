package Capter5;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>0)
            System.out.println("positive");
        else if(n==0)
        System.out.println("Zero");
        else
            System.out.println("Negative");

    }
}
