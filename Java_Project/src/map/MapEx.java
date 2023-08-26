package map;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse = "";
        HashMap<Character, Character> result = new HashMap<>();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    result.put(ch, Character.toLowerCase(ch));
                }
            }
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome: " + reverse);
        } else {
            System.out.println("Its not a palindrome");
        }
        for (Character key : result.keySet()) {
            Character value = result.get(key);
            System.out.println(key + " " + value);
        }
    }
}
