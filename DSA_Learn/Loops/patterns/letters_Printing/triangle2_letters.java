package DSA_Learn.Loops.patterns.letters_Printing;

import java.util.Scanner;

public class triangle2_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}
