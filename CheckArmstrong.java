import java.util.Scanner;

public class CheckArmstrong
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :  ");
        int n = in.nextInt();
        int sum =0;
        int original = n;
        while(n > 0){
            int rem = n%10;
            n = n/10;
            sum = sum + (rem * rem * rem);
        } if (sum == original){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }
      

    }
    
}
