package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//HW Q.2 -> Print this series - 99, 95, 91, 87... upto all terms which are positive.

public class loop_2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // AP - 99, 95, 91, 87... upto only positive numbers.
        int a = 99, b = 4;
        for (int i = 1; i <= n; i++){
            if(a>0){
                System.out.print(a+" ");
            }
            a -= b;
        }
    }
}
