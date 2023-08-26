package string_builder;

public class SB2 {
    public static void main(String[] args) {
        //.insert()
        //                                     012345
        StringBuilder sb1 = new StringBuilder("London");
        sb1.insert(2,89); //Lo89ndon
        sb1.insert(5,"UK"); //Lo89nUKdon
        System.out.println(sb1);


        //.replace()                           01234
        StringBuilder sb2 = new StringBuilder("japan");
        sb2.replace(0,3,"China"); //Chinaan
        System.out.println(sb2);

        //.reverse()
        StringBuilder sb3 = new StringBuilder("Java");
        sb3.reverse();
        System.out.println(sb3);

        //.delete()                            01234
        StringBuilder sb4 = new StringBuilder("Phone");
        sb4.delete(0,2);  //       012
        System.out.println(sb4); //one

        //.deleteCharAt()
        sb4.deleteCharAt(1);
        System.out.println(sb4); // oe
    }
}
