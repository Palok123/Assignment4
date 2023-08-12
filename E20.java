package Capter5;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        ch = scanner.next().charAt(0);
        if(ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("vowel");
        else if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Consonant");
        else
            System.out.println("Error");

    }
}
