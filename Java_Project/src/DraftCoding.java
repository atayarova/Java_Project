import java.util.Scanner;

public class DraftCoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "abc";
        String b = "";
//        System.out.println(theEnd(scan.next(), true));
//        System.out.println(withouEnd2(scan.next()));
//        System.out.println(endsLy(scan.next()));
        System.out.println("res: " + conCat(a, b));
        System.out.println("LastTwo:"+lastTwo(scan.next()));

    }

//    public static String theEnd(String str, boolean front) {
//        return front == true ? str.substring(0, 1) : str.substring(str.length() - 1, str.length());
//    }

    //    public static String withouEnd2(String str) {
//        if (str.length() <= 1) {
//            return "";
//        }
//        else {
//            return str.substring(1, str.length() - 1);
//
//
//    }
//}
//public static boolean endsLy(String str) {
//    String str1 = str.substring(str.length() - 2, str.length());
//    String str2 = "ly";
//    int res = str.length();
//    System.out.println(res);
////    int i = str.length();
//    boolean b = str1.equalsIgnoreCase(str2) ? true : false;
//    return b;
//    if (str1.equalsIgnoreCase(str2)) {
//        return true;
//    } else if (str.length() == 0) {
//        return false;
//    } else {
//        return false;
//    }
//public static String middleThree(String str) {
//        if (str.length()<=3){
//            return str;
//        }
//        else {
//
//            return str.substring((str.length()/2)-1,(str.length()/2) + 2);
//        }
//
//}
    public static String conCat(String a, String b) {
        if (!(a.length() == 0 || b.length() == 0) && a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        } else return a + b;

    }

    public static String lastTwo(String str) {
        if (!(str.length() == 0 || str.length() == 1 )) {
          return (str.substring(0,str.length()-2)) + (str.charAt(str.length()-1))+(str.charAt(str.length()-2)) ;
        } else {
            return str;
        }


    }
    public String withoutX2(String str)
    {
        String word = "";
        for(int i=0; i<str.length(); i++)
        {
            if((i==0||i==1) && str.charAt(i)=='x')
                continue;
            word += str.charAt(i);
        }
        return word;
    }

}





