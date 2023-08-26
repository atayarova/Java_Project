package conditions;

public class Condition2 {
    public static void main(String[] args) {

//        int age = 1;
        //         false
        //   true         false
        //  1100 > 16     1100 <= 110
//        if (age >= 16 && age <= 110){
//            System.out.println("Get Passport");
//        }
//        else {
//            System.out.println("Can not get a passport");
//        }

        // if else ladder

        int age1 = 16;

        if (age1 >= 0 && age1 < 16) {
            System.out.println("International PASSPORT");
        } else if (age1 >= 16 && age1 <= 110) {
            System.out.println("ID PASSPORT || International PASSPORT ++++++++++++++");
        } else {
            System.out.println("NO PASSPORT");
        }

        System.out.println("__________");

        int age2 = 111;

        if (age2 >= 0 && age2 < 12) {
            System.out.println("CHILD");
        } else if (age2 >= 12 && age2 < 18) {
            System.out.println("TEENAGER");
        } else if (age2 >= 18 && age2 <= 110) {
            System.out.println("ADULT");
        } else {
            System.out.println("NOT VALID AGE");
        }

        System.out.println("==============");

//        Scanner scan = new Scanner(System.in);
//        char gradeLetter = ' ';
//        System.out.println("What is your grade?");
//        int grade = scan.nextInt();
//        if (grade >= 90 && grade <= 100) {
//            gradeLetter = 'A';
//        } else if (grade >= 70 && grade <= 89) {
//            gradeLetter = 'B';
//        } else if (grade >= 40 && grade <= 69) {
//           gradeLetter = 'C';
//        } else if (grade >= 0 && grade <= 39) {
//            gradeLetter = 'D';
//        } else {
//            System.out.println("Not grade");
//        }
//
//        System.out.println(gradeLetter);


//       | 0.....39 | 40......69 | 70........89 | 90........100 |
//         0 < 39 = 0 1 2 3 .... 37 38
//         0 <= 40 = 0 1 2 3.... 37 38 39 40

        System.out.println("__________________");

        // nested if

        boolean citizen = false;
        int age3 = 78;

        if (citizen == true){
            System.out.println("KG citizen");
            if (age3 >= 16){
                System.out.println("Get ID PASSPORT");
            } else {
                System.out.println("Not valid age for ID passport");
            }
        } else {
            System.out.println("You are not a citizen of KG");
        }

        System.out.println("____________");

        if (citizen == true && age3 >= 16){
            System.out.println("You are KG citizen and you can get ID Passport");
        } else {
            System.out.println("No Passport");
        }



    }
}

// redundant
// optional

//A -> 90 - 100
//B -> 70 - 99
//C -> 40 - 69
//d ->  < 40

