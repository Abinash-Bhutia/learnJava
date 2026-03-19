package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;

//Q.8 -> Count digits of a number.

public class loop_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n==0) n=5;                // This is use because '0' is also a digit, when anyone give input of '0', we can change that.

        int count = 0;
        for(int i=1; n!=0; i++){
            n = n/10;
            count++;
        }
        System.out.println(count);

    }
}
