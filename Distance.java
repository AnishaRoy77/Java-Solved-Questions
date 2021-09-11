package com.Anisha;

import java.util.Scanner;

public class Distance{
    public static void main(String[]args){
        int x1 ,x2, y1 , y2;
        double distance;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of x1  :  ");
        x1 = in.nextInt();
        System.out.println("Enter value of x2  :  ");
        x2 = in.nextInt();
        System.out.println("Enter value of y1  :  ");
        y1 = in.nextInt();
        System.out.println("Enter value of y2 :  ");
        y2 = in.nextInt();
        distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("The distance between two points is :  " + distance);
    }
}