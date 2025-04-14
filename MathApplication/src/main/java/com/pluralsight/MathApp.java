package com.pluralsight;

public class MathApp {

    public  static  void main(String[] args){

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //question 1:
        System.out.println("Q1:Determine whose salary is of the highest value");
        double bobSalary = 70000;
        double garySalary = 85000;
        double highestSalary = Math.max(bobSalary, garySalary);


        System.out.println("The answer is is " + highestSalary);

        //Question 2:
        System.out.println("Q2:Determine whose salary is of lowest value");
        double carPrice =  67_000;
        double truckPrice = 39_445;
        double smallestValue = Math.min(carPrice, truckPrice);


        System.out.println("The answer is " + smallestValue);


        //Question 3:
        System.out.println("Q3:Find and display the area of a circle whose radius is 7.25");
        double areaRadiusCircle = 7.25;
        double CircleArea = Math.PI * Math.pow(areaRadiusCircle, 2);

        System.out.println("The answer is " + CircleArea );




        //Question 4:
        System.out.println("Q4:Find and display the square root of a variable after it is set to 5.0");
        double baseNumber = 5.0;

        double mathSqrt = Math.sqrt(baseNumber);


        System.out.println("The answer is " + mathSqrt );

        //Question 5:
        System.out.println("Q5:The distance between the points (5,10) and (85,50)");
        double x1 =5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double calculateDistance = Math.sqrt( (Math.pow(x2 - x1, 2) ) + Math.pow(y2 - y1, 2) );

        System.out.println("The answer is " + calculateDistance);

        //Question 6:
        System.out.println("Q6: Change -3.8 to a positive number");
        double negativeValue = -3.8;
        double positiveValue = Math.abs(negativeValue);


        System.out.println("The answer is " + positiveValue );


        //Question 7:
        System.out.println("Q7: Find a random number between 0 and 1");

        double randomNumber = Math.random();


        System.out.println("The answer is " + randomNumber);

        //Example:
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);


    }
}
