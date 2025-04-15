package com.pluralsight;
import java.util.Scanner;

public class Payroll {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = promptforName();
        float hours_worked = promptforHoursWorked();
        double pay_rate = promptForPayRate();
        double gross_pay = calcGrossPay(hours_worked,pay_rate);
        System.out.printf("%s  has worked for %.2f hours at a rate of $%.2f and made $%.2f\n", name, hours_worked, pay_rate, gross_pay);



    }

    /**
     * Calculates Gross Pay, considers overtime over 40 hours
     */
    public static double calcGrossPay(float hours_Worked, double pay_rate) {
        if (hours_Worked <= 40){
            return  hours_Worked * pay_rate;
        }
        else {
            float overtimeHours = hours_Worked - 40;
            double standard_pay = 40 * pay_rate;
            double overtimeRate = pay_rate * 1.5;
            double overtimePay = overtimeHours * overtimeRate;

            return  standard_pay + overtimePay;


        }


    }

    public static String promptforName(){
        System.out.println("Please enter the employee name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public  static float promptforHoursWorked(){
        System.out.println("Please Enter The Number Of Hours You Worked This Pay Period: ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextFloat();
    }

    public static double promptForPayRate(){
        System.out.println("Please Enter In Your Base Pay Rate: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();


    }

}
