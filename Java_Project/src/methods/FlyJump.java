package methods;

import java.util.Scanner;
public class FlyJump {
    public static void main(String[] args) {
        System.out.println(condition(34, 124, true, true));
    }
    public static boolean condition(int age, float weight, boolean payment, boolean contract){
        if (age >= 18 && weight <= 120 && payment && contract){
            return true;
        } else {
            return false;
        }
    }
//    public static boolean canFly(int yourAge, float yourWeight, boolean paid, boolean contractSigned) {
//        // priceList (drone, gopro, classic)
//        // Scanner
//        // instead of true return priceList
//        //
//        return ;
//    }
}
