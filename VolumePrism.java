package com.Anisha;

import java.util.Scanner;

public class VolumePrism {

    static double volumeSquare(int side, int height) {
        double area = Math.pow(side, 2);
        double volume = area * height;
        return volume;
    }


    static double volumeTriangle(int base, int h, int height) {
        float area = (base * h) / 2;
        double volume = area * height;
        return volume;
    }

    static double volumeRectangle(int length, int width, int height) {
        float area = length * width;
        double volume = area * height;
        return volume;
    }

    static double volumePentagon(int alength, int abase, int height) {
        double volume = ((alength * abase * height) * 5 / 2);
        return volume;
    }

    static double volumeHexagon(int ahlength, int hbase, int height) {
        double volume = 3 * ahlength * hbase * height;
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select the volume of type prism you want to calculate : (Square , Triangle , Rectangle , Pentagon , Hexagon ");
        String str = in.next();
        System.out.println("Enter Height of the Prism : ");
        int height = in.nextInt();

        if (str.equalsIgnoreCase("Square")) {
            System.out.println("enter side of square : ");
            int side = in.nextInt();
            System.out.println("Volume of Square Prism :  " + volumeSquare(side, height));
        }
        if (str.equalsIgnoreCase("Triangle")) {
            System.out.println("enter base of triangle : ");
            int base = in.nextInt();
            System.out.println("enter height of triangle : ");
            int h = in.nextInt();
            System.out.println("volume of Triangular Prism is : " + volumeTriangle(base, h, height));
        }

        if (str.equalsIgnoreCase("Rectangle")) {
            System.out.println("enter length of rectangle : ");
            int length = in.nextInt();
            System.out.println("enter width of rectangle : ");
            int width = in.nextInt();
            System.out.println("volume of Rectangular Prism is : " + volumeRectangle(length, width, height));
        }
        if (str.equalsIgnoreCase("Pentagon")) {
            System.out.println("enter  apothem length  of Pentagon : ");
            int alength = in.nextInt();
            System.out.println("enter base of Pentagon : ");
            int abase = in.nextInt();
            System.out.println("volume of Pentagonal Prism is : " + volumePentagon(alength, abase, height));
        }
        if (str.equalsIgnoreCase("Hexagon")) {
            System.out.println("enter  apothem length  of Hexagon : ");
            int ahlength = in.nextInt();
            System.out.println("enter base of Hexagon : ");
            int hbase = in.nextInt();
            System.out.println("volume of Hexagonal Prism is : " + volumeHexagon(ahlength, hbase, height));

        }
    }
}