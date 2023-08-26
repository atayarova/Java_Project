package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int arrs [] = new int[3];
        System.out.println(Arrays.toString(arrs));

        String str[] = {"Aloha", "Salam", "Hola"};

        int numbers1[][] = new int[2][3];
        numbers1[0][0] = 23;
        numbers1[0][1] = 36;
        numbers1[0][2] = 19;
        numbers1[1][0] = 1110;
        numbers1[1][1] = 298;
        numbers1[1][2] = 372;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(numbers1[1][0]);
        Arrays.sort(numbers1[0]);
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.binarySearch(numbers1[0], 23));

//        [ [     0    ]  , [       1     ] ]
//        [ [23, 36, 19]  , [110, 298, 372] ]
//            0,  1,  2        0,   1,   2

        //                  {{  0  }, {    1   }, {      2      }}
        int numbers2 [][] = {{4,7,1}, {67,34,12}, {900, 345, 718}};
        //                    0,1,2     0, 1, 2      0,    1,   2

        System.out.println(numbers2[2][0]);
        System.out.println(Arrays.deepToString(numbers2));
        Arrays.sort(numbers2[2]);
        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(Arrays.toString(numbers2[2]));

//                         { {  0  },  {  1  }}
        int number3 [][] = { {2,4,8},  {5,7,1}};
//                         { {0,1,2},  {0,1,2}}
        System.out.println(Arrays.deepToString(number3));
        System.out.println("_______");

        //           0      2
        for (int i = 0; i < number3.length; i++){
//          0 --> {0,1,2},
//          1 --> {0,1,2},
//                       0       3
            for (int j = 0; j <= number3.length; j++){
//              0 (2, 4, 8)
//              1 (5, 7, 1)

//                               number3[0][2]
//                               number3[0][4]
//                               number3[0][8]
//                               number3[1][5]
//                               number3[1][7]
//                               number3[1][1]

                System.out.print(number3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
