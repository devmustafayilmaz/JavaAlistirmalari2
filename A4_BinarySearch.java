package JavaAlistirmalari2;

import java.util.Arrays;

public class A4_BinarySearch {
    public static void main(String[] args) {
        int[]arr={1,8,3,7,2,5,8,1};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 8));
    }
}
