package IF_else;

import java.util.Scanner;

public class profitloss {
    /*
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP");
        int cp = sc.nextInt();
        System.out.println("Enter SP");
        int sp = sc.nextInt();
        if(sp>cp) System.out.println("Profit");
        else System.out.println("Loss");




    }



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP");
        int cp = sc.nextInt();
        System.out.println("Enter SP");
        int sp = sc.nextInt();
        if(sp>cp) System.out.println("Profit");
        if(cp>sp) System.out.println("Loss");
        if(cp==sp) System.out.println("No profit or No loss");

    }
    */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP");
        int cp = sc.nextInt();
        System.out.println("Enter SP");
        int sp = sc.nextInt();
       // if(sp>cp) System.out.println("Profit is "+ (sp-cp));
      //  if(cp>sp) System.out.println("Loss is "+(cp-sp));
      //  if(cp==sp) System.out.println("No profit or No loss");
        if(sp>cp) System.out.println("Profit is "+ (sp-cp));
          else if(cp>sp) System.out.println("Loss is "+(cp-sp));
          else System.out.println("No profit or No loss");




    }
}
