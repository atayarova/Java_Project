package switch1;

public class SwitchCondition1 {
    public static void main(String[] args) {
        int number = 11678;

        switch (number){
            default:
                System.out.println("NO season");
                break;
            case 110 :
                System.out.println("Ch.Aitmatov");
                System.out.println("L.Tolstoy");
                break;
            case 2 :
                System.out.println("Spring");
                break;
            case 332 :
                System.out.println("Summer");
                break;
            case 4 :
                System.out.println("Fall");
                break;
        }

        System.out.println("__________");

        String season = "Spring" +
                "";
        switch (season){
            default:
                System.out.println("NO SEASON");
                break;
            case "Winter" :
                System.out.println(1);
                break;
            case "Spring" :
                System.out.println(2);

            case "Summer" :
                System.out.println(3);
                break;
            case "Fall" :
                System.out.println(4);
        }

        System.out.println("__________");

        char gender = 'f';
        switch (gender){
            default:
                System.out.println("LGPT");
                break;
            case 'm' :
                System.out.println("Male");
                break;
            case 'f':
                System.out.println("Female");
        }


    }
}