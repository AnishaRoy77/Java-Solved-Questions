package com.Anisha;

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class ReverseString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Your text  : ");
        String input = sc.nextLine();

        // getBytes() method to convert string
        // into bytes[].

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]

        for (int i = 0; i < strAsByteArray.length; i++)

            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        System.out.print("Reversed Text : \n");
        System.out.println(new String(result));
    }
}