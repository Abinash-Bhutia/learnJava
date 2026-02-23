package DSA_Learn.Loops.Loop_Basics;

import java.util.Scanner;

// Q.1 ->  Display this AP- 2,5,8,11,... upto 'n' terms.

public class loop_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // AP- 2,5,8,11,...   with AP formula
        for (int i=2; i<=3*n-1; i+=3) {
            System.out.print(i+" ");
        }

        System.out.println();

        // AP- 2,5,8,11,...   without AP formula
        int a = 2, d = 3;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
