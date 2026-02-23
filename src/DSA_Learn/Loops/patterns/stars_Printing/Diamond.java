package DSA_Learn.Loops.patterns.stars_Printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pr = 1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=pr; k++){
                System.out.print("* ");
            }
            pr +=2;
            System.out.println();
        }

        pr = 2*n-3;

        for (int i=1; i<n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=pr; k++){
                System.out.print("* ");
            }
            pr -=2;
            System.out.println();
        }
    }
}
