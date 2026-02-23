package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//Q.11 -> Print sum of number and it's reverse.

public class loop_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();

        int rev = 0;

        for(int i=n; i>0; i=i/10){
            rev = rev*10;
            rev = rev + (i%10);
//            n = n/10;
        }
        System.out.println(rev);
        System.out.println(rev+n);
    }
}
// Example n = 1276  to  reverse r - 6721
// add n + r = 1276 + 6721  = 7997