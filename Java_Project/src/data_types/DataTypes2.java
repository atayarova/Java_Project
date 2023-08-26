package data_types;

public class DataTypes2 {
    public static void main(String[] args) {
        int num = 89;

        // Data types:
        // 1. Primitive      --> byte, short, int, long / float, double / char / boolean
        // 2. non-primitive  --> String

        // char    --> 'j'
        // String  --> "hello"


        String str = "Hello";
        String str2 = "k";

        char ch1 = ' ';

        char ch2 = 't';
        char ch3 = '9';
        char ch4 = 78;
        char ch5 = 239;
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);

        // A-Z a-z $ _

        float num4 = 78.4f;
        double num5 = 36.87;

        char symbol1 = 'Y';
        char symbol2 = 65;
        System.out.println(symbol1);
        System.out.println(symbol2);


        int num6 = 4567;

        // \n   \b   \t   \r   \"  \\

        System.out.println("Dear my friend \"Mr.Chocalate\"!");


        // Casting

        byte n1 = 78;
        byte n2 = 90;
        System.out.println(n1);  // 78
        System.out.println(n2);
        System.out.println(n1 + n2); // 78 + 90 = 168

        n1 = 42;
        n1 = 55;
        System.out.println(n1);

        byte n3 = 67;
        short n4 = 23;
        short n5 = n4; // 23
        System.out.println(n5);
        n5 = 20;
        System.out.println(n5);

        //    1 = 2
        // byte = short
        // -128/127 = -3223456/ 32456789
        // 67 = 20

        // 67
//      byte =(byte) short
        n3 = (byte)n5; // 20
        System.out.println(n3);

        int n6 = 284;
//      long = int
        long n7 = n6;

        long n8 = n5;


        long n9 = 28;
        byte n10 = (byte) n9;
        System.out.println(n10);

        int num7 = 78;
        double num8 = num7; // 78
        System.out.println(num8);

        int num9 = (int)num8;
        System.out.println(num9);

        double num10 = 56.8;
        System.out.println(num10);
        int num11 = (int) num10;
        System.out.println(num11);

        long nu1 = 130;
        byte  nu2 = (byte) nu1;
        System.out.println(nu2);
    }
}
