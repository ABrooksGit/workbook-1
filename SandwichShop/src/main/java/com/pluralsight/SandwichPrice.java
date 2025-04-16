package com.pluralsight;
import java.util.Scanner;


public class SandwichPrice {


    //main
    public static void main(String[] args) {


        // Main Variables
        Scanner scanner = new Scanner(System.in);
        double selectedSandwich = SelectSandwich();
        int age = enterAge();
        double discountedPercentage = discountCheckForSandwiches(selectedSandwich, age);

        //System.out.println("Since you are " + age + " years old and ordered the sandwich that costs " + selectedSandwich);
        System.out.printf("You have to pay $%.2f", discountedPercentage);
        System.out.println(" Please enjoy your meal!");

    }

    // Age adjustments
    public static int enterAge(){
        System.out.println("Please enter your Age: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //Sandwich Selection
    public static double SelectSandwich(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("We have these options for Sandwiches.");
        System.out.println("(1) Regular Size: $5.45");
        System.out.println("(2) Large: $8.95");
        System.out.println("Please Select Your Sandwich Size Of Choice: ");
        String numbers = scanner.nextLine();


        double selectedSandwich = 0;

        if(numbers.equals("1")){
            System.out.println("You have chosen Regular Size for $5.45");
            selectedSandwich = 5.45;
            System.out.println("Would you like your sandwich to be loaded for an extra dollar");
            System.out.println("yes or no");
            String loaded = scanner.nextLine();
            if (loaded.equals("yes")){
                System.out.println("A loaded regular sandwich is coming right up");
                selectedSandwich = 6.45;
            }else{
                System.out.println("Understood, you will not have a loaded regular sandwich");
            }
        } else if(numbers.equals("2")){
            System.out.println("You have chosen the Large Size for $8.95");
            selectedSandwich = 8.95;
            System.out.println("Would you like your sandwich to be loaded for an extra $1.75");
            System.out.println("yes or mo");
            String loaded = scanner.nextLine();
            if(loaded.equals("yes")){
                System.out.println("A loaded large sandwich is coming right up");
                selectedSandwich = 10.70;
            } else{
                System.out.println("Understood, you will not be having a loaded large sandwich");
            }

        }


//        if(numbers.equals("1")){
//            System.out.println("Would you like your sandwich to be loaded for an extra dollar");
//            System.out.println("Yes or No");
//            if(loaded.equals("Yes")){
//                System.out.println("A loaded regular sandwich is coming right up");
//                selectedSandwich = 6.45;
//            }else {
//                System.out.println("Understood, you will not have a loaded regular sandwich");
//
//            }
//        } else if (numbers.equals("2")) {
//            System.out.println("Would you like your sandwich to be loaded for an extra $1.75");
//            System.out.println("Yes or No");
//            if (loaded.equals("Yes")){
//                System.out.println("A loaded large sandwich is coming right up");
//                selectedSandwich = 10.70;
//            } else {
//                System.out.println("Understood, you will not have a loaded large sandwich");
//
//            }
//
//        }


        return selectedSandwich;



    }


    //discountCheckForSandwiches
    public static double discountCheckForSandwiches(double selectedSandwich, int age) {

        double discountPercentage = 0;

            if (age <= 17) {
                discountPercentage = .1;
                System.out.println("Since you are young you get a 10% discount");
            } else if (age >= 65) {
                discountPercentage = .2;
                System.out.println("Since you are old you get a 20% discount");
            }
        double discount = (selectedSandwich * discountPercentage);
        double finalPrice = selectedSandwich - discount;
        return finalPrice;
        }
    }

