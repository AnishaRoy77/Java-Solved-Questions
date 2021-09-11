// Print no of even days in a month.

package com.Anisha;
import java.util.Scanner;

public class EvenDays {
    public static void main(String[] args) {
        int even;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month  : ");
        System.out.print("January, February, March, April, May, June, July, August, September, October, November, December : ");
        String month = sc.next();
        switch (month) {

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                even = 31 / 2;
                System.out.println("No of Even days in  " +  month  + " is :  "  +  even);
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                even = 30 / 2;
                System.out.println("No of Even days in  " +  month  + " is :  "  +  even);
                break;

            case "February":
                System.out.println("Enter year : ");
                int year = sc.nextInt();
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Leap Year");
                    even = 29 / 2;
                    System.out.println("No of Even days in  " +  month  + " is :  "  +  even);;
                    break;
                } else {
                    System.out.println("Not Leap Year.");
                    even = 28 / 2;
                    System.out.println("No of Even days in  " +  month  + " is :  "  +  even);
                    break;
                }
            default:
                System.out.println("Unexpected value: " + month);
        }
    }
}

