package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//Q.9 -> Print sum of digits of a number.
public class loop_9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; n!=0; i++){
            int h = n%10;
            sum = sum + h;
            n = n/10;
        }
        System.out.println(sum);
        System.out.println((sum>0) ? sum : -sum);    // we can use this for each loop for -ve numbers.
    }
}
