package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

// Q.4 -> Print all alphabets with their corresponding ASCII values.
// example -> A.65, B.66, C.67, D.68...
public class loop_5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

         for(int i=65; i<=90; i++){
             System.out.println((char)i+ "." + i);
         }
    }
}
