package com.Anisha;


import java.util.Scanner;

public class IntegerSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter Number (enter 0 to quit : ");
        double sum = 0;
        int counter = 0, input = 0;
        System.out.print("Enter a series of values (0 to quit): ");

        while ((input = in.nextInt()) != 0) {


            sum += input;
            counter++;

        }

        if (counter > 0) {


            System.out.println("Total number of integers entered is " + counter);

            System.out.println("The sum  value is: " + sum);
        } else {
            System.out.println("No data was entered.");
        }
    }
}


