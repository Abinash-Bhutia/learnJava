package DSA_Learn.Loops.patterns.numbers_Printing;

import java.util.Scanner;

public class vertically_Flipped_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}