//Subtract the Product and Sum of Digits of an Integer
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
//Given an integer number n, return the difference between the product of its digits and the sum of its digits.



package com.Anisha;
import java.util.Scanner;

public class ProductSum {


    static int subtractProductAndSum(int n) {
         int  sum =0;
         int pro = 1;
         while(n>0){
        int rem = n%10;
             n /= 10;
             sum += rem;
             pro *= rem;
         }
         return pro - sum;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();
        System.out.println("Result :  " + subtractProductAndSum(n));
    }
    }
