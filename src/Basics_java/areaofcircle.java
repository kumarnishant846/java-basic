package Basics_java;


import java.util.Scanner;

public class areaofcircle {
    /*

    static void main(String[] args) {
        // area kya hota hai ;


        double r = 5.4;
        double a = 3.14 * r* r;
        System.out.println(a);
        
    }
  */
    /*
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double r = sc.nextInt();89
        double a = 3.14 * r* r ;
        System.out.println(a)
    }
     */
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double r = sc.nextDouble();
        double a = 3.14592 * r * r ;
        System.out.println(a);
    }
}
