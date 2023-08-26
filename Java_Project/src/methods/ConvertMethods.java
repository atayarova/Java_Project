package methods;

public class ConvertMethods {
    public static void main(String[] args) {
        System.out.println(dollarToSom());
        System.out.println(euroToSom(95.5f));
        System.out.println(tengeToSom(0.19f,50));
        System.out.println(capacity(17));

    }
    public static double dollarToSom(){
        double course = 86.2;
        int dollar = 100;
        double result = dollar * course;
        return result;
    }
    public static float euroToSom(float course){
        int euro =100;
        float result = euro * course;
        return result;
    }
    public static float tengeToSom(float course,int tenge){
        float result = tenge * course;
        return result;
    }
    public static int capacity (int old_capacity ){
        int result = (old_capacity+1)*2;
        return result;
    }

    // static
    // Current class
    // static methods can call only static methods

    // Another class
    // NameOfClass.nameOfStaticMethod


}
