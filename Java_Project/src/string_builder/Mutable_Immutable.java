package string_builder;

public class Mutable_Immutable {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        boolean res1 = str1==str2;
        boolean res2 = str1.equals(str2);
        System.out.println(res1);
        System.out.println(res2);

        System.out.println("------------------------------------------------------------");

        StringBuilder sb1 = new StringBuilder("HTML");
        StringBuilder sb2 = new StringBuilder("HTML");
        boolean res3 = sb1 == sb2;
        boolean res4 = sb1.equals(sb2);
        System.out.println(res3);
        System.out.println(res4);

        boolean res5 = sb1.toString().equals(sb2.toString());
        System.out.println(res5);

        System.out.println("------------------------------------------------------------");
        //                   // hashcode                          // pool
        String str4 = "Sun"; // 83500 SUN
        String str5 = "Sun"; // 83500 SUN                            // sun -> 83500     // SUN -> 82476
        String res8 = str5.toUpperCase();
        System.out.println("res8 " + res8.hashCode());
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());

        String str6 = new String("Sun"); // SUN
        System.out.println(str6.hashCode());

        System.out.println(str4 == str5); // true
        System.out.println(str4 == str6); // false

        StringBuilder sb5 = new StringBuilder("Sun");         // heap -->  Sun
        System.out.println(sb5.hashCode()); // 1554874502

        System.out.println(str4.equals(str5)); // true
        System.out.println(str4.equals(str6)); // true
        System.out.println(str4.equals(sb5)); // false
        System.out.println(str6.equals(sb5)); // false

        str6 = str5;
        System.out.println(str4 == str6);
        System.out.println(str4.equals(str6));

        System.out.println("------------------------------------------------------------");

        String s1 = "JAVA";
        String s2 = new String("JAVA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());








// ==        --> links
// .equals() --> values


    }
}
