package methods;

public class AccessMethods2 {
    public static void main(String[] args) {
        System.out.println(sumOfTwoNums(23, 78));

        AccessMethods2 object = new AccessMethods2();
        System.out.println(object.sayHi("Alex"));

        StringBuilder sb1 = new StringBuilder("Clark");
        sb1.append(" Smith");
        sb1.insert(5, " De");

        System.out.println(sb1);

        sentMessage("Hello Lili");

    }

    // static method
    public static int sumOfTwoNums(int num1, int num2){
        System.out.println("This example about sum two numbers:");
        int result = num1 + num2;
        return result;
    }

    // non-static method
    public String sayHi(String name){
        return "Hi " + name;
    }

    // non-return method
    public static void sentMessage(String message){
        System.out.println("Your message is delivered");
    }

    // static method     --> call by name    --> sumOfTwoNums
    // non-static method --> call by object  --> object.sayHi

    // calling static methods --> same class    --> call by name
    // calling static methods --> another class --> call by ClassName.methodName

    // return method     --> data type = return
    // non-return method --> void = sout

    // return method            --> static / non-static
    // non-return(void) method  --> static / non-static

    // Home work with method

    // Palindrome:
    // kayak
    // madam
    // User: any word

}
