package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//Q.13 -> 'a' raise to the power 'b'.

public class loop_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        int num = 1;
        for (int i=1; i<=b; i++){
            num = num*a;
            System.out.println(num);
        }
    }
}
