package com.Anisha;
import java.util.Scanner;


public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :  ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number  : ");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1 + " that is first number is  greater");}
        else{
            System.out.println(num2 + "  that is  second number is greater");}
        }

    }

