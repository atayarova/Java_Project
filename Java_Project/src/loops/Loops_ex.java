package loops;

public class Loops_ex {
    public static void main(String[] args) {
        String word = "Digital Nomad";
        System.out.println(Check(word));

        }
    public static StringBuilder Check(String word){
        int n = 8;
        int m = word.length();
        StringBuilder result = new StringBuilder();
        while (n < m) {
            result.append(word.charAt(n));
            n++;
        }
        return result;
    }
}
