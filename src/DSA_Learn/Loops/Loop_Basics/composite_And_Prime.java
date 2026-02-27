package DSA_Learn.Loops.Loop_Basics;
import java.util.Scanner;
// Q.7 -> WAP to check that given no. is Composite or prime number.
// which no. factor only 1 & that no. is the prime no.

public class composite_And_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        boolean flag = true;   

        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }


        if(n==1) System.out.println("Neither Prime nor Composite");
        else if(flag == false) System.out.println("Composite number");
        else System.out.println("Prime number");
    }
}

// break -> break the code if condition is matched.
// continue -> skip the point or code if condition is matched.