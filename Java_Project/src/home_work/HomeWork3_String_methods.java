package home_work;
import java.util.*;
import java.lang.*;

public class HomeWork3_String_methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name: ");
        String name = scan.nextLine();
        System.out.println("Your Name: " + name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase());
    }
}
