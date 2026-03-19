package DSA_Learn.Loops.patterns.numbers_Printing;

import java.util.Scanner;

public class Binary_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++){
                if ((i + j) % 2 == 0) {               // i+j even is print 1.  &  i+j odd is print 0.
                    System.out.print(1+" ");
                }else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
