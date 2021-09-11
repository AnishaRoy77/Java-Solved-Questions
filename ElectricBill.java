package com.Anisha;

import java.util.Scanner;
import java.util.*;

public class ElectricBill {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long units;
        double billpay=0;

        System.out.println("1 to 100 units – Rs. 10/unit");
        System.out.println("100 to 200 units – Rs. 15/unit");
        System.out.println("200 to 300 units – Rs. 20/unitt");
        System.out.println("above 300 units – Rs. 25/unit\n");



        System.out.println("Enter units : ");
        units = input.nextLong();

        // Condition to find the charges
        // bar in which the units consumed
        // is fall


        if(units<100){
            billpay=units*10;

        }

        else if(units<300){
            billpay=(100 * 10)+ (100 * 15)+ (units - 200)* 20;
        }

        else if(units>300){
            billpay=(100 * 10)+ (100 * 15)+ (100 * 20)+ (units - 300)* 25;
        }

        System.out.println("Bill to pay : " + "Rs."  + billpay);
    }
}