package home_work;

import java.util.Scanner;

public class HomeWork_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите слово:");
        System.out.println(Palindrome(scan.nextLine()));
    }
    public static String Palindrome (String word){
        StringBuilder check_word = new StringBuilder(word).reverse();
        System.out.println(check_word);
        String result = check_word.toString().equalsIgnoreCase(word) ? "This word is a Palindrome":"This word is not a Palindrome";
        return result;
    }
}
