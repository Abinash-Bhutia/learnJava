package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//Q.3 -> Display this GP - 1,2,4,8... upto 'n'

public class loop_3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

//        GP - 1,2,4,8... upto 'n'
        int a = 1, r = 2;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
