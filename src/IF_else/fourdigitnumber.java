package IF_else;

import java.util.Scanner;

public class fourdigitnumber {
    static void main() {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number:" );
        int n = sb.nextInt();
        //if(n>999 && n<10000)
         //   System.out.println("Enter four digit Number");
        //else System.out.println("Not four digit Number");
        if(n%5==0 || n%3==0)
            System.out.println("Divisible by 5 or 3");
        else
            System.out.println("Not Divisible");

    }
}
