package com.Anisha;
import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Rupees -->  Rs.");
        float rupees = input.nextFloat();
        float dollars = rupees/64;
        System.out.print("Dollars --> $" +  dollars);




    }
}
