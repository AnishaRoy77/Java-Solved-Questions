// Multiplication table
package com.Anisha;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int  i ;
        for(i = 1 ; i <= 10; i++){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

}