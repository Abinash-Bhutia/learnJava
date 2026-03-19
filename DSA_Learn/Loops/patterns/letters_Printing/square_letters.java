package DSA_Learn.Loops.patterns.letters_Printing;

import java.util.Scanner;

public class square_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
