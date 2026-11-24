package loops;

import java.util.Scanner;

public class ap {
    /*
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 4,8 ,16,22...
        for(int i =4; i<=3*n-1;i+=3){
            System.out.println(i+"  ");
        }
    }

     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2,5,8,11,14...
        int a= 2, d=3;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
