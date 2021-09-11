package com.Anisha;


import java.util.Scanner;

public class Armstrong {
    public static void main(String args[])
    {
        int sum, n1, n2, i, rem, temp, count=0;
        Scanner in = new Scanner(System.in);

        /* enter the interval between which number is printed */

        System.out.print("Enter the Interval :\n");

        System.out.print("Enter Starting Number :  ");
        n1 = in.nextInt();
        System.out.print("Enter Ending Number :  ");
        n2 = in.nextInt();

        // read numbers one-by-one and generate armstrong.
        for(i=n1+1; i<n2; i++)
        {
            temp = i;
            sum = 0;
            while(temp != 0)
            {
                rem = temp%10;
                sum = sum + rem*rem*rem;
                temp = temp/10;
            }
            if(i == sum)
            {
                // print all the armstrong number between given interval.
                if(count == 0)
                {
                    System.out.print("Armstrong Numbers from   " +  n1  +   "  to "  +  n2  +  "  is : \n");
                }
                System.out.print(i + "  ");
                count++;
            }
        }
        // print if no number found.
        if(count == 0)
        {
            System.out.print("Armstrong Number not Found between the Given Interval.");
        }
    }
}