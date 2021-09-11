package com.Anisha;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();

        long factorial  = 1;

        for(int  i = 1; i <=num ; ++i) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num +  " is : "  +  factorial);


    }

}
