package loops;

import java.util.Scanner;

public class Loops_ex2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       StringBuilder word1 = new StringBuilder();
       String word = scan.nextLine();
       char b = 'o';
        for (int i = 0; i < word.length(); i++) {
            if (i==b){
                continue;
            }
            System.out.print(word.charAt(i));

        }

    }

}
