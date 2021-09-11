package com.Anisha;
import java.util.Scanner;

public class TakingInput {

    public static void main(String [] args){
        System.out.println("Taking Input From The User");
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter number 1 :  ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 :  ");
        int b = sc.nextInt();
        int sum = a + b ;
        float avg = (sum) / 2f;
        System.out.println("The Sum of these number is :  ");
        System.out.println( sum);
        System.out.println("The Average of these number is :  " );
        System.out.println(avg);

    }
}
