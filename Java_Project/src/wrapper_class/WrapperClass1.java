package wrapper_class;
public class WrapperClass1 {
    public static void main(String[] args) {
        // Primitive                   Non-primitive
// byte,                        Byte
// short,                       Short
// int,                         Integer
// long,                        Long
// float,                       Float
// double,                      Double
// char,                        Character
// boolean,                     Boolean
//
//                              String
//                              StringBuilder
//                              StringBuffer

        int num = 78;
        System.out.println(num);

        Integer num2 = 34;
        System.out.println(num2);
        System.out.println(num2.hashCode());

        Integer num3 = 27;

        Character ch = 'H';
        System.out.println(ch.hashCode());

// Autoboxing
// int --> Integer
        int n = 90;
        Integer b = n; // 90
        System.out.println(n);
        System.out.println(b);

// Unboxing
// Integer --> int
        Integer j = 78;
        int f = j; // 78
        System.out.println(j);
        System.out.println(f);

        System.out.println(Integer.max(b,j));
    }
}
