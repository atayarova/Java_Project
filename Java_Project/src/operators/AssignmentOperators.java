package operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // =
        int num = 89;
        System.out.println(num);  // 89

        // +=

        num += 56; // 89 + 56 = 145
        System.out.println(num);

        // -=

        num -= 10; // 145 - 10 = 135
        System.out.println(num);

        // *=
        num *= 3; // 135 * 3 = 405
        System.out.println(num);

        // /=
        num /= 5; // 405 / 5 = 81
        System.out.println(num);

        // %=
        num %= 5; // 81 % 5 = 1;
        System.out.println(num);


    }
}