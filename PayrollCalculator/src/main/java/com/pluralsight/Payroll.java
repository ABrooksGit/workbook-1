package com.pluralsight;
import java.util.Scanner;

public class Payroll {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Okay "+ name + ". Now what was your hours worked?");
        double hours_worked = scanner.nextDouble();
        System.out.println("Finally what is your pay rate?");
        double pay_rate = scanner.nextDouble();
        if (hours_worked > 40) {
            pay_rate = pay_rate * 1.5;

        }
        System.out.println("Hey " + name + ". Here is your pay");
        System.out.println(hours_worked * pay_rate);








    }
}
