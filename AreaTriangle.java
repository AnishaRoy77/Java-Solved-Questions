package com.Anisha;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base of triangle : ");
        int base = input.nextInt();
        System.out.println("Enter height of triangle : ");
        int height = input.nextInt();

        double area = Triangle(base ,height);
        System.out.println("Area of Triangle is: " + area);
    }
    static double Triangle(int base ,int height)
    {

        return ((base*height)/2);


    }

}