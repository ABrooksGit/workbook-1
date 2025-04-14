package com.pluralsight;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first number");
        double number1 = scanner.nextDouble();
        System.out.println("What is the Second number");
        double number2 =scanner.nextDouble();

        System.out.println("Please choose between (A)dd, (S)ubtraction,(M)ultiply or (D)ivide");
        scanner.nextLine();
        String letter;
        letter = scanner.nextLine();

        System.out.println("You've chosen: " + letter);

        double product = number1 * number2;
        System.out.printf("The product of %.1f and %.1f is %.1f\n", number1, number2, product);











    }

}
