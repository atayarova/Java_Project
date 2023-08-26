package operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // FALSE
        // true  &&  true  = true
        // false &&  false = false
        // true  &&  false = false
        // false &&  true  = false

        //                 true   && false
        boolean result1 = 78 > 45 && 34 == 89;
        //                false    && true
        boolean result2 = 77 == 54 && 89 > 23;
        System.out.println(result2);
        //                true     && false
        boolean result3 = 28 == 28 && 54 < 12;
        System.out.println(result3);
        //                true     && true
        boolean result4 = 77 == 77 && 39 > 11;
        System.out.println(result4);
        System.out.println("__________");

        // TRUE
        // true  ||  true  = true
        // false ||  false = false
        // true  ||  false = true
        // false ||  true  = true

        //             true    || true
        boolean res1 = 67 > 34 || 78 < 100;
        System.out.println(res1);
        //             false    || false
        boolean res2 = 89 > 100 || 45 < 12;
        System.out.println(res2);
        //             true     || false
        boolean res3 = 88 == 88 || 54 > 79;
        System.out.println(res3);
        //             false   || true
        boolean res4 = 75 < 35 || 84 == 84;
        System.out.println(res4);

        // !

        boolean res5 = !(67 == 89); // (ture) == true  /   !(true) = false
        System.out.println(res5);
    }
}
