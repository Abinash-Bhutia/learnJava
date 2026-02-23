package DSA_Learn.Loops.patterns.stars_Printing;
import java.util.Scanner;

public class reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
