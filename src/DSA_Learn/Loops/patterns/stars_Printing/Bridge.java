package DSA_Learn.Loops.patterns.stars_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int q=1; q<=2*n-1; q++){
            System.out.print("* ");
        }
        System.out.println();

        int st = 1;

        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=st; k++){
                System.out.print("  ");
            }
            st+=2;
            for (int p=1; p<=n-i; p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}