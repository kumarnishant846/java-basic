package IF_else;

import java.util.Scanner;

public class sidesofAtriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side");
        int a = sc.nextInt();
        System.out.println("Enter 2st side");
        int b = sc.nextInt();
        System.out.println("Enter 3st side");
        int c = sc.nextInt();

        if(a+b>c & b+c>a & a+c>b)
        System.out.println("valid triangle");
        else System.out.println("not valid triangle");



    }
}
