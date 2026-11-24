package loops;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0) n = -n;
        int sum = 0;
        while(n != 0){
            sum = sum + n%10;
            n = n/10;

        }
        System.out.println(sum);

    }
}
