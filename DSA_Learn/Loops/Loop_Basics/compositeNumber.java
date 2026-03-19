package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;
// Q.6 -> WAP to check the Composite Number or not.
// Which no. have without 1 & that no., any other factor that is composite number.

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        for(int i=2; i<=n-1; i++){
            if(n%i == 0){          // 'i' is a factor of 'n', Means this ia a Composite Number.
                System.out.println("It is a Composite Number");
                break;
            }
        }
    }
}