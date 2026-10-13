package Basics_java;

public class CharDataType {
    /*
    static void main(String[] args) {

        char nishant = 's';
        System.out.println(nishant);

        char shivam =  'n';
        System.out.println(shivam);

        char akash = '+';
        System.out.println(akash);
    }

     */
    static void main(String[] args) {
        // Type casting - ek data type se doosre data type conversion


        char ch = 'A';
        int X = ch; // implict type casting
        System.out.println(X);
        //


        char nishant  = 'a';
         int y = (int)nishant;// explict type casting
        System.out.println(y);
        //

        char prothoma = '3';
        System.out.println((int) prothoma);
        //


        char ds = 'b';
        System.out.println(ds);
        System.out.println(ds+ds);

        char fc = 'c';
        System.out.println(fc+0);
        System.out.println(fc*1);



        // integer to character
        int x = 43;
        char xy = (char)x;
        System.out.println(xy);
        //
        int z = 65;
        char yx = (char)z;
        System.out.println(yx);







    }

}
