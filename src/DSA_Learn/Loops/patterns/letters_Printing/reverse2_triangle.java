package DSA_Learn.Loops.patterns.letters_Printing;

import java.util.Scanner;

public class reverse2_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }
    }
}
