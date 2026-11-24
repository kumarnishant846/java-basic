package IF_else;

import java.util.Scanner;

public class ternaryvariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();

        //int nishant
        //if(n>=100) nishant = 100;
       // else  nishant = 0

        int nishant = (n>=100)? 100:0;
        System.out.println(nishant);
    }

}
