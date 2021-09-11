package com.Anisha;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1  : ");
        float num1 = input.nextFloat();

        System.out.print("Enter number 2  : ");
        float num2 = input.nextFloat();

        System.out.print("Enter an  operator(+,-,*,/)  : ");
        char c =input.next().charAt(0);


        if( c == '+' ){
            double addition = num1+num2;
            System.out.println("The addition of two numbers are :  "  + addition);}
        if(c == '-'){
            double subtraction  = num1-num2;
            System.out.println("The subtraction  of two numbers are :  "  + subtraction);}
        if(c == '*'){
            double multiplication  = num1*num2;
            System.out.println("The multiplication of two numbers are :  "  + multiplication);}
        if(c == '/'){
            double division  = num1/num2;
            System.out.println("The division of two numbers are :  "  + division);}


    }
}
