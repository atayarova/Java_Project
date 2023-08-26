package string_builder;

public class SB1 {
    public static void main(String[] args) {

        String color = "red";
        String res1 = color.substring(1);
        System.out.println(color);

        String str1 = "one";
        String str2 = "two";
        String sum = str1.concat(str2);
        System.out.println(sum);

        StringBuilder sb1 = new StringBuilder(); // 16
        System.out.println(sb1.capacity());


        StringBuilder sb2 = new StringBuilder(5); // 5
        System.out.println(sb2.capacity());


        StringBuilder sb3 = new StringBuilder("Hello"); // 16 + 5 = 21
        System.out.println(sb3.capacity());
        System.out.println("____________");

        StringBuilder sb4 = new StringBuilder();                            // 16
        System.out.println(sb4.capacity() + " empty");
//      1234567890123456
//                  12345
        sb4.append("Salam");
        System.out.println(sb4.capacity() + " Salam");
//      1234567890123456
//                  1234567890123456789012 - 22 + 5 = 27
        sb4.append("I can buy some flowers");
        System.out.println(sb4.capacity() + " I can buy...");               // 34

//        123456789012345678901234567 - 27
//        SalamI can buy some flowers
//                  12345
        sb4.append("white");
//                  123          - 35
        sb4.append("who");
        System.out.println(sb4.capacity() + " white / who");                  // 70
        System.out.println((34 +1) * 2);
        System.out.println(sb4);

        // (oldCapacity + 1) * 2

        //               0123
        String color2 = "blue";
        //               1234

        StringBuilder s1 = new StringBuilder();           // 16
        StringBuilder s2 = new StringBuilder(6); // 6
        StringBuilder s3 = new StringBuilder("Hi");  // 16 + 2 = 18
        System.out.println(s3.capacity());

        // (oldCapacity + 1) * 2

        // append()
        StringBuilder sb5 = new StringBuilder();
        sb5.append('k');
        sb5.append(56);
        sb5.append(true);
        sb5.append("Salam");
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb5);
        System.out.println(sb6);

        // .toString

        StringBuilder sb7 = new StringBuilder("James Bond");
        System.out.println(sb7);

        int [] arr = {78,34,809,1};
        System.out.println(arr);
        System.out.println(arr.toString());

        // .insert()

        String str5 = "Hello";


    }
}