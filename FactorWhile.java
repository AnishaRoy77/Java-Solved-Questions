package com.Anisha;

import java.util.Scanner;



public class FactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find factors  : ");
        int num = input.nextInt();
        int i = 1;
        System.out.print("\nThe factors of the " + num + " are: ");
        while(i<=num)

        {
            if(num%i==0){
                System.out.print(i + "  " );

            }
            i++;
        }
       System.out.print("\n");

    }
}

