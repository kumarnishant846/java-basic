package IF_else;

import java.util.Scanner;

public class absolutevalue {
    static  void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sb.nextInt();
        if(n>=0) System.out.println(n);
        else System.out.println(-n);

        if(n<0) n = -n;
        System.out.println(n);


    }
}
