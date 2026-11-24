package IF_else;

import java.util.Scanner;

public class ternaryBasic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

       // if (n % 2 == 0) System.out.println("Even");
     //   else System.out.println("Odd");
     //   condition sach ya jhoot?

        System.out.println((n%2==0 ) ? "Even" : "Odd");
        System.out.println(n+""+((n%2)==0 ? "Even" : "Odd"));
    }
}
