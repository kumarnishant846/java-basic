package Basics_java;

public class IncrementDecrement {
    /*
    static void main(String[] args) {
        int monu = 10;
        System.out.println(monu);
        System.out.println(monu +10);
        System.out.println(monu *5);

        int neutron = 5;
        system.out.println(neutron);
        neutron = neutron +5;
        system.out.println(neutron);
        neutron = neutron*5;
        system.out.println(neutron);

    }

     */
    static void main() {
        int x = 10 ;
        System.out.println(x);
        x = x+7;
        System.out.println(x);
        x = x*4;
        System.out.println(x);

        x+=4;
        System.out.println(x);
        x-=5;
        System.out.println(x);

        x++;
        System.out.println(x);

        ++x;
        System.out.println(x);

        x--;
        System.out.println(x);

        --x;
        System.out.println(x);

        int y  = 10;
        System.out.println(y++);
        System.out.println(y);

        System.out.println(++y);
        System.out.println(y);
        //

        int a = 10;
        int b= a++;//b = 10
        System.out.println(a+" " + b);

        int c = 5;
        int d = ++c;
        System.out.println(c+"" +d);



    }
}
