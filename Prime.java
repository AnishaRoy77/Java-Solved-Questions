package com.Anisha;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Number ");
        int n = input.nextInt();
        if(n<=1){
            System.out.println("Neither Composite nor Prime");
            return;
        }
        int c = 2;
        if(n==4) {
            System.out.println("Not Prime");
        }else{
            while(c*c < n) {
            if(n%c==0){
                System.out.println("Not Prime");
            return;
            }
            c = c+1;
            //c++
            }
            if (c * c > n) {
                System.out.println("Prime Number");
            }
        }
    }
}
