package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        String word1 = "Hello";

        String word2 = "World";

        String greeting;


        greeting = word1 + " " + word2 + "!";

        System.out.println (greeting);
        ///////////////////////////////////////////////////////////////////

        float taxRate = 0.15f;

        long aLargeNumber = 2222222L;

        ////////////////////////////////////////////////////////////////////

        int aint;

        long blong;

        aint = 7;

        blong = aint;
        //////////////////////////////////////////////////////////////////////

        long aLong;
        int bInt;

        aLong = 7777777777_000_000_000L;
        bInt = (int) aLong;


        System.out.println(bInt);



    }

}