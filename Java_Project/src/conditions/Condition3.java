package conditions;

public class Condition3 {
    public static void main(String[] args) {

        if (67 == 78) { // false
            System.out.println(100);
            System.out.println();
            System.out.println();
        } else if (89 >= 23) { // true
            System.out.println(400);
            if (12 == 34) {
                System.out.println("YES");
            } else if (78 != 78) {
                System.out.println("YEAP");
            } else if (66 < 156) {
                System.out.println("OOPS");
                if (90 > 78) {
                    System.out.println("Salute");
                }
            }
        } else if (55 > 12) {
            System.out.println(300);
        } else {
            System.out.println(0);
        }

        String str = "Bishkek312sdfghjkjlkl/hgfdsazfxgchvj,klytrehsf";
        System.out.println(78);
        System.out.println("78");
        System.out.println('7');
        System.out.println(str); // "Bishkek312sdfghjkjlkl/hgfdsazfxgchvj,klytrehsf"
        System.out.println(str);
        System.out.println(str);
    }
}