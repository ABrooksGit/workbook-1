package com.pluralsight;

import java.util.Scanner;

public class CalculatingRentalCars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //their current age
        int age = enterAge();
        String pickUp = pickUpDate();
        double totalAmountAccumulated = daysRented();

        //Pickup Date ( as a string)

        double originalPrice = 29.99;
        // number of days for the rented car
        double calculations = calculations(totalAmountAccumulated, age);


    }

    public static int enterAge() {
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String pickUpDate(){
        System.out.println("What day will you be picking up the rental?");
        Scanner scanner = new Scanner(System.in);
        String week = scanner.nextLine();

        if (week.equals("Monday")){
            System.out.println("Monday was chosen");
        } else if(week.equals("Tuesday")){
            System.out.println("Tuesday was chosen");
        } else if(week.equals("Wednesday")){
            System.out.println("Wednesday was chosen");
        } else if(week.equals("Thursday")){
            System.out.println("Thursday was chosen");
        } else if(week.equals("Friday")) {
            System.out.println("Friday was chosen");
        } else if(week.equals("Saturday")){
            System.out.println("Saturday was chosen");
        } else if(week.equals("Sunday")){
            System.out.println("Sunday was chosen");
        } else{
            System.out.println("No Day Chosen");
        }


        return scanner.nextLine();
    }

    public static double daysRented() {

        System.out.println("Enter amount of days you will be renting this car");
        System.out.println("Please enter either 1 - 7");
        Scanner scanner = new Scanner(System.in);
        double originalPrice = 29.99;

        double totalAmountAccumulated = 0;

        String days = scanner.nextLine();
        if (days.equals("1")) {
            System.out.println("You will be renting for 1 day");
            totalAmountAccumulated = originalPrice;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95;

            } else{
                System.out.println("Roadside assistance will not be included");

            }

        } else if (days.equals("2")) {
            System.out.println("You will be renting for 2 day");
            totalAmountAccumulated = originalPrice * 2;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 2 ;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 2;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 2;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        } else if (days.equals("3")) {
            System.out.println("You will be renting for 3 day");
            totalAmountAccumulated = originalPrice * 3;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 3;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 3 ;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 3;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        } else if (days.equals("4")) {
            System.out.println("You will be renting for 4 day");
            totalAmountAccumulated = originalPrice * 4;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 4;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 4;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 4;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        } else if (days.equals("5")) {
            System.out.println("You will be renting for 5 day");
            totalAmountAccumulated = originalPrice * 5;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 5;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 5;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 5;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        } else if (days.equals("6")) {
            System.out.println("You will be renting for 6 day");
            totalAmountAccumulated = originalPrice * 6;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 6;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 6;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 6;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        } else if (days.equals("7")) {
            System.out.println("You will be renting for 7 day");
            totalAmountAccumulated = originalPrice * 7;
            System.out.println("Would you like gps to be enabled for $2.95/day?");
            String gps = scanner.nextLine();
            if(gps.equals("yes")){
                System.out.println("GPS will be included");
                totalAmountAccumulated += 2.95 * 7;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("GPS will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Do you want an electric toll tag for 3.95/day?");
            String electronicToll = scanner.nextLine();
            if (electronicToll.equals("yes")){
                System.out.println("The electric toll tag will be included");
                totalAmountAccumulated += 3.95 * 7;
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            } else{
                System.out.println("Electric toll tag will not be included");
                System.out.printf("total equals $%.2f. ", totalAmountAccumulated);
            }
            System.out.println("Would you like some roadside assistance for 3.95/day?");
            String roadSide = scanner.nextLine();
            if(roadSide.equals("yes")){
                System.out.println("Roadside assistance will be included");
                totalAmountAccumulated += 3.95 * 7;

            } else{
                System.out.println("Roadside assistance will not be included");

            }
        }
        return totalAmountAccumulated;


    }



    public static double calculations(double totalAmountAccumulated ,int age) {
      double surCharged = 0;


        if (age < 25) {
            surCharged += totalAmountAccumulated * 1.30;
            System.out.printf("This is your total: $%.2f\n " , surCharged);
        } else {
            System.out.printf("This is your total: $%.2f\n " , totalAmountAccumulated);
        }


        return surCharged;
    }






}
