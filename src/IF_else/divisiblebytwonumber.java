package IF_else;

import java.util.Scanner;

public class divisiblebytwonumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        if(a%5==0 && a%3==0)
            System.out.println("Nishant");
        else if (a%5==0)
            System.out.println("Monu");
        else if (a%3==0)
            System.out.println("Prshant");
        else
            System.out.println("Shivam");


    }
}
