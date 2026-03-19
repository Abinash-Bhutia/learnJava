package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

// Q.10 -> Reverse of a number.

public class loop_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n = sc.nextInt();

        int rev = 0;

        for(int i=1; n>0; i++){
            rev = rev*10;
            rev = rev + (n%10);
            n = n/10;
        }
        System.out.println(rev);
    }
}
// Example - 1276  to reverse - 6721
// Formula ->
// 6 -> 60 -> 67 -> 670 -> 672 -> 6720 -> 6721.