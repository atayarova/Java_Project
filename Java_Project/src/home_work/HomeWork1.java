package home_work;
import java.util.*;
import java.lang.*;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your weight: ");
        int weight = scan.nextInt();
        if (age <= 18){
            System.out.println("Age must be over 18");
        }
        else if (age >= 18 && weight >= 50){
            System.out.println("You are eligible to donate blood");
        }
        else  {
            System.out.println("You are not eligible to donate blood");
        }

    }
}
