import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int num = sc.nextInt();
        int sum = 0 ,  rem ;
        while(num > 0 ){
            rem = num%10;
            num = num/10;
            sum = sum + rem;
            
            }   
            System.out.println("The Sum of the given number  is : "  +  sum);     

    }
}
