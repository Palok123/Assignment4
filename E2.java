package Capter5;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if(num==0)
            System.out.println("Zero");
        else if(num>0)
            System.out.println("positive");
        else
            System.out.println("negative");
        double absvalue = Math.abs(num);
        if(absvalue <1)
            System.out.println("small");
        else
            System.out.println("Large");


    }
}
