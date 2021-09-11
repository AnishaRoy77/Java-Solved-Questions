package com.Anisha;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base of triangle : ");
        int base = input.nextInt();
        System.out.println("Enter height of triangle : ");
        int height = input.nextInt();
        int area =  (base * height)/2;
        System.out.println("Area of triangle : " + area);

    }
}
