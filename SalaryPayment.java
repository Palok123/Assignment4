package Capter5;

import java.util.Scanner;

public class SalaryPayment {
    public double Wages,HourWorked;
    public double Salary = 0;
    public void Paycheak(double Wages,double HourWorked)
    {
       this.Wages = Wages;
       this.HourWorked = HourWorked;
    }
    public double Payment()
    {
        if(HourWorked>40)
            Salary = (40*Wages) + (HourWorked-40)*(Wages+ (Wages*1.5));
        else
            Salary = HourWorked*Wages;
        return Salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name :");
        String name = scanner.next();
        System.out.println("enter the Hourly Wages:");
        double wages = scanner.nextDouble();
        System.out.println("how many hour worked in the past week : ");
         double HourWorkewd =  scanner.nextDouble();
         SalaryPayment salaryPayment = new SalaryPayment();
         salaryPayment.Paycheak(wages,HourWorkewd);
         double salary = salaryPayment.Payment();
        System.out.println("total salary = "+salary);

    }
}
