package com.pluralsight;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first number");
        double number1 = scanner.nextDouble();
        System.out.println("What is the Second number");
        double number2 =scanner.nextDouble();

        System.out.println("Please choose between (A) Addition, (S) Subtraction, (M) Multiplication or (D) Division");
        scanner.nextLine();
        String letter;
        letter = scanner.nextLine();

        //System.out.println("You've chosen: " + letter);
        double product = number1 * number2;
        double sum = number1 + number2;
        double difference = number1 - number2;
        double remainder = number1 / number2;


        if (letter.equals("a")) {

            System.out.println("You've chosen addition");
            System.out.printf("The sum of %.1f and %.1f is %.1f\n", number1, number2, sum);

        } else if (letter.equals("s")) {

            System.out.println("You've chosen subtraction");
            System.out.printf("The difference between %.1f and %.1f is %.1f\n", number1, number2, difference);
        } else if ( letter.equals("m")) {

            System.out.println("You've chosen multiplication");
            System.out.printf("The product of %.1f and %.1f is %.1f\n", number1, number2, product);

        } else if ( letter.equals("d")) {

            System.out.println("You've chosen division");
            System.out.printf("The remainder of %.1f and %.1f is %.1f\n", number1, number2, remainder);
        }













    }

}
