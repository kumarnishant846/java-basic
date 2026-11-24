package loops;

import java.util.Scanner;

public class CompositeNumber {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();

        for(int i =2; i<=n-1; i++){
            if(n%i==0){// 'i' to 'n' ka ek factor nikla
                System.out.println("Composite number ");
                break;
            }
        }
    }

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int x =0; // o means prime
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                x=1; //  means composite
                break;
            }
        }
        if(x==1) System.out.println("Composite number");
        else System.out.println("Prime number");
    }
}
