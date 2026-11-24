package patternprintimg;

import java.util.Scanner;

public class NoOfStarHorFlippedinTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n; // no of star to be printed in each line
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("*" + " ");
            }
            a--;
            System.out.println();
        }


    }
}
