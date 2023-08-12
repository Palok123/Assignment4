package Capter5;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num<0)
            num = num*-1;
        int Count =0;
        while(num!=0)
        {
            Count++;
            num = num/10;
        }
        System.out.println("Total digit = "+Count);
    }
}
