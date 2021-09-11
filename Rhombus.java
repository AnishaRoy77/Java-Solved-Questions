package com.Anisha;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter  1st diagonal  : ");
         int d1 = input.nextInt();
        System.out.println("Enter  2nd  diagonal  : ");
         int d2 = input.nextInt();
        // using diagonal method -->
         double area = (d1 * d2) /2;
        System.out.println("Area of rhombus using diagonal method : " + area);
        // using trigonometry -->
      System.out.println("Enter side of Rhombus  : ");
        int side = input.nextInt();
        System.out.println("Enter angle   : ");
        double angle = input.nextDouble();
        double angle1 = Math.toRadians(angle);
        double area2 = ((Math.pow(side, 2)) * (Math.sin(angle1)));

        if (side <= 0) {
            System.out.println("Length should be positive");
        }
        else{
                System.out.println("Area of Rhombus using trigonometry : " + area2);
            }

    }
}
