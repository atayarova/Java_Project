package arrays;

import java.util.Arrays;
public class Arrays2 {
    public static void main(String[] args) {
        // fixed size
        // same data type
        //1
        int[]nums=new int[2];
        nums[1]=53;
        nums[0]=23;
        System.out.println(Arrays.toString(nums));
        //2
        int nums2[]=new int[]{34,89,11,91,23};
        System.out.println(nums2.length);
        System.out.println(Arrays.toString(nums2));
        System.out.println(nums2[2]);
        System.out.println(nums2[nums2.length-1]);//23
        System.out.println(nums2[0+1]);
        //3
        int nums3[]={34,78,11,22};
        String listOfElements=Arrays.toString(nums3);
        System.out.println("List"+listOfElements);

        System.out.println(Arrays.toString(nums3));

        // Arrays.sort()
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));

        //
        System.out.println(Arrays.binarySearch(nums3,22));

        for(int i:nums3){
            System.out.print(i+" ");
        }
    }
}
