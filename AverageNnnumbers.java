package com.Anisha;

import java.util.Scanner;

public class AverageNnnumbers {

    public static void main(String[]args){
        int n, count = 1;
        float  a, average, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many numbers you want sum of :  ");
        n = input.nextInt();
        while(count <= n){
            System.out.println("Enter the "+count+" number?");
            a = input.nextInt();
            sum += a;
            count++;
        }
        average = sum/n;
        System.out.println("The Average is : "  + average);
    }

}
