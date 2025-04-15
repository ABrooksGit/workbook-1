package com.pluralsight;
import java.util.Scanner;


public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first number");
        double number1 = scanner.nextDouble();
        System.out.println("What is the Second number");
        double number2 =scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A) Addition");
        System.out.println("(S) Subtraction");
        System.out.println("(M) Multiplication ");
        System.out.println("(D) Division");
        System.out.println("Please select an option: ");
        String letter;
        letter = scanner.nextLine();
        //System.out.println("You've chosen: " + letter);
        double product = number1 * number2;
        double sum = number1 + number2;
        double difference = number1 - number2;
        double remainder = number1 / number2;


        if (letter.equals("a") || letter.equals("A")){

            System.out.println("You've chosen addition");
            System.out.printf("The sum of %.1f and %.1f is %.1f\n", number1, number2, sum);
            System.out.printf("%.1f + %.1f = %.1f\n", number1, number2, sum);

        } else if (letter.equals("s") || letter.equals("S")) {

            System.out.println("You've chosen subtraction");
            System.out.printf("The difference between %.1f and %.1f is %.1f\n", number1, number2, difference);
            System.out.printf("%.1f - %.1f = %.1f\n", number1, number2, difference);
        } else if ( letter.equals("m") || letter.equals("M") )  {

            System.out.println("You've chosen multiplication");
            System.out.printf("The product of %.1f and %.1f is %.1f\n", number1, number2, product);
            System.out.printf("%.1f * %.1f = %.1f\n", number1, number2, product);
        } else if ( letter.equals("d") || letter.equals("D")) {

            System.out.println("You've chosen division");
            System.out.printf("The remainder of %.1f and %.1f is %.1f\n", number1, number2, remainder);
            System.out.printf("%.1f / %.1f = %.1f\n", number1, number2, remainder);
        }













    }

}
