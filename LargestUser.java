package com.Anisha;

import java.util.Scanner;


public class LargestUser {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter Number (enter 0 to quit : ");

        int counter = 0, input = 0 , large = Integer.MAX_VALUE , small = Integer.MIN_VALUE;
        System.out.print("Enter a series of values (0 to quit): ");

        while ((input = in.nextInt()) != 0) {
            small = Integer.min(small, input);
            large = Integer.max(large, input);
            counter++;

        }

        if (counter > 0) {


            System.out.println("Total number of integers entered is " + counter);
            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
        } else {
            System.out.println("No data was entered.");
        }
    }
}

