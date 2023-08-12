package Capter5;

import java.util.Arrays;
import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Double[] num = new Double[3];
       for(int i =0;i<3;i++)
       {
           num[i] = scanner.nextDouble();
       }
        Arrays.sort(num);
        System.out.println("big number is ="+num[3]);
    }
}
