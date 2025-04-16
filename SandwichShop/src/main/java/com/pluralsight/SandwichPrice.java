package com.pluralsight;
import java.util.Scanner;


public class SandwichPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = enterAge();
        double selectedSandwich = SelectSandwich();
        double discountedPercentage = discountCheckForSandwiches(selectedSandwich, age);

        System.out.println("Since you are " + age + " years old and ordered the sandwich that costs " + selectedSandwich);
        System.out.printf("You now have to pay $%.2f", + discountedPercentage);
        System.out.println(" Please enjoy your meal!");

    }


    public static int enterAge(){
        System.out.println("Please enter your Age: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static double SelectSandwich(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("We have these options for Sandwiches.");
        System.out.println("(1) Regular Size: $5.45");
        System.out.println("(2) Large: $8.95");
        System.out.println("Please Select Your Sandwich Size Of Choice: ");
        String numbers = scanner.nextLine();

        double selectedSandiwch = 0;

        if(numbers.equals("1")){
            System.out.println("You have chosen Regular Size for $5.45");
            selectedSandiwch = 5.45;
        } else if(numbers.equals("2")){
            System.out.println("You have chosen the Large Size for $8.95");
            selectedSandiwch = 8.95;
        }


        return selectedSandiwch;



    }

    public static double discountCheckForSandwiches(double selectedSandwich, int age) {


        Scanner scanner = new Scanner(System.in);

        double discountPercentage = 0;
            if (age <= 17) {
                discountPercentage = .1;
            } else if (age >= 65) {
                discountPercentage = .2;
                }
        double discount = (selectedSandwich * discountPercentage);
        double finalPrice = selectedSandwich - discount;
        return finalPrice;
        }
    }

