package IF_else;

import java.util.Scanner;

public class Greatestofthree {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no: ");
        int c = sc.nextInt();

       // if(a>b && a>c) System.out.println(a);
        //if(b>c && b>a) System.out.println(b);
        //if(c>b && c>a) System.out.println(c);

        if(a>b && a>c) System.out.println(a);
        else if (b>c && b>a) System.out.println(b);
        else System.out.println(c);

    }
}
