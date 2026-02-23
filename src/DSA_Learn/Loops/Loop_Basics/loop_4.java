package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//HW Q.4 -> Take 'n' as input from user and print the following sequence.
//  let input n = 10, sequence is -> 1, 10, 2, 9, 3, 8, 4, 7, 5, 6, 6, 5, 7, 4, 8, 3, 9, 2, 10, 1.

public class loop_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         for(int i=1; i<=n; i++){

             System.out.println(i);
             System.out.println(n-i);

         }
    }
}
