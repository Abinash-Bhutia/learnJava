package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

// Q.12 -> Factorial of a number.
// Example ->  5! = 5*4*3*2*1 = 120

public class factorial_loop_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter factorial of " + n +"! :" );

        int f = 1;

        for (int i=1; n>0; i++){
            f = f*n;
            n--;
        }
        System.out.println(f);
    }
}