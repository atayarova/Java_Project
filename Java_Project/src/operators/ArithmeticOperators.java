package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // +
        int num1 = 78;
        int num2 = 23;
        int result1 = num1 + num2;
        System.out.println(result1);

        // -
        int result2 = result1 - num2;
        System.out.println(result2);

        // *
        int num3 = 2;
        int result3 = 22 * 2;
        System.out.println(result3);

        // /
        int result4 = result3 / 4;
        System.out.println(result4);
        System.out.println(8 / 2);
        System.out.println(7 / 3); // 2

        // %
        int result5 = 7 % 3;
        System.out.println(result5);

        System.out.println(4 / 2);
        System.out.println(4 % 2);
        System.out.println("_______________");

        // ++ increment
        // prefix ++num
        int n1 = 1;               // 1
        System.out.println(++n1); // 2
        System.out.println(++n1); // 3
        System.out.println(++n1); // 4
        System.out.println("_______________");

        // postfix num++
        int n2 = 2;
        System.out.println(n2++); // 2 [3]
        System.out.println(n2++); // 3 [4]
        System.out.println(n2++); // 4 [5]
        System.out.println(n2++); // 5 [6]
        System.out.println(n2);
        System.out.println("_______________");

        // -- decrement
        // prefix --num
        int n3 = 6;

        System.out.println(--n3); // 5
        System.out.println(--n3); // 4
        System.out.println(--n3); // 3
        System.out.println(--n3); // 2

        System.out.println("_______________");
        // postfix num--

        int n4 = 4;
        System.out.println(n4--); // 4 [3]
        System.out.println(n4--); // 3 [2]
        System.out.println(n4--); // 2 [1]
        System.out.println(n4--); // 1 [0]
        System.out.println(n4--); // 0 [-1]
        System.out.println(n4);
        System.out.println("_______________");


    }
}