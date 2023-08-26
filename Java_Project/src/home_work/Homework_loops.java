package home_work;

public class Homework_loops {
    public static void main(String[] args) {
        //                                         01234567890
        StringBuilder res = new StringBuilder("MacBo okPro");

        int count = 0; // 0[], 1[o], 2[o]

//           0      11
        for (int i = 0; i < res.length(); i++) {

            if (res.charAt(i) == 'o' || res.charAt(i) == 'O') {
                count++; // 2
                if (count == 2) {
                    res.deleteCharAt(i);
                    break;
                }
            }
        }
        System.out.println(res);
    }

}
