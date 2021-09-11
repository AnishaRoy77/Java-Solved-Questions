package com.Anisha;
import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle :  ");
        float p = input.nextFloat();
        System.out.print("Enter the Time period :  ");
        float t = input.nextFloat();
        System.out.print("Enter the rate of interest :  ");
        float r = input.nextFloat();
        float simpleInterest = ((p*r*t)/100);
        System.out.println("Simple Interest :  " +  simpleInterest);
    }
}
