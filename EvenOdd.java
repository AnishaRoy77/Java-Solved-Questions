package com.Anisha;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number :  ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num  +   "  is Even number.");
            return;
        } else {
            System.out.println(  num   +  "  is Odd number.");

        }
    }
}
