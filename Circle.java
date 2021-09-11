package com.Anisha;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        int radius = input.nextInt();
        double area = 3.1416 * (Math.pow(radius ,2));
        System.out.println("Area of circle is : " + area);


    }
}
