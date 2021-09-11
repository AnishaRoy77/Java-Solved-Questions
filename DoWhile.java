package com.Anisha;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Start Number :  ");
        int n = in.nextInt();
        System.out.print("Enter last range till where the numbers to be printed : ");
        int num = in.nextInt();

        do{
            System.out.println(n);
            n++;
        }while(n <= num);
    }
}
