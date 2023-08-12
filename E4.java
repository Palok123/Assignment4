package Capter5;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.charAt(0)==str.charAt(str.length()-1))
            System.out.println("Equals");
        else
            System.out.println("Not equals");

    }
}
