package Capter5;

import java.util.Scanner;

public class E12 {
    public double  getLetterGrade(String grade)
    {
        if(grade.equals("A+"))
            return 4;
        else if(grade.equals("A"))
            return 4;
        else if(grade.equals("A-"))
            return 3.7;
        else if(grade.equals("B+"))
            return 3.3;
        else if(grade.equals("B"))
            return 3;
        else if(grade.equals("B-"))
            return 2.7;
        else if(grade.equals("C+"))
            return 2.3;
        else if(grade.equals("C"))
            return 2;
        else if(grade.equals("C-"))
            return 1.7;
        else if(grade.equals("D"))
            return 1;
        else if(grade.equals("D+"))
            return 1.3;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        E12 ob = new E12();
        double result = ob.getLetterGrade(grade);
        System.out.println("The numeric value is = "+result);

    }
}
