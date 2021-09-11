package com.Anisha;
 import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();
        System.out.println("");
        System.out.println("Enter a : ");
        int a = in.nextInt();
        System.out.println("Enter b : ");
        int b = in.nextInt();
        int count  = 2;

        while(count<= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;


        }
        System.out.println(b);
    }
}
