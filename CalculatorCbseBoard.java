package com.Anisha;
import java.util.Scanner;

public class CalculatorCbseBoard {
    public static void main(String []args){

        System.out.println("Welcome To Exam Marks Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Marks Of The Subjects : ");
        int total_marks = sc.nextInt();
        System.out.println("Marks Scored in Subject1  : ");
        int subject1 = sc.nextInt();
        System.out.println("Marks Scored in Subject2  : ");
        int subject2 =sc.nextInt();
        System.out.println("Marks Scored in Subject3  : ");
        int subject3 = sc.nextInt();
        System.out.println("Marks Scored in Subject4  : ");
        int subject4 = sc.nextInt();
        System.out.println("Marks Scored in Subject5  : ");
        int subject5 = sc.nextInt();


        int Scored_Marks = (subject1+subject2+subject3+subject4+subject5);
        System.out.println(" Marks Scored :  " + Scored_Marks);
        System.out.println("Out Of Marks :  " + (total_marks*5));
        float Percentage =((Scored_Marks)/500.0f)*total_marks;
        System.out.println("Percentage of Overall Scored Marks  :   " + Percentage);

        if(Percentage >= 90){
            System.out.println("Excellent: Grade A");
        }else if(Percentage < 90 && Percentage >= 80){
            System.out.println("Very Good: Grade B");
        }else if(Percentage < 80 && Percentage >= 70){
            System.out.println("Good: Grade C");
        }else if(Percentage < 70 && Percentage >= 60){
            System.out.println("Satisfactory: Grade D");
        }else if(Percentage < 60 && Percentage >= 50){
            System.out.println("Work Hard: Grade E");
        }else if(Percentage < 50 && Percentage >= 40){
            System.out.println("Just Passed: Grade F");
        }else {
            System.out.println("Failed!");
        }
        System.out.println("Thank You ! Have a Nice Day  ");
    }

}





