package loops;

public class Loops1 {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 3; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n_________");

        // while loop
        int n = 1;
        while (n < 5){
            System.out.print(n + " ");
            n++;
        }
        System.out.println("\n_________");


        // do-while loop
        int k = 1;

        do {
            System.out.print(k + " "); // [1 2 3 4 ]
            k++; // 5
        }
        while (k < 5);
    }
}
