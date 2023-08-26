package home_work;

public class Palindrome2 {
    public static void main(String[] args) {
        String word = "DigitalNomad";

        for (int i = 0; i < word.length(); i++){

            if (word.charAt(i)==' '){
                break;
            }
            else {
                System.out.print(word.charAt(i));
            }
        }
        //indexOf
    }

}
